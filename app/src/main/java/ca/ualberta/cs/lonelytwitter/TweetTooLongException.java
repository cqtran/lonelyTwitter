package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Cameron on 2017-01-17.
 */

public class TweetTooLongException extends Exception {
    public TweetTooLongException() {
    }

    public TweetTooLongException(String detailMessage) {
        super(detailMessage);
    }
}
