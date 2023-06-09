package com.enigma.main;

import java.util.Objects;

public class Magazine extends Book {
    private String title;
    private String author;
    private Integer year;
    private String code;

    public Magazine(String title, String author, Integer year, String code) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.code = code;
    }

    @Override
    String setAuthor(String newAuthor) {
        return author = newAuthor;
    }

    @Override
    Integer setYear(Integer newYear) {
        return year = newYear;
    }

    @Override
    String setWriter(String newWriter) {
        return null;
    }

    @Override
    String setTitle(String newTitle) {
        return title = newTitle;
    }

    @Override
    String getTitle() {
        return title;
    }

    @Override
    String getCode() {
        return code;
    }

    @Override
    String getAuthor() {
        return author;
    }

    @Override
    Integer year() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(title, magazine.title) && Objects.equals(author, magazine.author) && Objects.equals(year, magazine.year) && Objects.equals(code, magazine.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year, code);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", code='" + code + '\'' +
                '}';
    }
}
