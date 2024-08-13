package com.mytests.spring.springDataCoalesce;

import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
public class SomeEntity extends BaseEntity {
    String name;

    public SomeEntity() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SomeEntity(String name, BigDecimal bd, Long f) {
        super( bd, f);
        this.name = name;
    }

    @Override
    public String toString() {
        return "SomeEntity{" +
               "id='" + super.getId() + '\'' +
               ", name='" + name + '\'' +
               ", bd='" + super.getBd() + '\'' +
               ", aLong='" + super.getaLong() + '\'' +
               '}';
    }
}
