package ca.ualberta.cs.lonelytwitter;

/**
 * Created by brianlu on 2017-01-17.
 */

/**
 * If tweet is too long, throws an exception
 */
public class TweetTooLongException extends Exception {
    public TweetTooLongException() {
    }

    public TweetTooLongException(String detailMessage) {
        super(detailMessage);
    }
}
