package org.example.lab1.myabstract;

public abstract class MyAbstractClass {
    protected String myProtectedField;

    protected void myProtected() {
        System.out.println("myProtectedField = " + myProtectedField);
    }

    protected abstract void myAbstract();
}
