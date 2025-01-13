package com.mytests.spring.springDataCoalesce;

/**
 * *
 * <p>Created by irina on 8/13/2024.</p>
 * *
 */
public class Test3 {

    String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Test3(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Test3{" +
               "str='" + str + '\'' +
               '}';
    }
}
