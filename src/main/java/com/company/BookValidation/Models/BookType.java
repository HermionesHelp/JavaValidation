package com.company.BookValidation.Models;

public enum BookType {

    FICTION("Fiction"),
    NONFICTION("Non-Fiction"),
    BIOGRAPHY("Biography"),
    REFERENCE("Reference");

    private final String displayName;

    BookType(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return displayName;
    }
}
