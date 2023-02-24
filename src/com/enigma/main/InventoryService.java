package com.enigma.main;

import java.util.HashSet;
import java.util.Set;

public interface InventoryService {
    void addBook(Buku buku);
    void deleteBook(String code);
    void updateBook(String code);
    void searchBook(String bookTitle);
    void getAllBook();

}
