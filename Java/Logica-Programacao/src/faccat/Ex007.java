package faccat;

import java.util.Scanner;

public class Ex007 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos anos você tem: ");
        short years = sc.nextShort();
        System.out.print("Quantos meses: ");
        short months = sc.nextShort();
        System.out.print("Quantos dias: ");
        short days = sc.nextShort();
        sc.close();

        int yearsToDays = years * 365;
        int monthsToDays = months * 30;
        int totalDays = yearsToDays + monthsToDays + days;

        System.out.println("Sua idade em dias é: " + totalDays);
    }
}