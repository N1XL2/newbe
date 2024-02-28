import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class AgeCalculator {
    public static int hitungUsia(String tanggal_lahir) {
        // Parsing tanggal lahir menjadi objek LocalDate
        LocalDate lahir = LocalDate.parse(tanggal_lahir);

        // Mendapatkan tanggal hari ini
        LocalDate hariIni = LocalDate.now();

        // Menghitung periode antara tanggal lahir
        Period periode = Period.between(lahir, hariIni);

        // Mengembalikan usia dalam tahun
        return periode.getYears();
    }

    public static void main(String[] args) {
        String nama;
        String kelamin;
        String tanggal_lahir;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        nama = input.nextLine();

        System.out.print("Masukkan Jenis Kelamin (L/P) :");
        kelamin = input.nextLine();

        if (kelamin.equals("P")) {
            kelamin = "perempuan";
        } else if (kelamin.equals("L")) {
            kelamin = "laki-laki";
        }

        System.out.print("Masukkan Tanggal lahir (YYYY-MM-DD) :");
        tanggal_lahir = input.nextLine();

        int usia = hitungUsia(tanggal_lahir);

        System.out.println("Nama saya : " + nama);
        System.out.println("Kelamin saya  :" + kelamin);
        System.out.println("Tanggal lahir saya :" + tanggal_lahir);
        System.out.println("Usia saya : " + usia + " tahun");
    }
}
