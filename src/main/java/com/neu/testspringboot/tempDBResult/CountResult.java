package com.neu.testspringboot.tempDBResult;

public class CountResult {

    private Integer countNum;

    @Override
    public String toString() {
        return "CountResult{" +
                "countNum=" + countNum +
                '}';
    }

    public Integer getCountNum() {
        return countNum;
    }

    public void setCountNum(Integer countNum) {
        this.countNum = countNum;
    }
}
