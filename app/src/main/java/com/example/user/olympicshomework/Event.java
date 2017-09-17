package com.example.user.olympicshomework;

import java.util.ArrayList;

/**
 * Created by user on 15/09/2017.
 */

public class Event {

    private SportPlayed eventName;
    private ArrayList<Medal> eventPrize;
    private ArrayList<Competitors> eventParticipants;

    public Event( SportPlayed eventName) {
        this.eventName = eventName;
        this.eventPrize = new ArrayList<>();
        this.eventParticipants = new ArrayList();
    }

    public SportPlayed getEventName() {
        return eventName;
    }

    public ArrayList<Medal> getEventPrize() {
        return eventPrize;
    }

    public ArrayList<Competitors> getEventParticipents() {
        return eventParticipants;
    }

    public void addMedal(Medal medal ) {
        this.eventPrize.add( medal );
    }

    public void addAthlete(Athlete athlete) {
        this.eventParticipants.add(athlete);
    }

    public void removeMedal(Medal medal) {
        this.eventPrize.remove( medal );
    }
}
