/*
 * Copyright (c) $2017 CMPUT 301 University of Alberta. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;


/**
 * Created by Cameron on 2017-02-14.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest(){

        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweet");


        tweets.add(tweet);

        assertTrue(tweets.hasTweet(tweet));


    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another Test Tweet");
        Tweet tweet1 = new NormalTweet("second");
        Tweet tweet2 = new NormalTweet("third");

        tweets.add(tweet);
        tweets.add(tweet1);
        tweets.add(tweet2);
        Tweet returnedTweet = tweets.getTweet(0);
        Tweet returnedTweet1 = tweets.getTweet(1);
        Tweet returnedTweet2 = tweets.getTweet(2);

        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
        assertEquals(returnedTweet1.getMessage(), tweet1.getMessage());
        assertEquals(returnedTweet1.getDate(), tweet1.getDate());
        assertEquals(returnedTweet2.getMessage(), tweet2.getMessage());
        assertEquals(returnedTweet2.getDate(), tweet2.getDate());

    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Last tweet");

        tweets.add(tweet);
        tweets.delete(tweet);

        assertFalse(tweets.hasTweet(tweet));


    }

    public void testStrings(){
        assertEquals("'test' should be 'test'", "test", "test");
        assertTrue("'test' should start with 't'","test".startsWith("t"));

    }

    public void testnewaddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        Tweet tweet1 = new NormalTweet("test");


        tweets.add(tweet);
        try{
            tweets.add(tweet1);
            fail();
        } catch(Exception e) {
          assertTrue(tweets.hasTweet(tweet));
        }

    }
    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        Tweet tweet1 = new NormalTweet("test");


        tweets.add(tweet);
        try{
            tweets.addTweet(tweet);
            fail();
        } catch(Exception e) {
            assertTrue(tweets.hasTweet(tweet));
        }



    }
}
