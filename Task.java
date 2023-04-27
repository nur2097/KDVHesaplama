import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int tutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Tutarı Giriniz :");
        tutar = input.nextInt();

        if (tutar < 1000)
        {
            double KDV = tutar + (tutar * 0.18);
            System.out.println("KDV'siz Tutar :" + tutar);
            System.out.println("KDV'li Tutar :" + KDV);
        }
        else if (tutar > 1000)
        {
            double KDV = tutar + (tutar * 0.8);
            System.out.println("KDV'siz Tutar :" + tutar);
            System.out.println("KDV'li Tutar :" + KDV);

        }
    }
}
