package com.Mugu.com;

public class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
    public int substract(int a, int b){
        return a - b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int division(int a, int b){
        return a/b;
    }
    public static void main(String args[]) {
        Arithmetic a1 = new Arithmetic();
        System.out.println("Adding Numbers" + a1.add(1, 2));
        System.out.println("Subtraction Numbers"+ a1.substract(5,2));
        System.out.println("Multiplication Numbers"+ a1.multiply(5,2));
        System.out.println("Division Numbers"+ a1.division(6,3));
    }
}



