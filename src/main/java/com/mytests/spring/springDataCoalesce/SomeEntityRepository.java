package com.mytests.spring.springDataCoalesce;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;


public interface SomeEntityRepository extends JpaRepository<SomeEntity, Long>, BaseRepository {

    // query with explicit entity:
    // COALESCE(BIGDECIMAL) is considered to have INT type
    @Query("""
           select
            new com.mytests.spring.springDataCoalesce.Test1(
                coalesce(ic.bd, :arg))
           from SomeEntity ic
           """)
    List<Test1> test0(@Param("arg") BigDecimal arg);

    // COALESCE(INTEGER) - ok
    @Query("""
           select
            new com.mytests.spring.springDataCoalesce.Test0(
                coalesce(ic.id, :arg))
           from SomeEntity ic
           """)
    List<Test0> test00(@Param("arg") int arg);

    // COALESCE(DOUBLE) is considered to have INT type
    @Query("""
           select
            new com.mytests.spring.springDataCoalesce.Test4(
                coalesce(ic.aDouble, :arg))
           from SomeEntity ic
           """)
    List<Test4> test000(@Param("arg") Double arg);

    // shouldn't work actually - single-argument coalesce
    @Query("select e from SomeEntity e where coalesce(:args) is null or e.aDouble in :args")
    List<SomeEntity> oneArgCoalesce(List<Double> args);
}