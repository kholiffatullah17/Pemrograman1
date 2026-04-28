import java.util.Scanner;

public class tugas1 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ketik bilangan pertama: ");
        int bilangan1 = input.nextInt();

        System.out.print("ketik bilangan kedua: ");
        int bilangan2 = input.nextInt();
        System.out.println("Bilangan pertama: " + bilangan1);
        System.out.println("Bilangan kedua: " + bilangan2);
        System.out.println("Hasil perkalian: " + (bilangan1 * bilangan2));
    }
}