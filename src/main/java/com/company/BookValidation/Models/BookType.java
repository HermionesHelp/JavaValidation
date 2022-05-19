package com.company.BookValidation.Models;

public enum BookType {
    HARDBACK("Hardback"),
    PAPERBACK("Paperback"),
    LARGEPRINT("Large Print"),
    PERIODICAL("Periodical");

    private final String displayName;

    BookType(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return displayName;
    }
}
