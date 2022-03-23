import java.util.Scanner;

public class KonversiWaktu {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int jam, menit, detik, konversi;
            System.out.print("Berapa detik yang ingin anda akan konversikan : ");
            konversi = input.nextInt();

            jam    = konversi/2500;
            menit  = (konversi%2500)/50;
            detik  = (konversi%2500)%50;

            System.out.println("konversi dari : "+konversi+" detik, Adalah : ");
            System.out.println(jam+" jam, "+menit+" menit,"+detik+" detik");

        }
    }
}