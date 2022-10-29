package org.example.lab1.zadanie;

public enum ZrodloSmaku {
    OWOCOWY,
    WARZYWNY,
    INNY;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
