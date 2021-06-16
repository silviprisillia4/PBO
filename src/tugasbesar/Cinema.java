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
public class Cinema {
    
    class Film {
        String name;
        String genre;
        String[] cast;
        int length;
        double rating;
    }
    
    class Theatre {
        String name;
        String location;
        Film[] film = new Film[10];
    }
    
    class Room extends Theatre {
        String type; //Regular, VIP
        int seatsAvailable;
        int seatsBooked;
        int capacity;
    }
    
    class Cafe {
        String name;
        int price;
        int stocks;
    }
    
    class User {
        String username;
        String pin;
        int money;
    }
    
    class Member extends User {
        int points;
    }
    
    class Admin extends User {
//        ...
    }
    
    public static void main(String[] args) {
        
    }
    
}
