package org.example.lab1;

import org.example.lab1.mypackage.MySecondClass;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello world");
        MyFirstClass.myStaticField = "my static";
        MyFirstClass myFirstClass = new MyFirstClass();
        myFirstClass.firstField2 = "Test";
        myFirstClass.run1();

        MySecondClass mySecondClass = new MySecondClass();
        mySecondClass.run();
    }
}
