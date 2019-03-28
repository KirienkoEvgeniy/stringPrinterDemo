package edu.demo;

public class LowerStringPrinter extends AbstractStringPrinter {
    @Override
    public void print(String testString) {
        System.out.println(testString.toLowerCase());
    }
}
