package za.ac.cput;

/**
 * Author: Grant Constant
 * Student Number: 216063124
 */

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class PetSetTest {

    Set<Pet> petSet = new HashSet<>();

    public void fillSet(){
        for (int i = 0; i < 10; i++){
            String name = "Pet" + i;
            Pet p = new Pet(name);
            petSet.add(p);
        }
    }



    @Test
        //Set Add
    void testAdd(){
        fillSet();
        Pet p = new Pet("Pet11");
        petSet.add(p);
        assertEquals(11,petSet.size());
    }

    @Test
        //Set Remove
    void testRemove(){
        fillSet();
        Boolean isRemoved = petSet.removeAll(petSet);
        assertEquals(true, isRemoved);
    }

    @Test
        //Set Find
    void testFind() {
        Pet pet1 = new Pet("Pet1");
        Pet pet2 = new Pet("Pet2");
        Pet pet3 = new Pet("Pet3");

        petSet.add(pet1);
        petSet.add(pet2);
        petSet.add(pet3);

        Boolean found = petSet.contains(pet2);
        System.out.println(found);

        assertEquals(true , found);

    }
}
