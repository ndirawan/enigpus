package com.enigma.main;

import java.util.HashSet;
import java.util.Set;

public interface InventoryService {
    public void addBook(Buku buku);
    public void searchBook(String bookTitle);
    public void getAllBook();

}
