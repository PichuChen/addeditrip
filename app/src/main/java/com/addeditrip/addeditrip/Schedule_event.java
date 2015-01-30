package com.addeditrip.addeditrip;

/**
 * Created by Pichu on 2015/1/30.
 */
public class Schedule_event {
    private int schedule_event_id;
    private int attraction_id;
    private int time_duration;
    private String photo_directory;
    private Trip_schedule owner;

    public int getSchedule_event_id() {
        return schedule_event_id;
    }

    public void setSchedule_event_id(int schedule_event_id) {
        this.schedule_event_id = schedule_event_id;
    }

    public int getAttraction_id() {
        return attraction_id;
    }

    public void setAttraction_id(int attraction_id) {
        this.attraction_id = attraction_id;
    }

    public int getTime_duration() {
        return time_duration;
    }

    public void setTime_duration(int time_duration) {
        this.time_duration = time_duration;
    }

    public String getPhoto_directory() {
        return photo_directory;
    }

    public void setPhoto_directory(String photo_directory) {
        this.photo_directory = photo_directory;
    }

    public Trip_schedule getOwner() {
        return owner;
    }

    public void setOwner(Trip_schedule owner) {
        this.owner = owner;
    }
}
