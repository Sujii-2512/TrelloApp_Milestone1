package Trello_App.Model;

import java.util.*;

public class User {
    private int userId;
    private List<Integer> followed;
    private List<Tweet> tweets;

    public User(int userId) {
        this.userId = userId;
        this.followed = new ArrayList<>();
        this.tweets = new LinkedList<>();
        follow(userId);     // follow self
    }

    public void follow(int id) {
        if (!followed.contains(id)) followed.add(id);
    }

    public void unfollow(int id) {
        if (id != userId) followed.remove(Integer.valueOf(id));
    }

    public void postTweet(Tweet tweet) {
        tweets.add(0, tweet); // add to start (latest first)
    }

    public int getUserId() {
        return userId;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public List<Integer> getFollowed() {
        return followed;
    }
}
