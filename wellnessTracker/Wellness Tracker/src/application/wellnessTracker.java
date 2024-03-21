package application;

public class wellnessTracker {

}

import java.util.Date;

class Exercise {
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

class Workout {
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

class User {
    private int id;
    private String username;
    private String email;
    private String password;

    public User(int id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

class Reminder {
    private int id;
    private Date time;
    private String message;

    public Reminder(int id, Date time, String message) {
        this.id = id;
        this.time = time;
        this.message = message;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

public class WellnessTracker {
    public static void main(String[] args) {
        // Sample usage
        Exercise exercise = new Exercise(1, "Running", 30, 200);
        Workout workout = new Workout(1, new Date(), 60, 400);
        User user = new User(1, "john_doe", "john@example.com", "password123");
        Reminder reminder = new Reminder(1, new Date(), "Don't forget to exercise!");
        
        // Output sample data
        System.out.println("Exercise: " + exercise.getName() + ", Duration: " + exercise.getDuration() + " mins, Calories Burned: " + exercise.getCalories());
        System.out.println("Workout Date: " + workout.getDate() + ", Duration: " + workout.getDuration() + " mins, Calories Burned: " + workout.getCalories());
        System.out.println("Username: " + user.getUsername() + ", Email: " + user.getEmail());
        System.out.println("Reminder Time: " + reminder.getTime() + ", Message: " + reminder.getMessage());
    }
}

