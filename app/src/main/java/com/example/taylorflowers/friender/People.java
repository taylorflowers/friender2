package com.example.taylorflowers.friender;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class People {
    public static List<People> peoples = new ArrayList<People>();

    private String name;
    private String email;
    private String pass;
    private int age;
    private String bio;
    private int number;

    private ArrayList<People> liked;
    private ArrayList<People> likedBy;

    public static People curr;

    public People(String n, int a, String b, int num, String e, String p) {
        bio = b;
        age = a;
        email = e;
        pass = p;
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

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public String getBio() {
        return bio;
    }

    public int getAge() {
        return age;
    }

    public static People getLiked(int i) {
        return peoples.get(i);
    }

    public void addLiked(People p) {
        System.out.println(p.getName());
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

    public static People containsEmail(String e) { //checks if email is already in use for a user
        for (People p : peoples) {
            if (e.equals(p.getEmail())) {
                return p;
            }
        }
        return null;
    }

    public static void setCurr(People p) { //sets current user
        curr = p;
    }
}
