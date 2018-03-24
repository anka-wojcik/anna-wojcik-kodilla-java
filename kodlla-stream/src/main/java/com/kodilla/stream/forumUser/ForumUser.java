package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public final class ForumUser {
    private final int identifier;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int publishedPostNumber;

    public ForumUser(int identifier, String userName, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int publishedPostNumber) {
        this.identifier = identifier;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.publishedPostNumber = publishedPostNumber;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPublishedPostNumber() {
        return publishedPostNumber;
    }


    @Override
    public String toString() {
        return "ForumUser{" +
                "identifier=" + identifier +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", publishedPostNumber=" + publishedPostNumber +
                '}';
    }
}
