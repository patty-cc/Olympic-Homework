package com.example.user.olympicshomework;

import java.util.ArrayList;

/**
 * Created by user on 15/09/2017.
 */

public class AthleticTeam extends Competitors {

    private ArrayList<Athlete> teamMembers;


    public AthleticTeam(NationalCountry country, SportPlayed sport) {
        super(country, sport);
        this.teamMembers = new ArrayList<>();
    }


    public ArrayList<Athlete> getTeamMembers() {
        return teamMembers;
    }

    public void addAthlete(Athlete athlete) {
        this.teamMembers.add( athlete );
    }

}
