/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

/**
 *
 * @author SILVI PRISILLIA
 */
public class Perpustakaan {
    
    String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    Bookshelf[] bookshelf = new Bookshelf[10];
    
    abstract class User {
        String id;
        String name;
        String type;
    }
    
    class Member extends User {
        int money;
        int debt; //hutang kalo money kurang
        Book[] borrow = new Book[10]; //buku yang sekarang dipinjam
        Book[] history = new Book[100]; //buku apa saja yang sudah pernah dipinjam
    }
    
    class Admin extends User {
        
    }
    
    class Bookshelf {
        String idBookshelf;
        Book[] books = new Book[50];
    }
    
    class Book {
        String idBook;
        String name;
        String author;
        String genre;
        String publisher;
        int pages;
        int borrowPrice;        
        String status; //ready to borrow or borrowed
    }
    
    class Popularity extends Book {
        int popularityByName;
        int popularityByAuthor;
        int popularityByGenre;
    }
    
    public static void main(String[] args) {
        
    }
    
}
