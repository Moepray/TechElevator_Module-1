package com.techelevator.crm;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PetTest {

    @Test
    public void testlistVaccinations_commaSeperated() {

        //arrange

        Pet	pet = new Pet("Angel", "Dog");
        List<String> list = new ArrayList <String>(Arrays.asList("Rabies", "Distemper", "Parvo"));
        pet.setVaccinations(list);
        String result = pet.listVaccinations();

        String expected = "Rabies, Distemper, Parvo";

        //assert
        assertEquals(expected,result);
    }
}
