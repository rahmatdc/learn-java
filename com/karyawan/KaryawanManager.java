package com.karyawan;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KaryawanManager {
    private List<Karyawan> karyawanList = new ArrayList<>();
    private int counter = 0;
    private String currentDate;

    public KaryawanManager() {
        this.currentDate = getCurrentDate();
    }

    private String getCurrentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return sdf.format(new Date());
    }

    private String generateId() {
        String date = getCurrentDate();
        if (!date.equals(currentDate)) {
            counter = 0;
            currentDate = date;
        }
        counter++;
        return date + String.format("%05d", counter);
    }

    public void tambahKaryawan(String nama) {
        String id = generateId();
        Karyawan karyawan = new Karyawan(id, nama);
        karyawanList.add(karyawan);
        System.out.println("Data karyawan berhasil ditambahkan!");
    }

    public void ubahKaryawan(String id, String namaBaru) {
        for (Karyawan k : karyawanList) {
            if (k.getId().equals(id)) {
                k.setNama(namaBaru);
                System.out.println("Data karyawan berhasil diubah!");
                return;
            }
        }
        System.out.println("Data karyawan tidak ditemukan!");
    }

    public void hapusKaryawan(String id) {
        Iterator<Karyawan> iterator = karyawanList.iterator();
        while (iterator.hasNext()) {
            Karyawan k = iterator.next();
            if (k.getId().equals(id)) {
                iterator.remove();
                System.out.println("Data karyawan berhasil dihapus!");
                return;
            }
        }
        System.out.println("Data karyawan tidak ditemukan!");
    }

    public void tampilkanKaryawan() {
        System.out.println("-- Daftar Karyawan --");
        System.out.println("==========================================================================");
        if (karyawanList.isEmpty()) {
            System.out.println("Tidak ada data karyawan.");
        } else {
            int index = 1;
            for (Karyawan k : karyawanList) {
                System.out.println("Karyawan#" + index++);
                System.out.println(k);
                System.out.println();
            }
        }
        System.out.println("==========================================================================");
    }
}
