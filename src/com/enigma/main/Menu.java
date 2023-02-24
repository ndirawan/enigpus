package com.enigma.main;

import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    InventoryServiceImpl inventoryService = new InventoryServiceImpl();
    public void screen(){
        System.out.println(Constant.HEADER_MENU);
        String[] listMenu = {"Tambahkan Buku", "Lihat List Buku", "Cari Buku Bedasarkan Judul","Edit Buku","Hapus Buku", "Keluar dari Aplikasi"};
        for (int i = 0; i < listMenu.length; i++) {
            System.out.println(i+1 +". " + listMenu[i]);
        }
        System.out.println(Constant.FOOTER);
        Integer choose = input.nextInt();
        allMenu(choose);

    }
    public void allMenu(Integer choosen){
        switch (choosen){
            case 1 :
                typeBook();
                break;
            case 2 :
                inventoryService.getAllBook();
                System.out.println(Constant.FOOTER);
                break;
            case 3:
                search();
                break;
            case 4:
                update();
                break;
            case 5:
                delete();
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println(Constant.MENU_NOT_FOUND);
        }screen();
    }
    public void update(){
        System.out.println(Constant.HEADER_EDIT_BOOKS);
        Integer choose = input.nextInt();
        switch (choose){
            case 1 :
                updateNovel();
                break;
            case 2:
                updateMagazine();
                break;
            default:
                System.out.println(Constant.MENU_NOT_FOUND);
        }
    }
    public void updateNovel(){
        System.out.println(Constant.INPUT_BOOKS);
        input.nextLine();
        String edit = input.nextLine();
        System.out.print("Edit Book kode : " + edit + "\n" );
        inventoryService.getCode(edit);
        System.out.println(Constant.NEW_BOOKS);
        String title = input.nextLine();
        System.out.println(Constant.NEW_AUTHOR);
        String author = input.nextLine();
        System.out.println(Constant.NEW_YEAR);
        Integer year = input.nextInt();
        System.out.println(Constant.NEW_WRITER);
        input.nextLine();
        String writer = input.nextLine();
        inventoryService.updateNovel(edit,title,author,year,writer);
        System.out.println(Constant.SUCCESS);
        System.out.printf(
                "Type: Novel, Code: %s, Judul: %s, Penerbit : %s, Tahun terbit: %d, Penulis: %s",
                edit,title,author,year,writer
        );
        System.out.println(Constant.FOOTER);
    }
    public void updateMagazine(){
        System.out.println(Constant.INPUT_BOOKS);
        input.nextLine();
        String edit = input.nextLine();
        System.out.print("Edit Book kode : " + edit + "\n" );
        inventoryService.getCode(edit);
        System.out.println(Constant.NEW_BOOKS);
        String title = input.nextLine();
        System.out.println(Constant.NEW_AUTHOR);
        String author = input.nextLine();
        System.out.println(Constant.NEW_YEAR);
        Integer year = input.nextInt();
        inventoryService.updateMagazine(edit,title,author,year);
        System.out.println(Constant.SUCCESS);
        System.out.printf(
                "Type: Novel, Code: %s, Judul: %s, Penerbit : %s, Tahun terbit: %d",
                edit,title,author,year
        );
        System.out.println(Constant.FOOTER);
    }
    public void delete(){
        System.out.println(Constant.DELETE_BOOKS);
        input.nextLine();
        String delete = input.nextLine();
        System.out.print("Menghapus Book dengan kode : " + delete + "\n" );
        inventoryService.deleteBook(delete);
    }
    public void search(){
        System.out.println(Constant.SEARCH);
        input.nextLine();
        String search = input.nextLine();
        System.out.print("Hasil pencarian buku dengan judul: " + search + "\n" );
        inventoryService.searchBook(search);
    }
    public void typeBook(){
        System.out.println(Constant.HEADER_CHOOSE_BOOKS);
        Integer choose = input.nextInt();
        switch (choose){
            case 1 :
                inputNovel();
                break;
            case 2:
                inputMagazine();
                break;
            default:
                System.out.println(Constant.MENU_NOT_FOUND);
        }
    }

    public void inputNovel(){
        System.out.println(Constant.HEADER_INPUT_NOVEL);
        input.nextLine();
        String code = input.nextLine();
        System.out.println(Constant.BOOKS);
        String title = input.nextLine();
        System.out.println(Constant.AUTHOR);
        String author = input.nextLine();
        System.out.println(Constant.YEAR);
        Integer year = input.nextInt();
        input.nextLine();
        System.out.println(Constant.WRITER);
        String writer = input.nextLine();

        Book books = new Novel(title, author, year, code, writer);
        inventoryService.addBook(books);
        System.out.printf(
                "Type: Novel, Code: %s, Judul: %s, Penerbit : %s, Tahun terbit: %d, Penulis: %s",
        code,title,author,year,writer
                );
        System.out.println(Constant.FOOTER);
    }
    public void inputMagazine(){
        System.out.println(Constant.HEADER_INPUT_MAGAZINE);
        input.nextLine();
        String code = input.nextLine();
        System.out.println(Constant.BOOKS);
        String title = input.nextLine();
        System.out.println(Constant.AUTHOR);
        String author = input.nextLine();
        System.out.println(Constant.YEAR);
        Integer year = input.nextInt();
        input.nextLine();

        Book books = new Magazine(title, author, year, code);
        inventoryService.addBook(books);
        System.out.printf(
                "Type: Novel, Code: %s, Judul: %s, Penerbit : %s, Tahun terbit: %d",
                code,title,author,year
        );
        System.out.println(Constant.FOOTER);
    }
}
