package za.ac.cput.assignment2;

/**
 * Author: Grant Constant
 * Student Number: 216063124
 */


import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PetCollectionTest {

    Collection<Pet> petCollection = new LinkedHashSet<>();

    public void fillCollection(){
        for (int i = 0; i < 10; i++){
            String name = "Pet" + i;
            Pet p = new Pet(name);
            petCollection.add(p);
        }
    }

    @Test
        //Collection Add
    void testAdd(){
        fillCollection();
        petCollection.add(new Pet("Pet10"));
        assertEquals(11, petCollection.size());
    }

    @Test
        //Collection remove
    void testRemove(){
        fillCollection();
        boolean isRemoved = petCollection.removeAll(petCollection);
        System.out.println(petCollection);
        assertEquals(true, isRemoved);
    }

    @Test
        //Collection Find
    void testFind(){
        Pet pet1 = new Pet("Pet1");
        Pet pet2 = new Pet("Pet2");
        Pet pet3 = new Pet("Pet3");

        petCollection.add(pet1);
        petCollection.add(pet2);
        petCollection.add(pet3);

        Boolean found = petCollection.contains(pet2);
        assertEquals(true , found);
    }

}