package com.kodilla.testing.forum.statistics;

public class ForumStatistic {
    double numberOfUsers;
    double numberOfPosts;
    double numberOfComments;
    double averageNumberOfPostsPerUser;
    double averageNumberOfCommentsPerUser;
    double averageNumberOfCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        numberOfUsers = statistics.userName().size();
        numberOfPosts = statistics.postCount();
        numberOfComments = statistics.commentCount();

        if(numberOfUsers != 0){
            averageNumberOfPostsPerUser = numberOfPosts / numberOfUsers;
        }else averageNumberOfPostsPerUser = 0;

        if(numberOfUsers != 0){
            averageNumberOfCommentsPerUser = numberOfComments / numberOfUsers;
        } else averageNumberOfCommentsPerUser = 0;

        if(numberOfPosts != 0){
            averageNumberOfCommentsPerPost = numberOfComments / numberOfPosts;
        } else averageNumberOfCommentsPerPost = 0;
    }

    public void showStatistics(){
        System.out.println("numberOfUsers " + numberOfUsers);
        System.out.println("numberOfPosts " + numberOfPosts);
        System.out.println("numberOfComments " + numberOfComments);
        System.out.println("averageNumberOfPostsPerUser " + averageNumberOfPostsPerUser);
        System.out.println("averageNumberOfCommentsPerUser " + averageNumberOfCommentsPerUser);
        System.out.println("averageNumberOfCommentsPerPost: " + averageNumberOfCommentsPerPost);
    }

    public double getNumberOfUsers() {
        return numberOfUsers;
    }

    public double getNumberOfPosts() {
        return numberOfPosts;
    }

    public double getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }
}

