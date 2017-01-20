package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Cameron on 2017-01-17.
 */

public class DifferentMood2 extends CurrentMood{
// getter setter reference in CurrentMood

// constructor with argument

    public DifferentMood2(String message) {
        super(message);
    }

    public DifferentMood2(Date date, String message) {
        super(date, message);
    }

    //return string
    public String DifferentMood2(){
        return "This mood is happy!";
    }
}
