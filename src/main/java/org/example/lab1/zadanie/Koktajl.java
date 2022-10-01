package org.example.lab1.zadanie;

public abstract class Koktajl implements Jadalne, Pijalne {
    @Override
    public void jedz() {
        this.pij();
    }

    @Override
    public void pij() {
        System.out.println("Pije koktajl");
    }
}
