package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    public static int id;
    public static int nextId = 1;
    private String value;

    public JobField(int id) {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this.value =value;
    }


    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
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
