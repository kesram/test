package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForum = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> LocalDate.now().getYear() - forumUser.getBirthday().getYear() >= 20)
                .filter(forumUser -> forumUser.getNumberOfPosts()>1)
                .collect(Collectors.toMap(ForumUser::getUserID,forumUser -> forumUser));

        System.out.println("#elements: " + theResultMapOfForum.size());
        theResultMapOfForum.entrySet().stream()
                .map(Entry -> Entry.getKey() + ": " + Entry.getValue())
                .forEach(System.out::println);

//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter((book -> book.getYearOfPublication() > 2005))
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));
//                System.out.println(theResultStringOfBooks);
//
//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter((book -> book.getYearOfPublication() > 2005))
//                .collect(Collectors.toMap(Book::getSignature,book -> book));
//
//        System.out.println("#elements: " + theResultMapOfBooks.size());
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);
    }
}
