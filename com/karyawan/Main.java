package com.karyawan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KaryawanManager manager = new KaryawanManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            manager.tampilkanKaryawan();
            System.out.println("Menu:");
            System.out.println("1. Tambah data karyawan");
            System.out.println("2. Ubah data karyawan");
            System.out.println("3. Hapus data karyawan");
            System.out.print("Input [0:EXIT]: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama karyawan: ");
                    String nama = scanner.nextLine();
                    manager.tambahKaryawan(nama);
                    break;
                case 2:
                    System.out.print("Masukkan ID karyawan: ");
                    String idUbah = scanner.nextLine();
                    System.out.print("Masukkan nama karyawan yang baru: ");
                    String namaBaru = scanner.nextLine();
                    manager.ubahKaryawan(idUbah, namaBaru);
                    break;
                case 3:
                    System.out.print("Masukkan ID karyawan: ");
                    String idHapus = scanner.nextLine();
                    manager.hapusKaryawan(idHapus);
                    break;
                case 0:
                    System.out.println("Semua data karyawan telah dihapus dan terima kasih telah menggunakan aplikasi pendataan kamu...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}