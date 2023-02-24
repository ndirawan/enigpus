package com.enigma.main;

import java.util.HashSet;
import java.util.Set;

public interface InventoryService {
    void addBook(Buku buku);
    void deleteBook(String code);
    void updateNovel(String code, String title, String author, Integer year, String writer);
    void updateMagazine(String code, String title, String author, Integer year);
    void searchBook(String bookTitle);
    void getAllBook();
    void getCode(String code);

}
