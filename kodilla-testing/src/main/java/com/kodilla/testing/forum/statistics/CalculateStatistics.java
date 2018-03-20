package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;

public class CalculateStatistics {

    int usersNumber;
    int postsNumber;
    int commentsNumber;
    int averPostsNumberPerUser;
    int averCommentsNumberPerUser;
    int averCommentsNumberPerPost;

    Statistics statistics;

    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){
            //metoda obliczajaca wszelkiego rodzaju statystyki i zapamietujaca je w polach klasy

        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();
        if(usersNumber != 0){
            averPostsNumberPerUser = postsNumber / usersNumber;
            averCommentsNumberPerUser = commentsNumber / usersNumber;
        } else {
            averPostsNumberPerUser = 0;
            averCommentsNumberPerUser = 0;
        }
        if(postsNumber != 0){
            averCommentsNumberPerPost = commentsNumber / postsNumber;
        } else {
            averCommentsNumberPerPost = 0;
        }

    }

    public void showStatistics() {
        System.out.println("Forum statistics are as follows:\nnumber of users: " + usersNumber + "\nnumber of posts: " + postsNumber + "\naverage number of posts per user: " + averPostsNumberPerUser + "\naverage number of comments per user: " + averCommentsNumberPerUser + "\naverage number of comments per post: " + averCommentsNumberPerPost);
    }
}
