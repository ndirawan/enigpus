package com.enigma.main;

import java.util.Objects;

public class Novel extends Buku{
    private String title;
    private String author;
    private Integer year;
    private String code;
    private String writer;

    public Novel(String title, String author, Integer year, String code, String writer) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.code = code;
        this.writer = writer;
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
        return writer = newWriter;
    }

    @Override
    String getTitle() {
        return title;
    }

    @Override
    String setTitle(String newTitle) {
        return title = newTitle;
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
        Novel novel = (Novel) o;
        return Objects.equals(title, novel.title) && Objects.equals(author, novel.author) && Objects.equals(year, novel.year) && Objects.equals(code, novel.code) && Objects.equals(writer, novel.writer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year, code, writer);
    }

    @Override
    public String toString() {
        return "Novel{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", code='" + code + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
