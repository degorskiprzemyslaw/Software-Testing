package com.sda.testingbasics.personal;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonDetailsTest {

    @Test
    void shouldBePerceivedAsChild(){
        PersonDetails personDetails = new PersonDetails("Bartosz", "Woźniak", 8);

        assertTrue(personDetails.isChild());
    }

    @Test
    void shoutNotBePerceivedAsChild(){
        PersonDetails personDetails = new PersonDetails("Bartosz", "Woźniak", 11);
        assertFalse(personDetails.isChild());
    }

    @Test
    void shouldBePerceivedAsTeenager(){

        PersonDetails personDetails = new PersonDetails("Bartosz", "Woźniak", 8);

        assertTrue(personDetails.isTeenager());

    }

    @Test
    void shouldNotBePerceivedAsTeenager(){

        PersonDetails personDetails = new PersonDetails("Bartosz", "Woźniak", 8);

        assertFalse(personDetails.isTeenager());

    }


    @Test
    void shouldBePerceivedAsAdult(){

        PersonDetails personDetails = new PersonDetails("Bartosz", "Woźniak", 20);

        assertThat(personDetails.isAdult())
                .isTrue();

    }
    @Test
    void shouldNotBePerceivedAsAdult(){

        PersonDetails personDetails = new PersonDetails("Bartosz", "Woźniak", 8);

        assertThat(personDetails.isAdult())
                .isFalse();

    }

}