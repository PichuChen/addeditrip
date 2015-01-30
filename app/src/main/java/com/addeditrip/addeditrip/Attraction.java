package com.addeditrip.addeditrip;


/**
 * Created by Pichu on 2015/1/30.
 */
public class Attraction {
    private Popularity popularity;
    private Location location;
    private Experiment_type experiment_type;
    private Traffic traffic;

    public Popularity getPopularity() {
        return popularity;
    }

    public void setPopularity(Popularity popularity) {
        this.popularity = popularity;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Experiment_type getExperiment_type() {
        return experiment_type;
    }

    public void setExperiment_type(Experiment_type experiment_type) {
        this.experiment_type = experiment_type;
    }

    public Traffic getTraffic() {
        return traffic;
    }

    public void setTraffic(Traffic traffic) {
        this.traffic = traffic;
    }
}
