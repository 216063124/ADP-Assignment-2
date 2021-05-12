package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Author: Grant Constant
 * Student Number: 216063124
 */

public class PetTest {

    List<Pet> petList = new ArrayList<>();

    @Test
    //List Add
    void test(){
        for (int i = 0; i < 10; i++){
            String name = "n" + 1;
            Pet p = new Pet(name);
            petList.add(p);
        }
        assertEquals(10, petList.size());
    }
}
