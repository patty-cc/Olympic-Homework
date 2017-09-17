package com.example.user.olympicshomework;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 15/09/2017.
 */

public class AthleticTeamTest {

    Athlete athlete;
    AthleticTeam athleticTeam;
    Medal goldMedal;


    @Test
    public void athleteTeamArraySize() {
        athleticTeam = new AthleticTeam( NationalCountry.AMERICA, SportPlayed.SWIMMING);

        assertEquals( 0, athleticTeam.getTeamMembers().size());
    }

    @Test
    public void canAddToAthleticTeamArray() {
        athleticTeam = new AthleticTeam( NationalCountry.AMERICA, SportPlayed.SWIMMING);

        athleticTeam.addAthlete(athlete);
        athleticTeam.addAthlete(athlete);

        assertEquals( 2 , athleticTeam.getTeamMembers().size());
    }

    @Test
    public void canCheckTeamCountry() {
        athleticTeam = new AthleticTeam( NationalCountry.FRANCE, SportPlayed.HURDLES);

        assertEquals( NationalCountry.FRANCE, athleticTeam.getCountry());
    }

    @Test
    public void canCheckTeamSport() {
        athleticTeam = new AthleticTeam( NationalCountry.FRANCE, SportPlayed.HURDLES );

        assertEquals( SportPlayed.HURDLES, athleticTeam.getSport());
    }

    @Test
    public void canTeamCanGetMedal() {
        goldMedal = new Medal(MetalType.GOLD);
        athleticTeam = new AthleticTeam( NationalCountry.AMERICA, SportPlayed.HIGHJUMP );

        athleticTeam.addMedal(goldMedal);
        athleticTeam.addMedal(goldMedal);

        assertEquals( 2, athleticTeam.getMedals().size());
    }




}

