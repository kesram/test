package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test end");
    }

    @Mock
    private Statistics statisticsMock;

    public List<String> generateNewUsers(int i){
        List<String> result = new ArrayList<>();
        for(int n = 0; n < i ; n++){
            String userName = "User " + n;
            result.add(userName);
        }
        return result;
    }

    @DisplayName("Number of posts = 0")
    @Test
    void testNumberOfPost0() {
        //Given
        ForumStatistic forumStatistic = new ForumStatistic();
        List<String> resultList = generateNewUsers(5);
        when(statisticsMock.postCount()).thenReturn(0);
        when(statisticsMock.commentCount()).thenReturn(10);
        when(statisticsMock.userName()).thenReturn(resultList);

        //When
        forumStatistic.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(5, forumStatistic.numberOfUsers);
        Assertions.assertEquals(0, forumStatistic.numberOfPosts);
        Assertions.assertEquals(10, forumStatistic.numberOfComments);
        Assertions.assertEquals(0, forumStatistic.averageNumberOfPostsPerUser);
        Assertions.assertEquals(2, forumStatistic.averageNumberOfCommentsPerUser);
        Assertions.assertEquals(0, forumStatistic.averageNumberOfCommentsPerPost);
    }

    @DisplayName("Number of posts = 1000")
    @Test
    void testNumberOfPost1000() {
        //Given
        ForumStatistic forumStatistic = new ForumStatistic();
        List<String> resultList = generateNewUsers(5);
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentCount()).thenReturn(10);
        when(statisticsMock.userName()).thenReturn(resultList);

        //When
        forumStatistic.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(5, forumStatistic.numberOfUsers);
        Assertions.assertEquals(1000, forumStatistic.numberOfPosts);
        Assertions.assertEquals(10, forumStatistic.numberOfComments);
        Assertions.assertEquals(200, forumStatistic.averageNumberOfPostsPerUser);
        Assertions.assertEquals(2, forumStatistic.averageNumberOfCommentsPerUser);
        Assertions.assertEquals(0.01, forumStatistic.averageNumberOfCommentsPerPost);
    }

    @DisplayName("Number of comments = 0")
    @Test
    void testNumberOfComment0() {
        //Given
        ForumStatistic forumStatistic = new ForumStatistic();
        List<String> resultList = generateNewUsers(50);
        when(statisticsMock.postCount()).thenReturn(100);
        when(statisticsMock.commentCount()).thenReturn(0);
        when(statisticsMock.userName()).thenReturn(resultList);

        //When
        forumStatistic.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(50, forumStatistic.numberOfUsers);
        Assertions.assertEquals(100, forumStatistic.numberOfPosts);
        Assertions.assertEquals(0, forumStatistic.numberOfComments);
        Assertions.assertEquals(2, forumStatistic.averageNumberOfPostsPerUser);
        Assertions.assertEquals(0, forumStatistic.averageNumberOfCommentsPerUser);
        Assertions.assertEquals(0, forumStatistic.averageNumberOfCommentsPerPost);
    }

    @DisplayName("More comments than posts")
    @Test
    void testNumberOfCommentsGreaterThanNumberOfPosts() {
        //Given
        ForumStatistic forumStatistic = new ForumStatistic();
        List<String> resultList = generateNewUsers(5);
        when(statisticsMock.postCount()).thenReturn(10);
        when(statisticsMock.commentCount()).thenReturn(100);
        when(statisticsMock.userName()).thenReturn(resultList);

        //When
        forumStatistic.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(5, forumStatistic.numberOfUsers);
        Assertions.assertEquals(10, forumStatistic.numberOfPosts);
        Assertions.assertEquals(100, forumStatistic.numberOfComments);
        Assertions.assertEquals(2, forumStatistic.averageNumberOfPostsPerUser);
        Assertions.assertEquals(20, forumStatistic.averageNumberOfCommentsPerUser);
        Assertions.assertEquals(10, forumStatistic.averageNumberOfCommentsPerPost);
    }

    @DisplayName("More post than comments")
    @Test
    void testNumberOfCommentsLessThanNumberOfPosts() {
        //Given
        ForumStatistic forumStatistic = new ForumStatistic();
        List<String> resultList = generateNewUsers(5);
        when(statisticsMock.postCount()).thenReturn(100);
        when(statisticsMock.commentCount()).thenReturn(10);
        when(statisticsMock.userName()).thenReturn(resultList);

        //When
        forumStatistic.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(5, forumStatistic.numberOfUsers);
        Assertions.assertEquals(100, forumStatistic.numberOfPosts);
        Assertions.assertEquals(10, forumStatistic.numberOfComments);
        Assertions.assertEquals(20, forumStatistic.averageNumberOfPostsPerUser);
        Assertions.assertEquals(2, forumStatistic.averageNumberOfCommentsPerUser);
        Assertions.assertEquals(0.1, forumStatistic.averageNumberOfCommentsPerPost);
    }

    @DisplayName("Number of User = 0")
    @Test
    void testNumberOfUsers0() {
        //Given
        ForumStatistic forumStatistic = new ForumStatistic();
        List<String> resultList = generateNewUsers(0);
        when(statisticsMock.postCount()).thenReturn(0);
        when(statisticsMock.commentCount()).thenReturn(0);
        when(statisticsMock.userName()).thenReturn(resultList);

        //When
        forumStatistic.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0, forumStatistic.numberOfUsers);
        Assertions.assertEquals(0, forumStatistic.numberOfPosts);
        Assertions.assertEquals(0, forumStatistic.numberOfComments);
        Assertions.assertEquals(0, forumStatistic.averageNumberOfPostsPerUser);
        Assertions.assertEquals(0, forumStatistic.averageNumberOfCommentsPerUser);
        Assertions.assertEquals(0, forumStatistic.averageNumberOfCommentsPerPost);
    }

    @DisplayName("Number of users = 100")
    @Test
    void testNumberOfUsers100() {
        //Given
        ForumStatistic forumStatistic = new ForumStatistic();
        List<String> resultList = generateNewUsers(100);
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentCount()).thenReturn(10000);
        when(statisticsMock.userName()).thenReturn(resultList);

        //When
        forumStatistic.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(100, forumStatistic.numberOfUsers);
        Assertions.assertEquals(1000, forumStatistic.numberOfPosts);
        Assertions.assertEquals(10000, forumStatistic.numberOfComments);
        Assertions.assertEquals(10, forumStatistic.averageNumberOfPostsPerUser);
        Assertions.assertEquals(100, forumStatistic.averageNumberOfCommentsPerUser);
        Assertions.assertEquals(10, forumStatistic.averageNumberOfCommentsPerPost);
    }

}
