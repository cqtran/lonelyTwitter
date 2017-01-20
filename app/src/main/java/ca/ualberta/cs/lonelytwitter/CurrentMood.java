package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.lang.String;

/**
 * Created by Cameron on 2017-01-17.
 */

public abstract class CurrentMood {
    private Date date; // date
    private String message; // string


    public CurrentMood(String message){
        this.message = message;
        this.date = new Date();
    }
    // getters and setters of date and string
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // constructor default

    public CurrentMood(Date date, String message) {
        this.date = date;
        this.message = message;
    }
}
