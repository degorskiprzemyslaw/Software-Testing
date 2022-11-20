package com.sda.testingbasics.db;

import java.util.List;
import java.util.Objects;

public class Customer {
    private String name;
    private String email;



    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) &&
            Objects.equals(email, customer.email);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }


}
