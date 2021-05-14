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

        System.out.println(petMap);

        assertEquals(11, petMap.size());
    }

    @Test
        // Map remove
    void testRemove(){
        fillMap();
        petMap.remove(5);

        assertEquals(9,petMap.size());
    }
}
