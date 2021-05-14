package za.ac.cput;

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
    void testAdd(){
        fillSet();
        assertEquals(10,petSet.size());

    }
}
