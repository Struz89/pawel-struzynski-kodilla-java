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
            System.out.println(users);
        } else if (statistics.postsCount() > 0 && statistics.usersNames().size() == 0 && statistics.commentsCount() == 0) {
            posts = statistics.postsCount();
            System.out.println(posts);
        } else if (statistics.commentsCount() > 0 && statistics.usersNames().size() == 0 && statistics.postsCount() == 0) {
            comments = statistics.commentsCount();
            System.out.println(comments);
        } else if (statistics.usersNames().size() > 0 && statistics.postsCount() > 0 && statistics.commentsCount() == 0) {
            averagePostsPerUsers = statistics.postsCount()/statistics.usersNames().size();
            System.out.println(averagePostsPerUsers);
        } else if (statistics.usersNames().size() > 0 && statistics.postsCount() == 0 && statistics.commentsCount() > 0) {
            averageCommentsPerUsers = statistics.commentsCount()/statistics.usersNames().size();
            System.out.println(averageCommentsPerUsers);
        } else if (statistics.usersNames().size() == 0 && statistics.postsCount() > 0 && statistics.commentsCount() > 0) {
            averageCommentsPerPosts = statistics.commentsCount()/statistics.postsCount();
            System.out.println(averageCommentsPerPosts);
        } else if (statistics.usersNames().size() > 0 && statistics.postsCount() > 0 && statistics.commentsCount() > 0) {
            users = statistics.usersNames().size();
            posts = statistics.postsCount();
            comments = statistics.commentsCount();
            System.out.println(users + posts + comments);
        } else {
            System.out.println("0.0");
        }
        
    }

}
