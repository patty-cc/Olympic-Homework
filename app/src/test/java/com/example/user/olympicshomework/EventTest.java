package com.example.user.olympicshomework;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 17/09/2017.
 */

public class EventTest {

    Event event;
    Medal goldMedal;
    Medal silverMedal;
    Medal bronzeMedal;
    Athlete athlete;

    @Test
    public void checkEventSport() {
        event = new Event( SportPlayed.HIGHJUMP );

        assertEquals( SportPlayed.HIGHJUMP, event.getEventName());
    }

    @Test
    public void checkEventMedalArrayEmpty() {
        event = new Event( SportPlayed.HIGHJUMP );
        assertEquals( 0, event.getEventPrize().size() );
    }

    @Test
    public void canAddMedalToEventPrize() {
        event = new Event( SportPlayed.HURDLES );

        event.addMedal(goldMedal);
        event.addMedal(silverMedal);
        event.addMedal(bronzeMedal);

        assertEquals( 3, event.getEventPrize().size() );
    }

    @Test
    public void participantArrayIsEmpty() {
        event = new Event( SportPlayed.JAVLIN );
        assertEquals( 0 , event.getEventParticipents().size());
    }

    @Test
    public void canAddAthleteToEvent() {
        event = new Event( SportPlayed.LONGJUMP );
        event.addAthlete(athlete);
        assertEquals( 1 , event.getEventParticipents().size() );
    }

    @Test
    public void canGiveAthleteMedal() {
        event = new Event( SportPlayed.SWIMMING );
        athlete = new Athlete( "Iain" , NationalCountry.FRANCE, SportPlayed.SWIMMING);

        event.addMedal(goldMedal);
        event.addMedal(silverMedal);
        event.addMedal(bronzeMedal);

        assertEquals( 3, event.getEventPrize().size() );

        event.removeMedal(goldMedal);

        assertEquals ( 2, event.getEventPrize().size() );

        athlete.addMedal(goldMedal);

        assertEquals( 1 , athlete.getMedals().size() );
    }

}
