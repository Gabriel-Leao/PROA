package faccat;

import java.util.Scanner;

public class Ex012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em F°: ");
        short tempF = sc.nextShort();
        sc.close();

        double tempC = (tempF - 32) / 1.8;

        System.out.printf("A temperatura F°%d corresponde a C°%.0f\n", tempF, tempC);
    }
}