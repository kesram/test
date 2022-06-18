package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies(){
        //Given
        User user1 = new Millenials("User1");
        User user2 = new YGeneration("User2");
        User user3 = new ZGeneration("User3");
        //When
        String user1Post = user1.sharePost();
        System.out.println(user1Post);
        String user2Post = user2.sharePost();
        System.out.println(user2Post);
        String user3Post = user3.sharePost();
        System.out.println(user3Post);
        //Then
        assertEquals("Facebook", user1Post);
        assertEquals("Snapchat", user2Post);
        assertEquals("Twitter", user3Post);
    }
    @Test
    void testIndividualSharingStrategy(){
        //Given
        User user1 = new Millenials("User1");
        //When
        String user1Post = user1.sharePost();
        System.out.println("Before change: "+ user1Post);
        user1.setNewPublisher(new SnapchatPublisher());
        user1Post = user1.sharePost();
        System.out.println("After change: " + user1Post);
        //Then
        assertEquals("Snapchat", user1Post);
    }
}
