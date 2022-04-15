package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsClassTestSuite {

    @Mock
    private Statistics statisticsMock;

    private List<String> generateUsers(String user, int quantityUsers) {
        List<String> list = new ArrayList<>();
        for (int i=0;i<quantityUsers;i++) {
            list.add(user);
        }
        return list;
    }

    @Test
    void testUsersEqualTo0() {
        // Given
        StatisticsClass statisticsClass = new StatisticsClass();
        List<String> userName = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(userName);

        // When
        double users = statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertEquals(0,users);

    }

    @Test
    void testUsersEqualTo100() {
        // Given
        StatisticsClass statisticsClass = new StatisticsClass();
        List<String> userName = generateUsers("Pablo", 100);
        when(statisticsMock.usersNames()).thenReturn(userName);

        // When
        double users = statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertEquals(100,users);

    }

    @Test
    void testPostsEqualTo0() {
        // Given
        StatisticsClass statisticsClass = new StatisticsClass();
        when(statisticsMock.postsCount()).thenReturn(0);

        // When
        double posts = statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertEquals(0,posts);

    }

    @Test
    void testPostsEqualTo1000() {
        // Given
        StatisticsClass statisticsClass = new StatisticsClass();
        when(statisticsMock.postsCount()).thenReturn(1000);

        // When
        double posts = statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertEquals(1000,posts);

    }

    @Test
    void testCommentsEqualTo0() {
        // Given
        StatisticsClass statisticsClass = new StatisticsClass();
        when(statisticsMock.commentsCount()).thenReturn(0);

        // When
        double comments = statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertEquals(0,comments);

    }

    @Test
    void testCommentsEqualTo100() {
        // Given
        StatisticsClass statisticsClass = new StatisticsClass();
        when(statisticsMock.commentsCount()).thenReturn(100);

        // When
        double comments = statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertEquals(100,comments);

    }

    @Test
    void testAveragePostsPerUsers() {
        // Given
        StatisticsClass statisticsClass = new StatisticsClass();
        List<String> userName = generateUsers("Pablo", 10);
        when(statisticsMock.usersNames()).thenReturn(userName);
        when(statisticsMock.postsCount()).thenReturn(1000);

        // When
        double averagePostsPerUsers = statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertEquals(100,averagePostsPerUsers);

    }

    @Test
    void testAverageCommentsPerUsers() {
        // Given
        StatisticsClass statisticsClass = new StatisticsClass();
        List<String> userName = generateUsers("Pablo", 10);
        when(statisticsMock.usersNames()).thenReturn(userName);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        // When
        double averageCommentsPerUsers = statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertEquals(100,averageCommentsPerUsers);

    }

    @Test
    void testAverageCommentsPerPosts() {
        // Given
        StatisticsClass statisticsClass = new StatisticsClass();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        // When
        double averageCommentsPerPosts = statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertEquals(1,averageCommentsPerPosts);

    }

    @Test
    void testSumUsersCommentsAndPosts() {
        // Given
        StatisticsClass statisticsClass = new StatisticsClass();
        List<String> userName = generateUsers("Pablo", 10);
        when(statisticsMock.usersNames()).thenReturn(userName);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        // When
        double all = statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertEquals(2010,all);

    }

}
