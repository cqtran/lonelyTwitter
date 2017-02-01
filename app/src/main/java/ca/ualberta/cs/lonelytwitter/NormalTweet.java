package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Created by brianlu on 2017-01-17.
 */
public class NormalTweet extends Tweet {
    /**
     * Instantiates a new Normal tweet.
     *
     * @param date    the date
     * @param message the message
     */
    public NormalTweet(Date date, String message){
        super(date, message);
    }

    /**
     * Instantiates a new Normal tweet.
     *
     * @param message the message
     */
    public NormalTweet( String message){
        super(message);

    }

    /**
     * returns false because tweet is normal
     * @return
     */
    public Boolean isImportant(){
        return Boolean.FALSE;
    }

}
