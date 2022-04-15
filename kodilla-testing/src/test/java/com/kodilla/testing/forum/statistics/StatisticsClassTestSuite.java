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
        StatisticsClass statisticsClass = new StatisticsClass(statisticsMock);
        List<String> userName = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(userName);

        // When
        statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        //Assertions.assertEquals(0,users);

    }

    @Test
    void testUsersEqualTo100() {
        // Given
        StatisticsClass statisticsClass = new StatisticsClass(statisticsMock);
        List<String> userName = generateUsers("Pablo", 100);
        when(statisticsMock.usersNames()).thenReturn(userName);

        // When
        statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        //Assertions.assertEquals(100,users);

    }

    @Test
    void testPostsEqualTo0() {
        // Given
        StatisticsClass statisticsClass = new StatisticsClass(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(0);

        // When
        statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        //Assertions.assertEquals(0,users);

    }

    @Test
    void testPostsEqualTo100() {
        // Given
        StatisticsClass statisticsClass = new StatisticsClass(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(100);

        // When
        statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        //Assertions.assertEquals(0,users);

    }

}
