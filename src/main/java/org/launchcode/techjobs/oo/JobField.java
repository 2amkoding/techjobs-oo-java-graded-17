package org.launchcode.techjobs.oo;

public abstract class JobField {

    int id;
    private static int nextId = 1;
    private String value;

    public JobField(int id) {
        this.id = nextId;
        nextId++;
    }

    public JobField(String value) {

        this.value =value;
    }


    @Override
    public String toString() {
        return value;
    }


// Setters & Getters
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }
}
