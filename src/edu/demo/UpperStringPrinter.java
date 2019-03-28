package edu.demo;

public class UpperStringPrinter extends AbstractStringPrinter{
    @Override
    public void print(String testString) {
        System.out.println(testString.toUpperCase());
    }
}
