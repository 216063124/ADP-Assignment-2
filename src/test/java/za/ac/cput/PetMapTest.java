package za.ac.cput;

/**
 * Author: Grant Constant
 * Student Number: 216063124
 */

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class PetMapTest {

    Map<Integer , Pet> petMap = new HashMap<>();

    public void fillMap(){
        for(int i = 0; i < 10; i++) {
            String name = ("Pet" + i);
            Pet p = new Pet(name);
            petMap.put(i, p);
        }
    }
    @Test
        // Map add
    void testAdd(){
        fillMap();
        Pet pet10 = new Pet("Pet10");
        petMap.put(10, pet10);

        assertEquals(11, petMap.size());
    }

    @Test
        // Map remove
    void testRemove(){
        fillMap();
        petMap.remove(5);

        assertEquals(9,petMap.size());
    }

    @Test
        //Map find
    void testFind(){
        Pet pet1 = new Pet("Pet1");
        Pet pet2 = new Pet("Pet2");
        Pet pet3 = new Pet("Pet3");

        petMap.put(1, pet1);
        petMap.put(2, pet2);
        petMap.put(3, pet3);

        Pet found = petMap.get(2);
        System.out.println(petMap);

        assertSame(pet2 , found);
    }
}
