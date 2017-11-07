package com.greenfox.frontend.model;

public class DoUntil {

    int result;

    public DoUntil(int result) {
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public DoUntil() {
    }

    public DoUntil(int until, String what) {

        if (what.equals("sum")){
            this.result = sum(until);
        }else {
            factor(until);
            this.result = factor(until);
        }
    }

    public static int sum (int until) {
        int sumAll = 0;
        for (int i = 0; i <= until; i++) {
            sumAll += i;
        }
        return sumAll;
    }

    public static int factor(int num) {
        if (num == 0) {
            return 1;
        }
        int numFact = 1;
        for (int i = 1; i <= num; i++) {
            numFact *= i;
        }
        return numFact;
    }
}
