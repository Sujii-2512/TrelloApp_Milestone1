# Trello-Application

A simplified Trello Application where users can post tweets, follow/unfollow others, and view the 10 most recent messages in their news feed.

## Features
- **Post Tweets**: Users can post tweets with unique IDs and timestamps.
- **Follow/Unfollow Users**: Users can follow or unfollow other users.
- **News Feed**: Display up to 10 most recent tweets from followed users, ordered by timestamp.

## Technologies
- Java (Object-Oriented Programming)
- Lists, Arrays, and Sorting

## Project Structure
- **Trello**: Manages tweet posting, following, unfollowing, and retrieving news feeds.
- **User**: Represents a user, manages tweets, and follows/unfollows other users.
- **Tweet**: Represents a tweet with ID, user ID, and timestamp.
- **UserManager**: Manages user creation and stores all users.

## Flow of the Application
1. **User Creation**: 
   - When a user posts a tweet, the system checks if the user exists. If not, a new user is created.
2. **Posting Tweets**: 
   - A tweet is associated with the user and stored in their list of tweets. Each tweet has a unique ID and a timestamp.
3. **Following Users**: 
   - A user can follow another user, which allows their tweets to appear in the following user's news feed.
4. **Unfollowing Users**: 
   - A user can unfollow another user, removing their tweets from the user's news feed.
5. **News Feed**: 
   - When retrieving the news feed, the system compiles tweets from users the current user follows, sorts them by timestamp (most recent first), and returns up to 10 tweets.

- **Timestamp**: Tweets are sorted by timestamp, showing the most recent ones first.

## Example Usage
```java
Trello trello = new Trello();
trello.postTweet(1, 101);    // User 1 posts Tweet 101
trello.follow(1, 2);         // User 1 follows User 2
List<String> feed = trello.getNewsFeed(1);  // Get news feed for User 1
trello.unfollow(1, 2);       // User 1 unfollows User 2
```

## ⚙️ Project Setup

### Clone the Repository

1. **Clone this repository to your local machine**:

    ```bash
    git clone https://github.com/yourusername/trello-app.git
    cd trello-app
    ```

2. **Compile the Project**: 

    Make sure you're inside the `trello-app` folder and then run the following command to compile the Java files:

    ```bash
    javac *.java
    ```

3. **Run the Application**:

    After compiling the code, run the `Main` class to see the functionality of the platform:

    ```bash
    java Main
    ```

    This will execute the `Main.java` file, demonstrating the core functionalities:
    - Posting tweets.
    - Following and unfollowing users.
    - Viewing a user’s news feed.

## Example Output

```bash
User 1's News Feed:
Tweet ID: 103, User ID: 1, Timestamp: 3
Tweet ID: 102, User ID: 2, Timestamp: 2
Tweet ID: 101, User ID: 1, Timestamp: 1

User 1's News Feed after unfollowing user 2:
Tweet ID: 103, User ID: 1, Timestamp: 3
Tweet ID: 101, User ID: 1, Timestamp: 1
```
