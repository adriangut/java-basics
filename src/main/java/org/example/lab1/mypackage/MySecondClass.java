package org.example.lab1.mypackage;

import org.example.lab1.myabstract.MyAbstractClass;

public class MySecondClass extends MyAbstractClass {
    private String firstField;
    String firstField2;

    public void run() {
        System.out.println("firstField = " + firstField);
        System.out.println("firstField2 = " + firstField2);
        myProtectedField = "my protected field";
        myProtected();
//        System.out.println("myAbstractField = " + myProtectedField);
    }

    @Override
    protected void myAbstract() {

    }
}
