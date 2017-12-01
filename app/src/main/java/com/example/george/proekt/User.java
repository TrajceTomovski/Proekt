package com.example.george.proekt;

/**
 * Created by George on 27/11/2017.
 */

public class User {
    String Name;
    String Lastname;
    char pol;
    String Username;


    public User(){

    }

    public User(String name, String lastname, char pol, String username) {
        Name = name;
        Lastname = lastname;
        this.pol = pol;
        Username = username;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public char getPol() {
        return pol;
    }

    public void setPol(char pol) {
        this.pol = pol;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", pol=" + pol +
                ", Username='" + Username + '\'' +
                '}';
    }
}
