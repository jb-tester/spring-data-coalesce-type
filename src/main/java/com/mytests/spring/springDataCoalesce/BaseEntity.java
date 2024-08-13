package com.mytests.spring.springDataCoalesce;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.math.BigDecimal;

@MappedSuperclass
public class BaseEntity {
    @Id @GeneratedValue
    private Integer id;



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

    public BaseEntity(BigDecimal bd, Long aLong) {
        this.bd = bd;
        this.aLong = aLong;
    }

    public BaseEntity() {
    }

    public Integer getId() {
        return id;
    }

   }
