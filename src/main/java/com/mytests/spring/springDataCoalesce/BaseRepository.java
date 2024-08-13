package com.mytests.spring.springDataCoalesce;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BaseRepository {


    // SUM(COALESCE(BIGDECIMAL)) is considered to have Long type here
    @Query("""
           select
            new com.mytests.spring.springDataCoalesce.Test1(
                sum(coalesce(ic.bd, 0.0)))
           from #{#entityName} ic
           where ic.id = :userId
           
           """)
    Test1 test1(@Param("userId") Long userId);

    // SUM(COALESCE(BIGDECIMAL)) to LONG - error should be reported
    /*@Query("""
           select
            new com.mytests.spring.springDataCoalesce               sum(coalesce(ic.bd, 0.0)))
           from #{#entityName} ic
           where ic.id = :userId
           
           """)
    Test2 test21(@Param("userId") Long userId);*/

    // SUM(BIGDECIMAL) to BIGDECIMAL - ok
    @Query("""
           select
            new com.mytests.spring.springDataCoalesce.Test1(
                sum(ic.bd))
           from #{#entityName} ic
           where ic.id = :userId
           
           """)
    Test1 test11(@Param("userId") Long userId);

    // SUM(COALESCE(LONG)) to LONG - ok
    @Query("""
           select
            new com.mytests.spring.springDataCoalesce.Test2(
                sum(coalesce(ic.aLong, 0.0)))
           from #{#entityName} ic
           where ic.id = :userId
           
           """)
    Test2 test2(@Param("userId") Long userId);


    // SUM(LONG) to LONG - ok
    @Query("""
           select
            new com.mytests.spring.springDataCoalesce.Test2(
                sum(ic.aLong))
           from #{#entityName} ic
           where ic.id = :userId
           
           """)
    Test2 test22(@Param("userId") Long userId);

   // SUM(LONG) to String - error should be reported
  /* @Query("""
           select
            new com.mytests.spring.springDataCoalesce               sum(ic.aLong))
           from #{#entityName} ic
           where ic.id = :userId
           
           """)
    Test2 test3(@Param("userId") Long userId);
*/
}
