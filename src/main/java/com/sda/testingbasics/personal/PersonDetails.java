package com.sda.testingbasics.personal;

public class PersonDetails {

    private String firstname;
    private String familyName;
    private int age;

    public PersonDetails(String firstname, String familyName, int age) {
        this.firstname = firstname;
        this.familyName = familyName;
        this.age = age;
    }

    public boolean isChild() {

        return age >=0 && age <= 10;
    }

    public boolean isTeenager() {
        return age > 10 && age < 18;


    }

    public boolean isAdult() {
        return age >= 18;
    }
}
