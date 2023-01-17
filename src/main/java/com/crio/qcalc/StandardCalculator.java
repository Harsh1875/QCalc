package com.crio.qcalc;

public class StandardCalculator {

    private int result;

    public int getResult() {
        return result;
    }

    public void clearResult() {
        result = 0;
    }

    public void printResult() {
        System.out.println("Standard Claculator Result:" + result);
    }

    public void add(int num1, int num2) {
        result =  num1 + num2;
    }

    public void subtract(int num1, int num2) {
        result = num1 - num2;
    }

    public void multiply(int num1, int num2) {
        result = num1 * num2;
    }

    public void divide(int num1, int num2) {
        result = num1/num2;
    }

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

}
