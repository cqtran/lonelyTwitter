package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Cameron on 2017-01-17.
 */

public class DifferentMood1 extends CurrentMood {
// getter and setter referenced in CurrentMood

// constructor with argument


    public DifferentMood1(String message) {
        super(message);
    }

    public DifferentMood1(Date date, String message) {
        super(date, message);
    }

    // return string
    public String DifferentMood1(){
        return "This mood is sad";
    }
}
