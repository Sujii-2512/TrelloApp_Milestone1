package Trello_App;

import Trello_App.Helper.UserManager;
import Trello_App.Model.User;
import Trello_App.Model.Tweet;

import java.util.*;

public class Trello {
    private UserManager userManager;
    private static long timeCounter = 0;

    // Constructor Initializes the UserManager
    public Trello() {
        userManager = new UserManager();
    }

    // Post a tweet by a user
    public void postTweet(int userId, int tweetId) {
        User user = userManager.createOrGetUser(userId);
        Tweet tweet = new Tweet(tweetId, userId, ++timeCounter);
        user.postTweet(tweet);
    }

    // User starts following another user
    public void follow(int followerId, int followeeId) {
        User follower = userManager.createOrGetUser(followerId);
        userManager.createOrGetUser(followeeId); // Ensure followee exists
        follower.follow(followeeId);
    }

    // User unfollows another user
    public void unfollow(int followerId, int followeeId) {
        User follower = userManager.getUser(followerId);
        if (follower != null) {
            follower.unfollow(followeeId);
        }
    }

    // Get the 10 most recent tweet IDs along with their timestamps from the user's feed
    public List<String> getNewsFeed(int userId) {
        User user = userManager.getUser(userId);
        List<String> recentTweetDetails = new ArrayList<>();

        if (user == null) {
            return recentTweetDetails; // user doesn't exist, return an empty list
        }

        List<Tweet> allTweets = new ArrayList<>();

        // Collect tweets from followed users
        for (int followedId : user.getFollowed()) {
            User followedUser = userManager.getUser(followedId);
            if (followedUser != null) {
                allTweets.addAll(followedUser.getTweets());
            }
        }

        // Sort tweets by timestamp
        allTweets.sort((a, b) -> Long.compare(b.getTimestamp(), a.getTimestamp()));

        // Add up to 10 tweet IDs along with their timestamps
        for (int i = 0; i < Math.min(10, allTweets.size()); i++) {
            Tweet tweet = allTweets.get(i);
            String tweetInfo = "Tweet ID: " + tweet.getTweetId() + ", Timestamp: " + tweet.getTimestamp();
            recentTweetDetails.add(tweetInfo);
        }

        return recentTweetDetails; // Returns the list of tweet details (ID and timestamp)
    }
}