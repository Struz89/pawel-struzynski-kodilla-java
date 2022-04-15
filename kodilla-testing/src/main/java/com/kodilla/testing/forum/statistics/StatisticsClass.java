package com.kodilla.testing.forum.statistics;

public class StatisticsClass {

    public double users = 0;
    public double posts = 0;
    public double comments = 0;

    public double averagePostsPerUsers = 0;
    public double averageCommentsPerUsers = 0;
    public double averageCommentsPerPosts = 0;

    public double calculateAdvStatistics(Statistics statistics) {
        if (statistics.usersNames().size() > 0 && statistics.postsCount() == 0 && statistics.commentsCount() == 0) {
            users = statistics.usersNames().size();
            return users;
        } else if (statistics.postsCount() > 0 && statistics.usersNames().size() == 0 && statistics.commentsCount() == 0) {
            posts = statistics.postsCount();
            return posts;
        } else if (statistics.commentsCount() > 0 && statistics.usersNames().size() == 0 && statistics.postsCount() == 0) {
            comments = statistics.commentsCount();
            return comments;
        } else if (statistics.usersNames().size() > 0 && statistics.postsCount() > 0 && statistics.commentsCount() == 0) {
            averagePostsPerUsers = statistics.postsCount()/statistics.usersNames().size();
            return averagePostsPerUsers;
        } else if (statistics.usersNames().size() > 0 && statistics.postsCount() == 0 && statistics.commentsCount() > 0) {
            averageCommentsPerUsers = statistics.commentsCount()/statistics.usersNames().size();
            return averageCommentsPerUsers;
        } else if (statistics.usersNames().size() == 0 && statistics.postsCount() > 0 && statistics.commentsCount() > 0) {
            averageCommentsPerPosts = statistics.commentsCount()/statistics.postsCount();
            return averageCommentsPerPosts;
        } else if (statistics.usersNames().size() > 0 && statistics.postsCount() > 0 && statistics.commentsCount() > 0) {
            users = statistics.usersNames().size();
            posts = statistics.postsCount();
            comments = statistics.commentsCount();
            return users + posts + comments;
        }
        return 0;
    }

}
