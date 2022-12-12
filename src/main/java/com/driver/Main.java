package com.driver;

public class Main {

    public class A {

        // Task 1:
        public String meth(){
            return "Invoking method from class A";
        }

    }


    public class B extends A {

        // Task 4:
        @Override
        public String meth() {
            return "Method is overridden in Extendend class B";
        }

    }

    public static void main(String[] args) {

        // Task 3:
        Main.B b = new Main().new B();

        System.out.println(b.meth()); // Output if called this method
        // before overriding method in A, Output: Invoking method from class A

        // Task 5:
        System.out.println(b.meth()); // If called this after overriding
        // Method is overridden in Extendend class B

    }
}