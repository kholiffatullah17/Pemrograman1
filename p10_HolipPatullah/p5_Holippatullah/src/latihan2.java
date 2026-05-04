import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in);){
        System.out.print("Masukan sebuah angka :");
        int angka = input.nextInt();
        
        System.out.println("==============");
        
        if (angka == 0){
            System.out.println("Angka yang anda masuka adlah NOL.");
        }else{
            String statusPositif;
            if (angka > 0){
                statusPositif = "Positif"; 
           } else{
                statusPositif = "Negatif";
            }
            
            //cek anggka ganji genap
        String statusGanjil;
        if (angka % 2 == 0){
            statusGanjil = "Genap";
        }else {
            statusGanjil = "Ganjil";
        }
        
        System.out.println("Hasil: Angka" + angka + "adalah " +statusGanjil + " " + statusPositif);
        
        
        }
        System.out.println("===============");
        }       
    }
}