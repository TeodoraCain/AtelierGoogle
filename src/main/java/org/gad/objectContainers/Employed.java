package org.gad.objectContainers;

public class Employed extends Person {
    public Employed(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Employed: " + super.toString();
    }
}