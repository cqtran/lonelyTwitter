package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Created by brianlu on 2017-01-17.
 *
 * Tweet class is a super class that implements Tweetable
 */

public abstract class Tweet implements Tweetable {
    private Date date;
    private String message;
//    private String hiddenstring;

    /**
     * tweet can take in both date and string message as parameter
     * @param date
     * @param message
     */
    public Tweet(Date date, String message){
        this.date = date;
        this.message = message;
//        this.setMessage(message);

    }

    /**
     * just takes in message as a parameter
     * @param message
     */
    public Tweet(String message){
        this.message = message;
//        this.setMessage(message);
        this.date = new Date(); // current time and date
    }


    public abstract Boolean isImportant();

    /**
     * gets the date
     * @return
     */
    public Date getDate() {
        return date;
    }

    /**
     * sets the date
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * gets the message
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * if message length is over 144 characters throws an exception
     * @param message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException {
        if(message.length() > 144){
            //todo throw new error here

            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    /**
     *  returns date to string | message
     * @return
     */
    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}
