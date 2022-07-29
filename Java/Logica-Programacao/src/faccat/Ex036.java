package faccat;

import java.util.Scanner;

public class Ex036 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade da mulher mais velha: ");
        short mulherVelha = sc.nextShort();
        System.out.print("Digite a idade da mulher mais nova: ");
        short mulherNova = sc.nextShort();
        System.out.print("Digite a idade da homem mais velho: ");
        short homemVelho = sc.nextShort();
        System.out.print("Digite a idade do homem mais novo: ");
        short homemNovo = sc.nextShort();
        sc.close();

        System.out.printf("""
                        A soma das idades da mulher mais nova com o homem mais velho é %d.
                        E o produto das idades da mulher mais velha com o homem mais novo é %d.
                        """, (homemVelho + mulherNova),
                        (mulherVelha * homemNovo));
    }
}