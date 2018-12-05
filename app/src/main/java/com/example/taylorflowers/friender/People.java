package com.example.taylorflowers.friender;

import java.util.LinkedList;
import java.util.List;

public class People {
    public static List<People> peoples = new LinkedList<People>();

    private String name;
    private int age;
    private String bio;
    public People() {

    }
    public People(String n, int a, String b) {
        bio = b;
        age = a;
        name = n;
        peoples.add(this);
    }

    public void setName(String n) {
        name = n;
//        if () {
//
//        }
    }

    public void setAge(int a) {
        age = a;
    }

    public void setBio(String b) {
        bio = b;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }

    public int getAge() {
        return age;
    }
}
