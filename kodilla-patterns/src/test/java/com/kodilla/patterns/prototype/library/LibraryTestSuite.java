package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){
        //Given
        Library travelBooks = new Library("Travel Books");
        IntStream.iterate(1,n->n+1)
                .limit(10)
                .forEach(n-> travelBooks.getBooks().add(new Book("Title"+n, "author"+n, LocalDate.of(1990 +n,01,01))));

        Library clonedLibrary = null;
        try{
            clonedLibrary= travelBooks.shallowCopy();
            clonedLibrary.setName("Shallow Copy");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = travelBooks.deepCopy();
            deepClonedLibrary.setName("Deep Copy");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        
        //When
        travelBooks.getBooks().add(new Book("title12", "author12", LocalDate.now()));
        int result = travelBooks.getBooks().size();
        int result2 = clonedLibrary.getBooks().size();
        int result3 = deepClonedLibrary.getBooks().size();

        //Then
        System.out.println(travelBooks.getBooks());
        System.out.println(clonedLibrary.getBooks());
        System.out.println(deepClonedLibrary.getBooks());
        assertEquals(11,result);
        assertEquals(11,result2);
        assertEquals(10,result3);
        assertEquals(clonedLibrary.getBooks(), travelBooks.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(),travelBooks.getBooks());
    }
}
