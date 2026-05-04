package com.mycompany.uts;


public class Buku {
    private final int id;
    private final String judul;
    private final String penulis;
    private final int tahun;
    private final Penerbit penerbit; 

   
    public Buku(int id, String judul, String penulis, int tahun, Penerbit penerbit) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
        this.penerbit = penerbit;
    }

    public void index() {
        System.out.println("SELECT * FROM buku;");
    }

    public void create() {
        System.out.println("-- Menampilkan form tambah buku --");
    }

    public void store() {
        
        System.out.println("INSERT INTO buku (id, judul, penulis, tahun, penerbit_id) VALUES (" + id + ", '" + judul + "', '" + penulis + "', " + tahun + ", " + penerbit.getId() + ");");
    }

    public void edit() {
        System.out.println("-- Menampilkan form edit buku --");
    }

    public void update() {
        System.out.println("UPDATE buku SET judul = '" + judul + "', penulis = '" + penulis + "', tahun = " + tahun + ", penerbit_id = " + penerbit.getId() + " WHERE id = " + id + ";");
    }

    public void destroy() {
        System.out.println("DELETE FROM buku WHERE id = " + id + ";");
    }
}
