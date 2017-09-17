package com.example.user.olympicshomework;

import java.util.ArrayList;

/**
 * Created by user on 16/09/2017.
 */

 public abstract class Competitors {

    private NationalCountry country;
    private ArrayList<Medal> medals;
    private SportPlayed sport;

    public Competitors(NationalCountry country, SportPlayed sport) {
        this.country = country;
        this.sport = sport;
        this.medals = new ArrayList<>();
    }

    public NationalCountry getCountry() {
        return country;
    }

    public ArrayList<Medal> getMedals() {
        return medals;
    }

    public SportPlayed getSport() {
        return sport;
    }

    public void addMedal(Medal medal) {
        this.medals.add(medal);
    }
}
