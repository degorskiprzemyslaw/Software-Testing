package com.sda.testingbasics.air;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AirplaneTest {


    private Airplane airplane;

    @BeforeEach
    void beforeEach(){
        airplane = new Airplane();

    }


    @Test
    void shouldAscend() {
        //given
        //create Airplane

        //when
        //call ascent method
        airplane.ascent(89);

        //then
        //assert that
        //Assertions.assertEquals();
        assertEquals(89,airplane.getHeight(),"Height should be 89");
        assertThat(airplane.getHeight())
                .as("Height should be 89")
                .isEqualTo(89);
    }

    @Test
    void shouldAscendMultipleTimes(){

        //when
        airplane.ascent(200);
        airplane.ascent(19);
        airplane.ascent(29);

        //then
        assertEquals(248, airplane.getHeight(),"Height should be 248");
    }

    @Test
    void shouldAscendAndDescendMultipleTimes(){

        //when
        airplane.ascent(200);
        airplane.descent(19);
        airplane.ascent(29);
        airplane.descent(60);

        //then
        assertEquals(150, airplane.getHeight(),"Height should be 150");
    }

    @Test
    void shouldNotAcceptNegativeValuesWhileAscending(){
        //when
        airplane.ascent(-9);
        //then
        assertEquals(0,airplane.getHeight());
    }

    @Test
    void shouldNotAcceptNegativeValuesWhileDescending(){
        //when
        airplane.ascent(10);
        airplane.descent(-9);
        //then
        assertEquals(10,airplane.getHeight());
    }

    @Test
    void shouldDescend(){
        //given
        //create Airplane

        airplane.ascent(70);

        //when
        //call
        airplane.descent(30);

        //then
        //assert that

        assertEquals(40,airplane.getHeight(), "Height should be 40");
    }

    @Test
    void shouldStartingHeightBeZero(){
        //given


        //then
        assertEquals(0, airplane.getHeight(), "Height should be 0");
    }

    @Test
    void shouldNotDescendBelowZero(){
        //given

        airplane.ascent(70);

        //when
        airplane.descent(90);

        //then
        assertEquals(0, airplane.getHeight(), "Height should be 0");
    }
}