package com.enigma.main;

public interface InventoryService {
    void addBook(Book book);
    void deleteBook(String code);
    void updateNovel(String code, String title, String author, Integer year, String writer);
    void updateMagazine(String code, String title, String author, Integer year);
    void searchBook(String bookTitle);
    void getAllBook();
    void getCode(String code);

}
