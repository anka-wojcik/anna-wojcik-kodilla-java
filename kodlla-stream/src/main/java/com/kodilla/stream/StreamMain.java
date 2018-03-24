package com.kodilla.stream;

import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> theResultListOfUsers = forum.getUserList().stream()
                .filter(user -> user.getSex() != 'F')
                .filter(user -> (LocalDate.now().getYear() - user.getBirthDate().getYear()) >= 20)
                .filter(user -> user.getPublishedPostNumber() > 0)
                .collect(Collectors.toMap(ForumUser::getIdentifier, user -> user));

        theResultListOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
