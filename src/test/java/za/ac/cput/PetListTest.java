package za.ac.cput;

/**
 * Author: Grant Constant
 * Student Number: 216063124
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class PetListTest {

    List<Pet> petList = new ArrayList<>();

    public void fillList(){
        for (int i = 0; i < 10; i++){
            String name = "Pet" + i;
            Pet p = new Pet(name);
            petList.add(p);
        }
    }

    @Test
        //List Add
    void testAdd(){
        fillList();
        petList.add(10, new Pet("Pet10"));
        assertEquals(11, petList.size());
    }

    @Test
        //List remove
    void testRemove(){
        fillList();
        petList.remove(7);
        System.out.println(petList);
        assertEquals(9,petList.size());
    }

    @Test
        //List Find
    void testFind(){
        Pet pet1 = new Pet("Pet1");
        Pet pet2 = new Pet("Pet2");
        Pet pet3 = new Pet("Pet3");

        petList.add(pet1);
        petList.add(pet2);
        petList.add(pet3);

        Boolean found = petList.contains(pet2);
        assertEquals(true , found);
    }
}