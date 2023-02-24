package com.enigma.main;

public abstract class Book {
    abstract String getTitle();
    abstract String setTitle(String newTitle);
    abstract String getCode();
    abstract String getAuthor();
    abstract String setAuthor(String newAuthor);
    abstract Integer year();
    abstract Integer setYear(Integer newYear);
    abstract String setWriter(String newWriter);
}
