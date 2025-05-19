import Trello_App.Trello;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Trello trello = new Trello();

        trello.postTweet(1, 101);
        trello.postTweet(2, 102);
        trello.postTweet(1, 103);
        trello.follow(1, 2);

        System.out.println("User 1's News Feed:");
        List<String> feed1 = trello.getNewsFeed(1);
        for (String tweet : feed1) {
            System.out.println(tweet);
        }

        trello.unfollow(1, 2); // User 1 Unfollows User 2

        System.out.println("\nUser 1's News Feed after unfollowing user 2:");
        List<String> feed2 = trello.getNewsFeed(1);
        for (String tweet : feed2) {
            System.out.println(tweet);
        }
    }
}
