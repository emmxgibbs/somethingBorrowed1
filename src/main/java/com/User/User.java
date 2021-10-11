package com.User;

import java.util.ArrayList;

public class User {
    private String firstName;
    private String lastName;
    private String picUrl;
    public static ArrayList<User> clientArrayList;

    public User() {

    }

    public User(String firstName, String lastName, String picUrl) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.picUrl = picUrl;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public static void populateList(){
        clientArrayList.add(new User("clint", "clientman", "../img/pp4.png"));
        clientArrayList.add(new User("carrie", "clientess", "../img/pp3.png"));
        clientArrayList.add(new User("kelly", "clientane", "../img/pp2.png"));
        clientArrayList.add(new User("hellen", "hillclient", "../img/pp1.png"));
    }
}