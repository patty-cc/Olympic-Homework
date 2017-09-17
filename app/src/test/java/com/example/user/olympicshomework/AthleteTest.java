package com.example.user.olympicshomework;

import org.junit.*;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 15/09/2017.
 */

public class AthleteTest {

    Athlete athlete;
    Medal goldMedal;



//    @Before
//    public void before() {
//        athlete = new Athlete("Iain");
//    }

    @Test
    public void testAthleteName() {
        athlete = new Athlete( "Iain",  NationalCountry.GERMANY, SportPlayed.JAVLIN );
        assertEquals( "Iain", athlete.getName());
    }

    @Test
    public void testCanAddMedalToArray() {
        athlete = new Athlete("Iain", NationalCountry.GERMANY, SportPlayed.JAVLIN );
        goldMedal = new Medal(MetalType.GOLD);

        athlete.addMedal( goldMedal );

        assertEquals( 1 , athlete.getMedals().size());
    }

    @Test
    public void testAthleteHasNationality() {
        athlete = new Athlete( "Iain", NationalCountry.GERMANY, SportPlayed.JAVLIN );

        assertEquals( NationalCountry.GERMANY, athlete.getCountry());
    }

    @Test
    public void testAthleteSportPlayed() {
        athlete = new Athlete( "Iain", NationalCountry.GERMANY, SportPlayed.JAVLIN );

        assertEquals( SportPlayed.JAVLIN, athlete.getSport());
    }



}
