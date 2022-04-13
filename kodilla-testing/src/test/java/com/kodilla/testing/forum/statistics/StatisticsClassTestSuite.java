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

    private List<String> generatePostsOrComments(String postOrComment, int quantityPostsOrComments) {
        List<String> list = new ArrayList<>();
        for (int i=0;i<quantityPostsOrComments;i++) {
            list.add(postOrComment);
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
        int users = statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertEquals(0,users);

    }

    @Test
    void testUsersEqualTo100() {
        // Given
        StatisticsClass statisticsClass = new StatisticsClass(statisticsMock);
        List<String> userName = new ArrayList<>();
        for (int i=0;i<100;i++) {
            userName.add("Pablo");
        }
        when(statisticsMock.usersNames()).thenReturn(userName);

        // When
        int users = statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertEquals(100,users);

    }

    @Test
    void testPostsEqualTo0() {
        // Given
        StatisticsClass statisticsClass = new StatisticsClass(statisticsMock);
        List<String> postsOrComments = generatePostsOrComments("ABC", 0);
        when(statisticsMock.postsCount()).thenReturn(postsOrComments.size());

        // When
        int users = statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertEquals(0,users);

    }

    @Test
    void testPostsEqualTo100() {
        // Given
        StatisticsClass statisticsClass = new StatisticsClass(statisticsMock);
        List<String> postsOrComments = generatePostsOrComments("ABC", 100);
        when(statisticsMock.postsCount()).thenReturn(postsOrComments.size());

        // When
        int users = statisticsClass.calculateAdvStatistics(statisticsMock);

        // Then
        Assertions.assertEquals(0,users);

    }

}
