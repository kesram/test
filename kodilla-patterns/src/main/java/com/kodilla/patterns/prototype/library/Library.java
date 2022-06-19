package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype<Library> {

    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Set<Book> getBooks(){
        return books;
    }


    public Library shallowCopy() throws CloneNotSupportedException{
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException{
        Library clonedLibrary = super.clone();
        clonedLibrary.books = new HashSet<>();
        Book clonedBook = null;
        for(Book theBook :books){
            clonedLibrary.getBooks().add(theBook);
        }
        return clonedLibrary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
