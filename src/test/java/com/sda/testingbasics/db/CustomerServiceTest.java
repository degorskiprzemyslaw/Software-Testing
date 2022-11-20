package com.sda.testingbasics.db;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTest {

    @Test
    void shouldReturnCustomer(){
        CustomerService cs = new CustomerService();
        Customer customer1 = new Customer("Monika", "monika@gmail.com");
        Customer customer2 = new Customer("Andrzej", "andrzej@gmail.com");
        cs.add(customer1);
        cs.add(customer2);

        Customer found = cs.find("Andrzej");

        assertEquals(customer2, found);
        assertEquals(customer2.getName(), "Andrzej");
        assertEquals(customer2.getEmail(), "andrzej@gmail.com");
    }

    @Test
    void shouldReturnCustomerAmount(){
        CustomerService cs = new CustomerService();
        Customer customer1 = new Customer("Monika", "monika@gmail.com");
        Customer customer2 = new Customer("Andrzej", "andrzej@gmail.com");
        cs.add(customer1);
        cs.add(customer2);

        assertEquals(2, cs.size());
    }

    @Test
    void shouldFindByNameFragmentIgnoreCase(){
        CustomerService cs = new CustomerService();
        Customer customer1 = new Customer("Monika", "monika@gmail.com");
        Customer customer2 = new Customer("Andrzej", "andrzej@gmail.com");
        Customer customer3 = new Customer("Ramona", "ramona@gmail.com");
        cs.add(customer1);
        cs.add(customer2);
        cs.add(customer3);

        Collection<Customer> found = cs.findByName("mon");
        Collection<Customer> expected = new ArrayList<>();
        expected.add(customer1);
        expected.add(customer3);

        assertEquals(expected,found);


    }

    @Test
    void shouldUpdateCustomer(){
        CustomerService cs = new CustomerService();
        Customer customer1 = new Customer("Monika", "monika@gmail.com");
        Customer customer2 = new Customer("Andrzej", "andrzej@gmail.com");
        Customer customer3 = new Customer("Ramona", "ramona@gmail.com");
        cs.add(customer1);
        cs.add(customer2);
        cs.add(customer3);

        try {
            cs.update(new Customer("a", "a@gmail.com"),"Monika");
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        assertEquals("a", customer1.getName());
        assertEquals("a@gmail.com", customer1.getEmail());
    }

}