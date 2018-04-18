package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("Yuki");
        User user2 = new YGeneration("Ren");
        User user3 = new ZGeneration("Sachiko");

        //When
        String user1PreferredPublisher = user1.sharePost();
        System.out.println(user1.getUsername() + "'s " + user1PreferredPublisher);
        String user2PreferredPublisher = user2.sharePost();
        System.out.println(user2.getUsername() + "'s " + user2PreferredPublisher);
        String user3PreferredPublisher = user3.sharePost();
        System.out.println(user3.getUsername() + "'s " + user3PreferredPublisher);

        //Then
        Assert.assertEquals("Preferred social media channel: [Facebook]", user1PreferredPublisher);
        Assert.assertEquals("Preferred social media channel: [Snapchat]", user2PreferredPublisher);
        Assert.assertEquals("Preferred social media channel: [Twitter]", user3PreferredPublisher);
    }

    @Test
    public void testIndividualSharingStrategies() {
        //Given
        User user1 = new Millenials("Yuki");

        //When
        String user1PreferredPublisher = user1.sharePost();
        System.out.println(user1.getUsername() + "'s " + user1PreferredPublisher);
        user1.setSocialPublisher(new SnapchatPublisher());
        user1PreferredPublisher = user1.sharePost();
        System.out.println("Now " + user1.getUsername() + "'s " + user1PreferredPublisher);

        //Then
        Assert.assertEquals("Preferred social media channel: [Snapchat]", user1PreferredPublisher);
    }
}
