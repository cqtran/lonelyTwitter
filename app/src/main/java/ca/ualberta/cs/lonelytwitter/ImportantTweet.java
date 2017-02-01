package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Created by brianlu on 2017-01-17.
 */

/**
 * Decides if tweet is important.
 * Extends Tweet
 */
public class ImportantTweet extends Tweet {
    /**
     * Lets importanttweet take in both date and message
     * @param date
     * @param message
     */
    public ImportantTweet(Date date, String message){
        super(date, message);
    }

    /**
     * only takes in string message for importanttweet
     * @param message
     */
    public ImportantTweet( String message){
        super(message);

    }

    /**
     * returns true because the tweet is important
     * @return
     */
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

    /**
     * get message and adds !!! to end of it
     * @return
     */
    @Override
    public String getMessage(){
        return super.getMessage() + " !!!";
    }
}
