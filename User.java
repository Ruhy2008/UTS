package com.mycompany.uts;


public class User {
    private final int id;
    private final String email;
    private final String password;

    
    public User(int id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public void index() {
        System.out.println("SELECT * FROM user;");
    }

    public void create() {
        System.out.println("-- Menampilkan form tambah user --");
    }

    public void store() {
        System.out.println("INSERT INTO user (id, email, password) VALUES (" + id + ", '" + email + "', '" + password + "');");
    }

    public void edit() {
        System.out.println("-- Menampilkan form edit user --");
    }

    public void update() {
        System.out.println("UPDATE user SET email = '" + email + "', password = '" + password + "' WHERE id = " + id + ";");
    }

    public void destroy() {
        System.out.println("DELETE FROM user WHERE id = " + id + ";");
    }
}
