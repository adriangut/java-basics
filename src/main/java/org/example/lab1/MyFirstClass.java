package org.example.lab1;

public class MyFirstClass implements MyFirstInterface, MySecondInterface {
    public static String myStaticField;
    private String firstField;
    String firstField2;

    @Override
    public void run1() {
        System.out.println("firstField = " + firstField);
        System.out.println("firstField2 = " + firstField2);
    }

    @Override
    public void run2() {

    }
}
