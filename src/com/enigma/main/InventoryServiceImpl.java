package com.enigma.main;

import java.util.HashSet;
import java.util.Set;

public class InventoryServiceImpl implements InventoryService{

    private Set<Book> book = new HashSet<>();

    @Override
    public void addBook(Book book) {
        this.book.add(book);
    }

    @Override
    public void searchBook(String bookTitle) {
        for (Book x : book) {
            if(x.getTitle().equals(bookTitle)) System.out.println(x);
        }
    }

    @Override
    public void getAllBook() {
        System.out.println(Constant.ALL_BOOKS);
        for (Book all : book) {
            System.out.println(all);
        }
    }

    @Override
    public void getCode(String code) {
        for (Book x : book) {
            if(x.getCode().equals(code)) System.out.println(x);}
    }

    @Override
    public void updateMagazine(String code, String title, String author, Integer year) {
        for (Book x : book) {
            if(x.getCode().equals(code)){
                x.setTitle(title);
                x.setAuthor(author);
                x.setYear(year);
            }
        }
    }

    @Override
    public void updateNovel(String code, String title, String author, Integer year, String writer) {
        for (Book x : book) {
            if(x.getCode().equals(code)){
                x.setTitle(title);
                x.setAuthor(author);
                x.setWriter(writer);
                x.setYear(year);
            }
;        }
    }

    @Override
    public void deleteBook(String code) {
        for (Book x : book) {
            if(x.getCode().equals(code)) book.remove(x);
        }
    }

    @Override
    public String toString() {
        return "InventoryServiceImpl{" +
                "buku=" + book +
                '}';
    }
}
