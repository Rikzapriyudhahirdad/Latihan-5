package BukuTamu;

public class BukuTamuUndangan {

    private String nama;
    private String alamat;
    public static int ID;
    public static final int kuotatamu=20;
    public static int tempatkosong;

    public BukuTamuUndangan() {
        nama = "";
        alamat = "";
    }

    public void setNama(String n) {
        this.nama = n;
//        ID++;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String a) {
        this.alamat = a;
    }

    public String getAlamat() {
        return alamat;
    }
    


    public static int getID(){
        return ID;
    }
    public void Tampil(BukuTamuUndangan buku) {
        System.out.println("******************************************************");
        System.out.println("Nama             : " + buku.getNama());
        System.out.println("Alamat           : " + buku.getAlamat());
        System.out.println("******************************************************");
        ID++;
        System.out.println("\t *)ID TAMU          : " + buku.getID());
        System.out.println("");
        }
    public static void IDTamu(){
        System.out.println("Banyak Tamu : "+ID);
    }

public int getTempatKosong(){
        return tempatkosong;
    }
public static void KursiKosong(){
    tempatkosong = kuotatamu - ID;
    System.out.println("Kursi yang Masih Kosong ada "+tempatkosong+" kursi");
}
    
}
