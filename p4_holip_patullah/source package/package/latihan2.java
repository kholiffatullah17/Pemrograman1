import java.util.Scanner;
public class latihan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float makan, transport, belanja, total;
        float b_makan, b_transport, b_belanja;

        //s1 startment perintah
              System.out.print("Masukkan biaya makan : ");
              makan = scanner.nextFloat();
              System.out.print("Masukkan biaya transport : ");
              transport = scanner.nextFloat();
              System.out.print("Masukkan biaya belanja : ");
              belanja = scanner.nextFloat();

        //s2 proses
        total = makan + transport + belanja;
        b_makan = (makan / total) * 100;
        b_transport = (transport / total) * 100;
        b_belanja = (belanja / total) * 100;
        

        //s3 statement informasi
        System.out.println("\n--- Hasil Perhitungan Biaya ---");
        System.out.println("Biaya Makan   : " + b_makan + "%");
        System.out.println("Biaya Transport : " + b_transport + "%");
        System.out.println("Biaya Belanja : " + b_belanja + "%");
        System.out.println("-------------------------------");
        System.out.println("Total Biaya : " + total);

    }
}