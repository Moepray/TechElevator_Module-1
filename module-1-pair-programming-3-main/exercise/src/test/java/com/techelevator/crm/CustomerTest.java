package com.techelevator.crm;

import java.util.*;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void testCustomer_getBalanceDue() {
        Customer customer = new Customer("John", "Smith");
        Map<String, Double> balances = new HashMap<>();
        balances.put("Grooming", 60.00);
        balances.put("Walking", 25.00);
        balances.put("Sitting", 18.00);

        double result = customer.getBalanceDue(balances);

        double expected = 103.00;
        assertEquals(expected, result, 0.0);
    }
}