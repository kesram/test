package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Author 1", "Title 1", 2021, "signature1"));
        books.add(new Book("Author 2", "Title 2", 2021, "signature2"));
        books.add(new Book("Author 3", "Title 3", 2021, "signature3"));
        books.add(new Book("Author 4", "Title 4", 2021, "signature4"));
        books.add(new Book("Author 5", "Title 5", 1999, "signature5"));
        books.add(new Book("Author 6", "Title 6", 1999, "signature6"));

        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(books);
        //Then
        Assertions.assertEquals(2021, median);
    }
}