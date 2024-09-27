// 12S24018 - kelvin yohanes putra
// 12S24043 - desnita pardosi


import java.util.*;
import java.lang.Math;

public class TO2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String isbn, judul, penulis, keterangan;

        isbn = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        int tahunterbit;

        tahunterbit = Integer.parseInt(input.nextLine());
        String penerbit, formatbuku;

        penerbit = input.nextLine();
        formatbuku = input.nextLine();
        double hargapembelian, minimumharga;

        hargapembelian = Double.parseDouble(input.nextLine());
        minimumharga = Double.parseDouble(input.nextLine());
        int stok;

        stok = Integer.parseInt(input.nextLine());
        double rating;

        rating = Double.parseDouble(input.nextLine());
        if (rating >= 4.7) {
            keterangan = "Best Pick";
        } else {
            if (rating >= 4.7) {
                keterangan = "Must Read";
            } else {
                if (rating >= 4.0) {
                    keterangan = "Recommended";
                } else {
                    if (rating >= 3.0) {
                        keterangan = "Average";
                    } else {
                        keterangan = "low";
                    }
                }
            }
        }
        System.out.println(isbn + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbuku + "|" + hargapembelian + "|" + minimumharga + "|" + stok + "|" + toFixed(rating,1) + "|" + keterangan);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

