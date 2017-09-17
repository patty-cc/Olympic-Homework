package com.example.user.olympicshomework;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 15/09/2017.
 */

public class MedalTest {

    Medal goldMedal;
    Medal silverMedal;
    Medal bronzeMedal;

    @Before
    public void before() {
        goldMedal = new Medal(MetalType.GOLD);
        silverMedal = new Medal(MetalType.SILVER);
        bronzeMedal = new Medal(MetalType.BRONZE);
    }

    @Test
    public void canGetGoldMedalMetalType() {
        assertEquals(MetalType.GOLD, goldMedal.getMetal());
    }

    @Test
    public void canGetSilverMedalMetalType() {
        assertEquals(MetalType.SILVER, silverMedal.getMetal());
    }

    @Test
    public void canGetBronzeMedalMetalType() {
        assertEquals(MetalType.BRONZE, bronzeMedal.getMetal());
    }



}
