package com.enigma.main;

import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    InventoryServiceImpl inventoryService = new InventoryServiceImpl();
    public void screen(){
        System.out.println("====================================");
        System.out.println("======== WELCOME TO ENIGPUS ========");
        System.out.println("====================================");
        System.out.println("Pilih Menu dibawah ini:");
        String[] listMenu = {"Tambahkan Buku", "Lihat List Buku", "Cari Buku Bedasarkan Judul","Edit Buku","Hapus Buku", "Keluar dari Aplikasi"};
        for (int i = 0; i < listMenu.length; i++) {
            System.out.println(i+1 +". " + listMenu[i]);
        }
        System.out.println("====================================");
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
                break;
            case 3:
                search();
                break;
            case 4:
                update();
                break;
            case 5:
                delete();
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Menu " + choosen + " Not Found");
        }screen();
    }
    public void update(){
        System.out.println("====================");
        System.out.println("Pilih Jenis Buku Yang akan diupdate");
        System.out.println("====================");
        System.out.println("1. Novel");
        System.out.println("2. Majalah");
        System.out.println("====================");
        Integer choose = input.nextInt();
        switch (choose){
            case 1 :
                updateNovel();
                break;
            case 2:
                updateMagazine();
                break;
            default:
                System.out.println("CHOOSE NUMBER 1 - 2");
        }
    }
    public void updateNovel(){
        System.out.println("Masukan Kode Buku yang ingin anda Edit: ");
        input.nextLine();
        String edit = input.nextLine();
        System.out.print("Edit Buku kode : " + edit + "\n" );
        inventoryService.getCode(edit);
        System.out.println("Judul Baru :");
        String title = input.nextLine();
        System.out.println("Author Baru :");
        String author = input.nextLine();
        System.out.println("Tahun Terbit Baru :");
        Integer year = input.nextInt();
        System.out.println("Penulis Baru :");
        input.nextLine();
        String writer = input.nextLine();
        inventoryService.updateNovel(edit,title,author,year,writer);
        System.out.println("Sukses EDIT NOVEL");
        System.out.printf(
                "Type: Novel, Code: %s, Judul: %s, Penerbit : %s, Tahun terbit: %d, Penulis: %s",
                edit,title,author,year,writer
        );
        System.out.println();
    }
    public void updateMagazine(){
        System.out.println("Masukan Kode Buku yang ingin anda Edit: ");
        input.nextLine();
        String edit = input.nextLine();
        System.out.print("Edit Buku kode : " + edit + "\n" );
        inventoryService.getCode(edit);
        System.out.println("Judul Baru :");
        String title = input.nextLine();
        System.out.println("Author Baru :");
        String author = input.nextLine();
        System.out.println("Tahun Terbit Baru :");
        Integer year = input.nextInt();
        inventoryService.updateMagazine(edit,title,author,year);
        System.out.println("Sukses EDIT MAJALAH");
        System.out.printf(
                "Type: Novel, Code: %s, Judul: %s, Penerbit : %s, Tahun terbit: %d",
                edit,title,author,year
        );
        System.out.println();
    }
    public void delete(){
        System.out.println("Masukan Kode Buku yang ingin anda hapus: ");
        input.nextLine();
        String delete = input.nextLine();
        System.out.print("Menghapus Buku dengan kode : " + delete + "\n" );
        inventoryService.deleteBook(delete);
    }
    public void search(){
        System.out.println("Pilih Judul buku yang anda cari");
        input.nextLine();
        String search = input.nextLine();
        System.out.print("Hasil pencarian buku dengan judul: " + search + "\n" );
        inventoryService.searchBook(search);
    }
    public void typeBook(){
        System.out.println("====================");
        System.out.println("Inputkan Jenis Buku");
        System.out.println("====================");
        System.out.println("1. Novel");
        System.out.println("2. Majalah");
        System.out.println("====================");
        Integer choose = input.nextInt();
        switch (choose){
            case 1 :
                inputNovel();
                break;
            case 2:
                inputMagazine();
                break;
            default:
                System.out.println("CHOOSE NUMBER 1 - 2");
        }
    }

    public void inputNovel(){
        System.out.println("==========================");
        System.out.println("TAMBAHKAN INFORMASI MAJALAH");
        System.out.println("==========================");
        System.out.println("Inputkan code buku");
        input.nextLine();
        String code = input.nextLine();
        System.out.println("Inputkan judul buku");
        String title = input.nextLine();
        System.out.println("Inputkan penerbit buku");
        String author = input.nextLine();
        System.out.println("Inputkan tahun penerbit");
        Integer year = input.nextInt();
        input.nextLine();
        System.out.println("Inputkan penulis buku");
        String writer = input.nextLine();

        Buku books = new Novel(title, author, year, code, writer);
        inventoryService.addBook(books);
        System.out.printf(
                "Type: Novel, Code: %s, Judul: %s, Penerbit : %s, Tahun terbit: %d, Penulis: %s",
        code,title,author,year,writer
                );
        System.out.println();
    }
    public void inputMagazine(){
        System.out.println("==========================");
        System.out.println("TAMBAHKAN INFORMASI NOVEL");
        System.out.println("==========================");
        System.out.println("Inputkan code buku");
        input.nextLine();
        String code = input.nextLine();
        System.out.println("Inputkan judul buku");
        String title = input.nextLine();
        System.out.println("Inputkan penerbit buku");
        String author = input.nextLine();
        System.out.println("Inputkan tahun penerbit");
        Integer year = input.nextInt();
        input.nextLine();

        Buku books = new Magazine(title, author, year, code);
        inventoryService.addBook(books);
        System.out.printf(
                "Type: Novel, Code: %s, Judul: %s, Penerbit : %s, Tahun terbit: %d",
                code,title,author,year
        );
        System.out.println();
    }
}
