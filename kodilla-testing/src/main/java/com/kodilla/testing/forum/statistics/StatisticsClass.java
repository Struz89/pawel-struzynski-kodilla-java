package com.kodilla.testing.forum.statistics;

public class StatisticsClass {

    public double users = 0;
    public double posts = 0;
    public double comments = 0;

    public double averagePostsPerUsers = 0;
    public double averageCommentsPerUsers = 0;
    public double averageCommentsPerPosts = 0;

    public void calculateAdvStatistics(Statistics statistics) {
        if (statistics.usersNames().size() > 0 && statistics.postsCount() == 0 && statistics.commentsCount() == 0) {
            users = statistics.usersNames().size();
            System.out.print(users);
        } else if (statistics.postsCount() > 0 && statistics.usersNames().size() == 0 && statistics.commentsCount() == 0) {
            posts = statistics.postsCount();
            System.out.print(posts);
        } else if (statistics.commentsCount() > 0 && statistics.usersNames().size() == 0 && statistics.postsCount() == 0) {
            comments = statistics.commentsCount();
            System.out.print(comments);
        } else if (statistics.usersNames().size() > 0 && statistics.postsCount() > 0 && statistics.commentsCount() == 0) {
            averagePostsPerUsers = statistics.postsCount()/statistics.usersNames().size();
            System.out.print(averagePostsPerUsers);
        } else if (statistics.usersNames().size() > 0 && statistics.postsCount() == 0 && statistics.commentsCount() > 0) {
            averageCommentsPerUsers = statistics.commentsCount()/statistics.usersNames().size();
            System.out.print(averageCommentsPerUsers);
        } else if (statistics.usersNames().size() == 0 && statistics.postsCount() > 0 && statistics.commentsCount() > 0) {
            averageCommentsPerPosts = statistics.commentsCount()/statistics.postsCount();
            System.out.print(averageCommentsPerPosts);
        } else if (statistics.usersNames().size() > 0 && statistics.postsCount() > 0 && statistics.commentsCount() > 0) {
            users = statistics.usersNames().size();
            posts = statistics.postsCount();
            comments = statistics.commentsCount();
            System.out.print(users + posts + comments);
        } else {
            System.out.print("0.0");
        }
        
    }

}
