package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Author: Grant Constant
 * Student Number: 216063124
 */

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
        assertEquals(9,petList.size());
    }

    @Test
        //List Find
    void testFind(){
        Pet pet1 = new Pet("Pet");
        petList.add(pet1);
        boolean found = petList.contains("Pet");
        System.out.println(petList);
        assertSame(true,found);
    }
}