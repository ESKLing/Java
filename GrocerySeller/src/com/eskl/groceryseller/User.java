package com.eskl.groceryseller;

public class User {
    String username;
    int age;
    String occupation;
    float yearsExperience;
    Address address;

    public User(String username, int age, String occupation, float yearsExperience, Address address) {
        this.username = username;
        this.age = age;
        this.occupation = occupation;
        this.yearsExperience = yearsExperience;
        this.address = address;
    }

    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                ", yearsExperience=" + yearsExperience +
                ", address='" + address + '\'' +
                '}';
    }

}
