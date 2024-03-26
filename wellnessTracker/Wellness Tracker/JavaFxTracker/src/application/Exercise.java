package application;

public class Exercise {
    private int id;
    private String name;
    private int duration; // in minutes
    private int calories;

    public Exercise(int id, String name, int duration, int calories) {
        this.id = id;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
