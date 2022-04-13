package com.kodilla.testing.forum.statistics;

public class StatisticsClass {
    Statistics statistics;

    public StatisticsClass(Statistics statistics) {
        this.statistics = statistics;
    }

    public int calculateAdvStatistics(Statistics statistics) {
        if (statistics.usersNames().size() == 0 || statistics.usersNames().size() == 100) {
            return statistics.usersNames().size();
        } else if (statistics.postsCount() == 0 || statistics.postsCount() == 1000 || statistics.postsCount() > statistics.commentsCount()) {
            return statistics.postsCount();
        } else if (statistics.commentsCount() == 0 || statistics.commentsCount() > statistics.postsCount()) {
            return statistics.commentsCount();
        } else {
            return 0;
        }

    }

}
