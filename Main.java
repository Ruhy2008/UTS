package com.mycompany.uts;


public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== PENGUJIAN CLASS USER ===");
        User user1 = new User(1, "Nabil@.com", "123");
        user1.index();
        user1.store();
        user1.update();
        user1.destroy();
        
        System.out.println("\n=== PENGUJIAN CLASS PENERBIT ===");
        Penerbit penerbit1 = new Penerbit(101, "Gramedia", "Jl. Komplek Listrik 2");
        penerbit1.index();
        penerbit1.store();
        penerbit1.update();
        penerbit1.destroy();
        
        System.out.println("\n=== PENGUJIAN CLASS BUKU ===");
        Buku buku1 = new Buku(501, "Belajar Java OOP", "NabilAlei", 2023, penerbit1);
        buku1.index();
        buku1.store();
        buku1.update();
        buku1.destroy();
    }
}
