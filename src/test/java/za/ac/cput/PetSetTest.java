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
}
