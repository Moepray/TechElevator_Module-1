package com.techelevator.hr;

import java.util.*;

import com.techelevator.crm.Customer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    @Test
    public void testEmployee_getBalanceDue() {
        Employee employee = new Employee("John", "Smith");
        Map<String, Double> balances = new HashMap<>();
        balances.put("Grooming", 60.00);
        balances.put("Walking", 25.00);
        balances.put("Sitting", 18.00);

        double result = employee.getBalanceDue(balances);

        double expected = 90.50;
        assertEquals(expected, result, 0.0);
    }
}