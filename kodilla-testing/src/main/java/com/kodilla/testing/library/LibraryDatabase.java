package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {
    // list books having title beginning with titleFragment
    List<Book> listBooksWithCondition(String titleFragment);

    //list books borrowed by the libraryUser
    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    //try to rent a book for libraryUser
    //return true when succeed
    //and return false when book is unavailable to rent
    boolean rentABook(LibraryUser libraryUser, Book book);

    //return all books borrowed by libraryUser to the library
    //returned numbers of books returned (back)
    int returnBooks(LibraryUser libraryUser);
}
