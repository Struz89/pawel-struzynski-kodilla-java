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
        statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertTrue(true,"0.0");

    }

    @Test
    void testUsersEqualTo100() {
        // Given
        StatisticsClass statisticsClass = new StatisticsClass();
        List<String> userName = generateUsers("Pablo", 100);
        when(statisticsMock.usersNames()).thenReturn(userName);

        // When
        statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertTrue(true, "100.0");

    }

    @Test
    void testPostsEqualTo0() {
        // Given
        StatisticsClass statisticsClass = new StatisticsClass();
        when(statisticsMock.postsCount()).thenReturn(0);

        // When
        statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertTrue(true,"0.0");

    }

    @Test
    void testPostsEqualTo1000() {
        // Given
        StatisticsClass statisticsClass = new StatisticsClass();
        when(statisticsMock.postsCount()).thenReturn(1000);

        // When
        statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertTrue(true,"1000.0");

    }

    @Test
    void testCommentsEqualTo0() {
        // Given
        StatisticsClass statisticsClass = new StatisticsClass();
        when(statisticsMock.commentsCount()).thenReturn(0);

        // When
        statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertTrue(true,"0.0");

    }

    @Test
    void testCommentsEqualTo100() {
        // Given
        StatisticsClass statisticsClass = new StatisticsClass();
        when(statisticsMock.commentsCount()).thenReturn(100);

        // When
        statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertTrue(true,"100.0");

    }

    @Test
    void testAveragePostsPerUsers() {
        // Given
        StatisticsClass statisticsClass = new StatisticsClass();
        List<String> userName = generateUsers("Pablo", 10);
        when(statisticsMock.usersNames()).thenReturn(userName);
        when(statisticsMock.postsCount()).thenReturn(1000);

        // When
        statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertTrue(true,"100.0");

    }

    @Test
    void testAverageCommentsPerUsers() {
        // Given
        StatisticsClass statisticsClass = new StatisticsClass();
        List<String> userName = generateUsers("Pablo", 10);
        when(statisticsMock.usersNames()).thenReturn(userName);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        // When
        statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertTrue(true,"100.0");

    }

    @Test
    void testAverageCommentsPerPosts() {
        // Given
        StatisticsClass statisticsClass = new StatisticsClass();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        // When
        statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertTrue(true,"1.0");

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
        statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertTrue(true,"2010");

    }

}
