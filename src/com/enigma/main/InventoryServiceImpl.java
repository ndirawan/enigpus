package com.enigma.main;

import java.util.HashSet;
import java.util.Set;

public class InventoryServiceImpl implements InventoryService{

    private Set<Buku> buku = new HashSet<>();

    @Override
    public void addBook(Buku buku) {
        this.buku.add(buku);
    }

    @Override
    public void searchBook(String bookTitle) {
        for (Buku x : buku) {
            if(x.getTitle().equals(bookTitle)) System.out.println(x);
        }
    }

    @Override
    public void getAllBook() {
        System.out.println(Constant.ALL_BOOKS);
        for (Buku all : buku) {
            System.out.println(all);
        }
    }

    @Override
    public void updateBook(String code) {
        Set<Buku> y = new HashSet<>();
        for (Buku x : buku) {
            if(x.getCode().equals(code)) y.add(x);
        }
        System.out.println(y);
    }

    @Override
    public void deleteBook(String code) {
        for (Buku x : buku) {
            if(x.getCode().equals(code)) buku.remove(x);
        }
    }

    @Override
    public String toString() {
        return "InventoryServiceImpl{" +
                "buku=" + buku +
                '}';
    }
}
