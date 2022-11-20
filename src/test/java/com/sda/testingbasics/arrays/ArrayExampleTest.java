package com.sda.testingbasics.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ArrayExampleTest {

    @Test
    void shouldReturnStringArrayWithNoDuplicates() {
        //given
        String[] names = {"Ala", "Basia", "Grzegorz", "Ala"};
        //String[] names = new String[] {"Ala", "Basia", "Grzegorz", "Ala"};

        //when
        String[] removed = ArrayExample.removeDuplicates(names);

        String[] expected= {"Ala","Basia","Grzegorz"};

        //then
        //assertEquals(removed, new String[]{"Ala", "Basia", "Grzegorz"})
        assertThat(removed)
                .containsExactlyInAnyOrder("Ala", "Basia", "Grzegorz");
    }

}