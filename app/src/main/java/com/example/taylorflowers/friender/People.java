package com.example.taylorflowers.friender;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class People {
    public static List<People> peoples = new LinkedList<People>();

    private String name;
    private int age;
    private String bio;
    private int number;
    private ArrayList<People> liked;
    private ArrayList<People> likedBy;
    public People() {

    }
    public People(String n, int a, String b, int num) {
        bio = b;
        age = a;
        name = n;
        number = num;
        peoples.add(this);
    }

    public void setName(String n) {
        name = n;
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

    public int getNumber() { return number; }

    public String getBio() {
        return bio;
    }

    public int getAge() {
        return age;
    }

    public void addLiked(People p) {
        liked.add(p);
    }

    public void addLikedBy(People p) {
        likedBy.add(p);
    }

    public ArrayList<People> getMatches() {
        ArrayList<People> matches = new ArrayList<People>();
        for (int i = 0; i < liked.size(); i++) {
            if (likedBy.contains(liked.get(i))) {
                matches.add(liked.get(i));
            }
        }
        return matches;
    }
}
