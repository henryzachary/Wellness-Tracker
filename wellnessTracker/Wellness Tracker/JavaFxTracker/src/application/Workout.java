package application;

import java.util.Date;

public class Workout {
    private int id;
    private Date date;
    private int duration; // in minutes
    private int calories;

    public Workout(int id, Date date, int duration, int calories) {
        this.id = id;
        this.date = date;
        this.duration = duration;
        this.calories = calories;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
