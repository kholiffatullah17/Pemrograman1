import java.text;

public class latihan1 {
    public static void main(String[] args) {
       double angka = 83243463.342235;
       double angkapecahan =0.902235643;

       NumberFormat NumberFormatter = NumberFormat.getNumberInstance();
       NumberFormat CurrencyFormatter = NumberFormat.getCurrencyInstance();
       NumberFormat PercentFormatter = NumberFormat.getPercentInstance();

       String NumberStr = NumberFormatter.format(angka);
       String CurrStr = CurrFormatter.format(angka);
       String percentStr = PercentFormatter.format(angkapecahan);

       System.out.println("double anggka = " + angka + "berformat number : " + NumberStr);
        System.out.println("double angka = " + angka + "berformat currency : " + CurrStr);
        System.out.println("double angkapecahan = " + angkapecahan + "berformat percent : " + percentStr);
        System.out.println();
        System.out.println();

        NumberFormatter.setMaximumIntegerDigits(10);
        CurrencyFormatter.setMaximumFractionDigits(10);
        PercentFormatter.setMaximumFractionDigits(10);

        NumberFormatter.setMaximumIntegerDigits(1);
        CurrencyFormatter.setMaximumFractionDigits(1);
        PercentFormatter.setMaximumFractionDigits(1);

        NumberFormatter.setMaximumIntegerDigits(5);
        CurrencyFormatter.setMaximumFractionDigits(2);
        PercentFormatter.setMaximumFractionDigits(4);

        NumberFormatter.setMaximumIntegerDigits(2);
        CurrencyFormatter.setMaximumFractionDigits(2);
        PercentFormatter.setMaximumFractionDigits(6);

        System.out.println("double angka = " + angka + " berformat number : " + NumberFormatter.format(angka));
        System.out.println("double angka = " + angka + " berformat currency : " + CurrencyFormatter.format(angka));
        System.out.println("double angkapecahan = " + angkapecahan + " berformat percent : " + PercentFormatter.format(angkapecahan));
    }
}