package application;

import java.util.Date;

public class Reminder {
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