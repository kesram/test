package com.kodilla.spring.library;


import java.util.ArrayList;
import java.util.List;


public final class Library {

    private final List<String> books = new ArrayList<>();
    //private final LibraryDbController libraryDbController; <- dla wstrzykiwania przez konstruktor
    private LibraryDbController libraryDbController;    //<- Adnotacja @Autowired, przy więcej niż 1 konstruktorze

//    @Autowired
//    public void setLibraryDbController(LibraryDbController libraryDbController){
//        this.libraryDbController = libraryDbController;
//    }

    public Library(LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public Library() {
    }

    public void saveToDb(){
        libraryDbController.saveData();
    }

    public void loadFromDb(){
        libraryDbController.loadData();
    }
}
