package com.addeditrip.addeditrip;

/**
 * Created by Pichu on 2015/1/30.
 */
public class Trip_schedule {
    private int trip_schedule_id;
    private int start_time;
    private Schedule_event[] schedule_events;
    private Trip owner;

    public int getTrip_schedule_id() {
        return trip_schedule_id;
    }

    public void setTrip_schedule_id(int trip_schedule_id) {
        this.trip_schedule_id = trip_schedule_id;
    }

    public int getStart_time() {
        return start_time;
    }

    public void setStart_time(int start_time) {
        this.start_time = start_time;
    }

    public Schedule_event[] getSchedule_events() {
        return schedule_events;
    }

    public void setSchedule_events(Schedule_event[] schedule_events) {
        this.schedule_events = schedule_events;
    }

    public Trip getOwner() {
        return owner;
    }

    public void setOwner(Trip owner) {
        this.owner = owner;
    }
}
