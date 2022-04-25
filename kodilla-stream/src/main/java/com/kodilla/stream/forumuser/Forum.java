package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum(){
        theForumUserList.add(new ForumUser(1,"MarkLvL",'M', LocalDate.of(1990,3,4), 1));
        theForumUserList.add(new ForumUser(1,"AniLol",'M', LocalDate.of(1999,6,15), 0));
        theForumUserList.add(new ForumUser(1,"TomBom",'M', LocalDate.of(1993,8,6), 15));
        theForumUserList.add(new ForumUser(1,"MaryYey",'F', LocalDate.of(1987,7,3), 15));
        theForumUserList.add(new ForumUser(1,"SarahPop",'F', LocalDate.of(1980,4,9), 15));
    }

    public List<ForumUser> getUserList() {

        return new ArrayList<>(theForumUserList);
    }
}
