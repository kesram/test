package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final char sex; //'M' lub 'F'
    private final LocalDate birthday;
    private final int numberOfPosts;

    public ForumUser(int userID, String userName, char sex, LocalDate birthday, int numberOfPosts) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.birthday = birthday;
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return userID == forumUser.userID && sex == forumUser.sex && numberOfPosts == forumUser.numberOfPosts && Objects.equals(userName, forumUser.userName) && Objects.equals(birthday, forumUser.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, userName, sex, birthday, numberOfPosts);
    }
}
