package com.example.jabels.activityresultexample.util;

public enum Languages {

    ENGLISH("English"),
    RUSSIAN("Russian"),
    UKRAINE("Ukraine");

    private String language;

    Languages(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}
