package com.karyawan;

public class Karyawan {
    private String id;
    private String nama;

    public Karyawan(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nNama: " + nama;
    }
}
