package com.example;
import java.io.*;

public class SerializableObject implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public SerializableObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}