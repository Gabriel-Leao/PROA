package manzano.pag50;

import java.util.Scanner;

public class J {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dividendo: ");
        short dividendo = sc.nextShort();
        System.out.print("Digite o divisor: ");
        short divisor = sc.nextShort();
        sc.close();

        int quociente = 0;
        int aux = dividendo;

        do {
            aux = aux - divisor;
            quociente++;
        } while (aux >= divisor);

        System.out.printf("%d / %d = %d.\n", dividendo, divisor,  quociente);
    }
}