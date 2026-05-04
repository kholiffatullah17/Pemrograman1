import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float makan, transport, belanja, totalSebelumDiskon;
        float besarDiskon, totalSetelahDiskon;
        float persentaseDiskon = 10;

        // s1 statement perintah
        System.out.print("Masukkan biaya makan     : ");
        makan = scanner.nextFloat();
        System.out.print("Masukkan biaya transport : ");
        transport = scanner.nextFloat();
        System.out.print("Masukkan biaya belanja   : ");
        belanja = scanner.nextFloat();

        // s2 proses
        totalSebelumDiskon = makan + transport + belanja;
        besarDiskon = (persentaseDiskon / 100) * totalSebelumDiskon;
        totalSetelahDiskon = totalSebelumDiskon - besarDiskon;

        // s3 statement informasi
        System.out.println("\n--- Rincian Pembayaran ---");
        System.out.println("1. Total Pengeluaran Sebelum Diskon : " + totalSebelumDiskon);
        System.out.println("2. Besar Diskon (10%)               : " + besarDiskon);
        System.out.println("3. Total Pembayaran Setelah Diskon  : " + totalSetelahDiskon);

        scanner.close();
    }
}