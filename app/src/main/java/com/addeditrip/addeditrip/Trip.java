package com.addeditrip.addeditrip;

/**
 * Created by Pichu on 2015/1/30.
 */
public class Trip {
    private int trip_id;
    private String name;
    private int how_many_days;
    private int season;
    private Location location;
    private int evaluation;
    private Trip_schedule[] trip_schedules;
    private User owner;

    public int getTrip_id() {
        return trip_id;
    }

    public void setTrip_id(int trip_id) {
        this.trip_id = trip_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHow_many_days() {
        return how_many_days;
    }

    public void setHow_many_days(int how_many_days) {
        this.how_many_days = how_many_days;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int evaluation) {
        this.evaluation = evaluation;
    }

    public Trip_schedule[] getTrip_schedules() {
        return trip_schedules;
    }

    public void setTrip_schedules(Trip_schedule[] trip_schedules) {
        this.trip_schedules = trip_schedules;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
