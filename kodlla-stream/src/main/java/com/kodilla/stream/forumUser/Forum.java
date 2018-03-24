package com.kodilla.stream.forumUser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "Sakura", 'F', 2000, 6, 14, 15));
        userList.add(new ForumUser(2, "Tsubaki", 'M', 1998, 1, 6, 1));
        userList.add(new ForumUser(3, "Ren", 'M', 1984, 12, 25, 31));
        userList.add(new ForumUser(4, "Sumire", 'F', 1989, 8, 18, 29));
        userList.add(new ForumUser(5, "Momo", 'M', 2001, 6, 9, 45));
        userList.add(new ForumUser(6, "Ume", 'F', 2001, 11, 30, 5));
        userList.add(new ForumUser(7, "Asagao", 'M', 1981, 4, 21, 0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
