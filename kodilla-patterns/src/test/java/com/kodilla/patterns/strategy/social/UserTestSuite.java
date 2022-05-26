package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User mark = new Millenials("Mark Kowalski");
        User john = new YGeneration("John Kwiatkowski");
        User wayne = new ZGeneration("Wayne Nowak");

        //When
        String markSharing = mark.sharePost();
        System.out.println(markSharing);
        String johnSharing = john.sharePost();
        System.out.println(johnSharing);
        String wayneSharing = wayne.sharePost();
        System.out.println(wayneSharing);

        //Then
        Assertions.assertEquals("Facebook", markSharing);
        Assertions.assertEquals("Twitter", johnSharing);
        Assertions.assertEquals("Snapchat", wayneSharing);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven Malinowski");

        //When
        String stevenSharing = steven.sharePost();
        System.out.println(stevenSharing);
        steven.setSocialPublisher(new SnapchatPublisher());
        stevenSharing = steven.sharePost();
        System.out.println(stevenSharing);

        //Then
        Assertions.assertEquals("Snapchat", stevenSharing);
    }
}
