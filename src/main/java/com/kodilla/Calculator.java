package com.kodilla;

public class Calculator {

    private int a;
    private int b;

    public int addTheNumbers(int a, int b) {
        this.a = a;
        this.b = b;
        return a+b;
    }

    public int subtractTheNumbers(int a, int b) {
        this.a = a;
        this.b = b;
        return a-b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Wynik dodawania dwóch liczb:" + " " + calculator.addTheNumbers(5,4));
        System.out.println("Wynik odejmowania dwóch liczb:" + " " + calculator.subtractTheNumbers(10,5));
    }
}
