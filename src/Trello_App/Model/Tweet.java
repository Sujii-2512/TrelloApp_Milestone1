package Trello_App.Model;

public class Tweet {
    private int tweetId;
    private int userId;
    private long timestamp;

    public Tweet(int tweetId, int userId, long timestamp) {
        this.tweetId = tweetId;
        this.userId = userId;
        this.timestamp = timestamp;
    }

    public int getTweetId() {
        return tweetId;
    }

    public int getUserId() {
        return userId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    //method to represent the Tweet object in a readable format
    @Override
    public String toString() {
        return "Tweet ID: " + tweetId + ", Timestamp: " + timestamp;
    }
}

