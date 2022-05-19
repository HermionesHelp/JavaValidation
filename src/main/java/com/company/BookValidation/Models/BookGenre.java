package com.company.BookValidation.Models;

public enum BookGenre {

    FICTION("Fiction"),
    NONFICTION("Non-Fiction"),
    BIOGRAPHY("Biography"),
    REFERENCE("Reference");

    private final String displayName;

    BookGenre(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return displayName;
    }
}
