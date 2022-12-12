package com.driver;

public class Main {
    public static void main(String[] args) {

        // Task 3:
        B b = new B();

        System.out.println(b.meth()); // Output if called this method
        // before overriding method in A, Output: Invoking method from class A

        // Task 5:
        System.out.println(b.meth()); // If called this after overriding
        // Method is overridden in Extendend class B

    }
}