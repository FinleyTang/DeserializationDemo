package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args) {
        SerializableObject object = null;

        try {
            FileInputStream fileIn = new FileInputStream("object.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            object = (SerializableObject) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("SerializableObject 类未找到");
            c.printStackTrace();
            return;
        }

        System.out.println("反序列化对象...");
        System.out.println("Name: " + object.getName());
        System.out.println("Age: " + object.getAge());
    }
}