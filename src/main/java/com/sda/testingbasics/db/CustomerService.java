package com.sda.testingbasics.db;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomerService implements CustomerDao{

    private List<Customer> customers = new ArrayList<>();
    @Override
    public void add(Customer customer) {
        customers.add(customer);
    }

    @Override
    public Customer find(String name) {

        try {
            return customers.stream().filter(customer -> customer.getName().equals(name)).findFirst().orElseThrow(() -> new NotFoundException("Nie znaleziono użytkownika"));
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }

    public int size(){
        return customers.size();
    }

    public Collection<Customer> findByName(String name){
        return customers.stream().filter(customer -> customer.getName().toLowerCase().contains(name))
                .collect(Collectors.toList());
    }

    void update(Customer afterUpdate, String name) throws NotFoundException {
        Customer customer = find(name);
        if(customer == null){
            throw new NotFoundException("Nie znaleziono użytkownika");
        }


        customer.setName(afterUpdate.getName());
        customer.setEmail(afterUpdate.getEmail());
    }
}
