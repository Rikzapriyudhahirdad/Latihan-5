package BukuTamu;

import java.util.Scanner;

public class mainBukuTamuUndangan {

    public static int banyaktamu = 0;
    public static BukuTamuUndangan buku[] = new BukuTamuUndangan[40];

    public static void main(String[] args) {
        Scanner inS = new Scanner(System.in);
        Scanner inI = new Scanner(System.in);
        BukuTamuUndangan data = new BukuTamuUndangan();
        BukuTamuUndangan data1 = new BukuTamuUndangan();

        int b;
        System.out.println("\t DATA-DATA BUKU TAMU");

        do {
            System.out.println("******************************************************");
            System.out.println("1. MENGISI DATA TAMU");
            System.out.println("2. MELIHAT DATA TAMU");
            System.out.println("3. KELUAR ");
            System.out.print("MASUKKAN PILIHAN: ");
            int pilihan = inI.nextInt();
            System.out.println("******************************************************");
            switch (pilihan) {
                case 1:
                    System.out.print("BERAPA TAMU YANG AKAN DITAMBAHKAN: ");
                    int m = inI.nextInt();
                    for (int q = banyaktamu; q < m; q++) {
                        buku[q] = new BukuTamuUndangan();
                        System.out.println("");
                        int l = q + 1;
                        System.out.println("*) Isi Tamu Ke-" + l);
                        System.out.print("MASUKKAN NAMA             : ");
                        String nama = inS.nextLine();
                        buku[q].setNama(nama);
                        System.out.print("MASUKKAN ALAMAT           : ");
                        String alamat = inS.nextLine();
                        buku[q].setAlamat(alamat);
                        banyaktamu++;
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("");
                    for (int t = 0; t <= buku.length; t++) {
                        if (buku[t] != null) {
                            data1.Tampil(buku[t]);
                        } else {
                            System.out.println("");;
                            break;
                        }
                    }

                    BukuTamuUndangan.IDTamu();
                    BukuTamuUndangan.KursiKosong();
                    break;
                case 3:
                    System.out.println("\t== Terimakasih data tamu telah tersimpan ==");

                    System.exit(0);
                    break;
            }
            System.out.println("");

            System.out.println("Masukkan Data/Pilihan Menu Lagi ? ");
            System.out.println("1. YA");
            System.out.println("2.TIDAK");
            System.out.print("Masukkan Pilihan: ");
            b = inI.nextInt();
        } while (b == 1);
        System.out.println("\t== Terimakasih data tamu telah tersimpan ==");
        System.out.println("");

    }

}
