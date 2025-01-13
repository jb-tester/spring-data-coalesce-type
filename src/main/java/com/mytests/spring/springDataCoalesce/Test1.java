package com.mytests.spring.springDataCoalesce;

import java.math.BigDecimal;

/**
 * *
 * <p>Created by irina on 8/13/2024.</p>
 * *
 */
public class Test1 {
    BigDecimal bd;

    public Test1(BigDecimal bd) {
        this.bd = bd;
    }

    public BigDecimal getBd() {
        return bd;
    }

    public void setBd(BigDecimal bd) {
        this.bd = bd;
    }

    @Override
    public String toString() {
        return "Test1{" +
               "bd=" + bd +
               '}';
    }
}
