package edu.demo;

import java.util.Scanner;

public class StringPrinterDemo {
    public static void main(String[] args) {
        System.out.println("Please enter some string ");
        Scanner scannerString = new Scanner(System.in);
        String testString = scannerString.nextLine();

        System.out.println("Please enter string printer type (U - upper, L - lower)");
        Scanner scannerType = new Scanner(System.in);
        String type = scannerType.nextLine();

        switch (type) {
            case "u":
                UpperStringPrinter upperStringPrinter = new UpperStringPrinter();
                upperStringPrinter.print(testString);
                break;
            case "l":
                LowerStringPrinter lowerStringPrinter = new LowerStringPrinter();
                lowerStringPrinter.print(testString);
                break;
        }
    }
}
