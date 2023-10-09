 package Titik;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner masukkan = new Scanner(System.in);
        Titik t1 = new Titik();
        Titik t2 = new Titik();
        boolean keluar = false;
        int pilihan = -1;
        String ulang;
        do {
            System.out.println("Menu operasi titik");
            System.out.println("1. Inisialisasi titik");
            System.out.println("2. Tampil titik");
            System.out.println("3. Perkalian Skalar titik");
            System.out.println("4. Pencerminan terhadap sumbu x");
            System.out.println("5. Percerminan terhadap sumbu y");
            System.out.println("6. Jarak antara kedua titik");
            System.out.println("0. Keluar");
            System.out.println("Masukkan pilihan :");
            pilihan = masukkan.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan koordinat titik 1 ( x y ) :");
                    int x1 = masukkan.nextInt();
                    int y1 = masukkan.nextInt();
                    t1.inisialisasiTitik(x1, y1);
                    System.out.print("Masukkan koordinat titik 2 ( x y ) :");
                    int x2 = masukkan.nextInt();
                    int y2 = masukkan.nextInt();
                    t1.inisialisasiTitik(x2, y2);
                    System.out.print("Keluar? (y/t) :");
                    ulang = masukkan.next();
                    if (ulang.equalsIgnoreCase("t")) {
                        keluar = false;
                    } else if (ulang.equalsIgnoreCase("y")) {
                        keluar = true;
                        System.out.println("Terima kasih sudah menggunakan program ini");
                    } else {
                        System.out.println("Pilihan tidak ditemukan");
                    }
                    break;
                case 2 :
                    ;
                    System.out.print("Titik 1:");
                    t1.tampilTitik();
                    System.out.print("Titik 2:");
                    t2.tampilTitik();
                    System.out.print("Keluar? (y/t) :");
                    ulang = masukkan.next();
                    if (ulang.equalsIgnoreCase("t")) {
                        keluar = false;
                    } else if (ulang.equalsIgnoreCase("y")) {
                        keluar = true;
                        System.out.println("Terima kasih sudah menggunakan program ini");
                    } else {
                        System.out.println("Pilihan tidak ditemukan");
                    }
                    break;
                case 3 :
                    ;
                    System.out.print("Masukkan Skalar:");
                    int skalar = masukkan.nextInt();
                    t1.perkalianSkalar(skalar);
                    t2.perkalianSkalar(skalar);
                    System.out.print("Titik 1:");
                    t1.tampilTitik();
                    System.out.print("Titik 2:");
                    t2.tampilTitik();
                    System.out.print("Keluar? (y/t) :");
                    ulang = masukkan.next();
                    if (ulang.equalsIgnoreCase("t")) {
                        keluar = false;
                    } else if (ulang.equalsIgnoreCase("y")) {
                        keluar = true;
                        System.out.println("Terima kasih sudah menggunakan program ini");
                    } else {
                        System.out.println("Pilihan tidak ditemukan");
                    }
                    break;
                case 4:
                    t1.pencerminanSumbuX();
                    t2.pencerminanSumbuX();
                    System.out.print("Titik 1 :");
                    t1.tampilTitik();
                    System.out.print("Titik 2:");
                    t2.tampilTitik();
                    System.out.print("Keluar? (y/t) :");
                    ulang = masukkan.next();
                    if (ulang.equalsIgnoreCase("t")) {
                        keluar = false;
                    } else if (ulang.equalsIgnoreCase("y")) {
                        keluar = true;
                        System.out.println("Terima kasih sudah menggunakan program ini");
                    } else {
                        System.out.println("Pilihan tidak ditemukan");
                    }
                    break;
                case 6:
                    int jarak = t1.jarak(t2);
                    System.out.println("Jarak antara titik 1 dan titik 2 : " + jarak);
                    System.out.print("Keluar? (y/t) :");
                    ulang = masukkan.next();
                    if (ulang.equalsIgnoreCase("t")) {
                        keluar = false;
                    } else if (ulang.equalsIgnoreCase("y")) {
                        keluar = true;
                        System.out.println("Terima kasih sudah menggunakan program ini");
                    } else {
                        System.out.println("Pilihan tidak ditemukan");
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih sudah menggunakan program ini");
                    keluar = true;
                    break;
                default:
                    System.out.println("Pilihan tidak ditemukan");
                    System.out.println("Masukkan ulang pilihan ( y / t )");
                    ulang = masukkan.next();
                    if (ulang.equalsIgnoreCase("t")) {
                        keluar = false;
                    } else if (ulang.equalsIgnoreCase("y")) {
                        keluar = true;
                        System.out.println("Terima kasih sudah menggunakan program ini");
                    } else {
                        System.out.println("Pilihan tidak ditemukan");
                    }
            }

        }while (keluar == false);
    }
}
