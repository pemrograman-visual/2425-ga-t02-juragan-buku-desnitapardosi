// 12S24018 - kelvin yohanes putra
// 12S24043 - desnita pardosi
import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kodeisbn, judul, penulis, penerbit, formatbuku;
        String keterangan;
        int tahunterbit, stok;
        double hargapembelian, minimummargin, rating;

        kodeisbn = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunterbit = Integer.parseInt(input.nextLine());
        penerbit = input.nextLine();
        formatbuku = input.nextLine();
        hargapembelian = Double.parseDouble(input.nextLine());
        minimummargin = Double.parseDouble(input.nextLine());
        stok = Integer.parseInt(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        if (rating >= 4.7) {
            keterangan = "Best Pick";
        } else {
            if (rating >= 4.5) {
                keterangan = "Must Read";
            } else {
                if (rating >= 4.0) {
                    keterangan = "Recommended";
                } else {
                    if (rating >= 3.0) {
                        keterangan = "Average";
                    } else {
                        keterangan = "Low";
                    }
                }
            }
        }
        System.out.println(kodeisbn + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbuku + "|" + hargapembelian + "|" + minimummargin + "|" + stok + "|" + toFixed(rating,1) + "|" + keterangan);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
