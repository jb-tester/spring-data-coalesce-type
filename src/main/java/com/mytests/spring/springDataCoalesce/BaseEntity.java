package com.mytests.spring.springDataCoalesce;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.math.BigDecimal;

@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue
    private Integer id;


    Double aDouble;
    BigDecimal bd;
    Long aLong;

    public BigDecimal getBd() {
        return bd;
    }

    public void setBd(BigDecimal bd) {
        this.bd = bd;
    }

    public Long getaLong() {
        return aLong;
    }

    public void setaLong(Long aLong) {
        this.aLong = aLong;
    }

    public Double getaDouble() {
        return aDouble;
    }

    public void setaDouble(Double aDouble) {
        this.aDouble = aDouble;
    }

    public BaseEntity(BigDecimal bd, Long aLong, Double aDouble) {
        this.bd = bd;
        this.aLong = aLong;
        this.aDouble = aDouble;
    }

    public BaseEntity() {
    }

    public Integer getId() {
        return id;
    }

   }
