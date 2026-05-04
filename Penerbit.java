package com.mycompany.uts;


public class Penerbit {
    private final int id;
    private final String namaPenerbit;
    private final String alamatPenerbit;

    
    public Penerbit(int id, String namaPenerbit, String alamatPenerbit) {
        this.id = id;
        this.namaPenerbit = namaPenerbit;
        this.alamatPenerbit = alamatPenerbit;
    }

    
    public int getId() {
        return id;
    }

    public void index() {
        System.out.println("SELECT * FROM penerbit;");
    }

    public void create() {
        System.out.println("-- Menampilkan form tambah penerbit --");
    }

    public void store() {
        System.out.println("INSERT INTO penerbit (id, namaPenerbit, alamatPenerbit) VALUES (" + id + ", '" + namaPenerbit + "', '" + alamatPenerbit + "');");
    }

    public void edit() {
        System.out.println("-- Menampilkan form edit penerbit --");
    }

    public void update() {
        System.out.println("UPDATE penerbit SET namaPenerbit = '" + namaPenerbit + "', alamatPenerbit = '" + alamatPenerbit + "' WHERE id = " + id + ";");
    }

    public void destroy() {
        System.out.println("DELETE FROM penerbit WHERE id = " + id + ";");
    }
}
