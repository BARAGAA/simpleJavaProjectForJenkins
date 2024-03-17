package org.example;

import org.example.fizzBuzz.FizzBuzz;

public class Main {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(FizzBuzz.convert(15));
    }
}