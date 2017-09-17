package com.example.user.olympicshomework;

import java.util.ArrayList;

/**
 * Created by user on 15/09/2017.
 */

public class Athlete extends Competitors {

    private String name;



    public Athlete( String name, NationalCountry country, SportPlayed sport ){
        super(country, sport);
        this.name = name;
    }


    public String getName() {
        return name;
    }





}
