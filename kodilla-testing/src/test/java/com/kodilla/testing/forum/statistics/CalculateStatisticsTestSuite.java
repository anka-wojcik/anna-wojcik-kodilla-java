package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.CalculateStatistics;
import org.junit.*;
import org.mockito.Mockito;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class CalculateStatisticsTestSuite {
    private static int testCounter = 0;
    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("Initializing CalculateStatistics tests.");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("CalculateStatistics tests completed.");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testCalculateAverageForPostsNumber0(){
        //Given
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        List<String> exUsersNames = new ArrayList<String>();
        exUsersNames.add("mrsmith");
        exUsersNames.add("mrssmith");
        exUsersNames.add("mrnowak");
        exUsersNames.add("mrkowalski");
        int exCommentNumber = 16;
        int exPostNumber = 0;
        Mockito.when(statisticsMock.usersNames()).thenReturn(exUsersNames);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(exCommentNumber);
        Mockito.when(statisticsMock.postsCount()).thenReturn(exPostNumber);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int checkAverPostNumberPerUser = calculateStatistics.averPostsNumberPerUser;
        int checkAverCommentNumberPerUser = calculateStatistics.averCommentsNumberPerUser;
        int checkAverCommentsNumberPerPost = calculateStatistics.averCommentsNumberPerPost;

        //Then
        Assert.assertEquals(0, checkAverPostNumberPerUser);
        Assert.assertEquals(4, checkAverCommentNumberPerUser);
        Assert.assertEquals(0, checkAverCommentsNumberPerPost);
    }

    @Test
    public void testCalculateAverageForPostsNumber1000(){
        //Given
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        List<String> exUsersNames = new ArrayList<String>();
        exUsersNames.add("mrsmith");
        exUsersNames.add("mrssmith");
        exUsersNames.add("mrnowak");
        exUsersNames.add("mrkowalski");
        int exCommentNumber = 16;
        int exPostNumber = 1000;
        Mockito.when(statisticsMock.usersNames()).thenReturn(exUsersNames);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(exCommentNumber);
        Mockito.when(statisticsMock.postsCount()).thenReturn(exPostNumber);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int checkAverPostNumberPerUser = calculateStatistics.averPostsNumberPerUser;
        int checkAverCommentNumberPerUser = calculateStatistics.averCommentsNumberPerUser;
        int checkAverCommentsNumberPerPost = calculateStatistics.averCommentsNumberPerPost;

        //Then
        Assert.assertEquals(250, checkAverPostNumberPerUser);
        Assert.assertEquals(4, checkAverCommentNumberPerUser);
        Assert.assertEquals(0, checkAverCommentsNumberPerPost);
    }

    @Test
    public void testCalculateAverageForCommentsNumber0(){
        //Given
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        List<String> exUsersNames = new ArrayList<String>();
        exUsersNames.add("mrsmith");
        exUsersNames.add("mrssmith");
        exUsersNames.add("mrnowak");
        exUsersNames.add("mrkowalski");
        int exCommentNumber = 0;
        int exPostNumber = 1000;
        Mockito.when(statisticsMock.usersNames()).thenReturn(exUsersNames);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(exCommentNumber);
        Mockito.when(statisticsMock.postsCount()).thenReturn(exPostNumber);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int checkAverPostNumberPerUser = calculateStatistics.averPostsNumberPerUser;
        int checkAverCommentNumberPerUser = calculateStatistics.averCommentsNumberPerUser;
        int checkAverCommentsNumberPerPost = calculateStatistics.averCommentsNumberPerPost;

        //Then
        Assert.assertEquals(250, checkAverPostNumberPerUser);
        Assert.assertEquals(0, checkAverCommentNumberPerUser);
        Assert.assertEquals(0, checkAverCommentsNumberPerPost);
    }
    @Test
    public void testCalculateAverageForCommentsNumberLowerThanPostsNumber(){
        //Given
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        List<String> exUsersNames = new ArrayList<String>();
        exUsersNames.add("mrsmith");
        exUsersNames.add("mrssmith");
        exUsersNames.add("mrnowak");
        exUsersNames.add("mrkowalski");
        int exCommentNumber = 15;
        int exPostNumber = 1000;
        Mockito.when(statisticsMock.usersNames()).thenReturn(exUsersNames);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(exCommentNumber);
        Mockito.when(statisticsMock.postsCount()).thenReturn(exPostNumber);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int checkAverPostNumberPerUser = calculateStatistics.averPostsNumberPerUser;
        int checkAverCommentNumberPerUser = calculateStatistics.averCommentsNumberPerUser;
        int checkAverCommentsNumberPerPost = calculateStatistics.averCommentsNumberPerPost;

        //Then
        Assert.assertEquals(250, checkAverPostNumberPerUser);
        Assert.assertEquals(3, checkAverCommentNumberPerUser);
        Assert.assertEquals(0, checkAverCommentsNumberPerPost);
    }

    @Test
    public void testCalculateAverageForCommentsNumberHigherThanPostsNumber(){
        //Given
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        List<String> exUsersNames = new ArrayList<String>();
        exUsersNames.add("mrsmith");
        exUsersNames.add("mrssmith");
        exUsersNames.add("mrnowak");
        exUsersNames.add("mrkowalski");
        int exCommentNumber = 1500;
        int exPostNumber = 1000;
        Mockito.when(statisticsMock.usersNames()).thenReturn(exUsersNames);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(exCommentNumber);
        Mockito.when(statisticsMock.postsCount()).thenReturn(exPostNumber);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int checkAverPostNumberPerUser = calculateStatistics.averPostsNumberPerUser;
        int checkAverCommentNumberPerUser = calculateStatistics.averCommentsNumberPerUser;
        int checkAverCommentsNumberPerPost = calculateStatistics.averCommentsNumberPerPost;

        //Then
        Assert.assertEquals(250, checkAverPostNumberPerUser);
        Assert.assertEquals(375, checkAverCommentNumberPerUser);
        Assert.assertEquals(1, checkAverCommentsNumberPerPost);
    }

    @Test
    public void testCalculateAverageForUsersNumber0(){
        //Given
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        int exCommentNumber = 1000;
        int exPostNumber = 1000;
        Mockito.when(statisticsMock.commentsCount()).thenReturn(exCommentNumber);
        Mockito.when(statisticsMock.postsCount()).thenReturn(exPostNumber);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int checkAverPostNumberPerUser = calculateStatistics.averPostsNumberPerUser;
        int checkAverCommentNumberPerUser = calculateStatistics.averCommentsNumberPerUser;
        int checkAverCommentsNumberPerPost = calculateStatistics.averCommentsNumberPerPost;

        //Then
        Assert.assertEquals(0, checkAverPostNumberPerUser);
        Assert.assertEquals(0, checkAverCommentNumberPerUser);
        Assert.assertEquals(1, checkAverCommentsNumberPerPost);
    }
    @Test
    public void testCalculateAverageForUsersNumber100(){
        //Given
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        List<String> exUsersNames = new ArrayList<String>();
        byte[] array = new byte[7];
        new Random().nextBytes(array);
        for(int n = 0; n < 10; n++){
            String randomString = new String(array, Charset.forName("UTF-8"));
            exUsersNames.add(randomString);
        }
        int exCommentNumber = 1000;
        int exPostNumber = 1000;
        Mockito.when(statisticsMock.usersNames()).thenReturn(exUsersNames);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(exCommentNumber);
        Mockito.when(statisticsMock.postsCount()).thenReturn(exPostNumber);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int checkAverPostNumberPerUser = calculateStatistics.averPostsNumberPerUser;
        int checkAverCommentNumberPerUser = calculateStatistics.averCommentsNumberPerUser;
        int checkAverCommentsNumberPerPost = calculateStatistics.averCommentsNumberPerPost;

        //Then
        Assert.assertEquals(100, checkAverPostNumberPerUser);
        Assert.assertEquals(100, checkAverCommentNumberPerUser);
        Assert.assertEquals(1, checkAverCommentsNumberPerPost);
    }
}
