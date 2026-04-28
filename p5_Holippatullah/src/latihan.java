import java.util.Scanner;

public class latihan {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukan presentase kehadiran (%): ");
            int kehadiran = input.nextInt();
            
            System.out.print("Masukan nilai Akhir: ");
            double nilaiakhir = input.nextDouble();
            
            System.out.print("====================");
            
            //validasi kehadiran
            
            if (kehadiran >= 75){
                String grade;
                
                //Logika penentu grade
                if (nilaiakhir >=80){
                    grade = "A";
                }else if(nilaiakhir >= 70){
                    grade = "B";
                }else if(nilaiakhir >= 60){
                    grade = "C";
                }else if(nilaiakhir >= 55){
                    grade = "D";
                }else{
                    grade = "E";
                }
                
                //output
                System.out.println("Status: Mememnuhi syarat kehadiran");
                System.out.println("Nilai Akhir: " + nilaiakhir);
                System.out.println("Grade: " + grade);
            }else{
                System.out.println("status tidak memenuhi syarat kehadiran kuran dari 75%");
                System.out.println("nilai grade tidak dapat di tampilkan");
            }   }
    }
}
