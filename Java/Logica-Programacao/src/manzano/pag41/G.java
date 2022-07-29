package manzano.pag41;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class G {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n1 = input.nextInt();
        System.out.print("Digite um número inteiro: ");
        int n2 = input.nextInt();
        System.out.print("Digite um número inteiro: ");
        int n3 = input.nextInt();
        System.out.print("Digite um número inteiro: ");
        int n4 = input.nextInt();
        input.close();

        List<Integer> divisive2 = new ArrayList<>();
        List<Integer> divisive3 = new ArrayList<>();

        if (n1 % 2 == 0) {
            divisive2.add(n1);
        } if (n2 % 2 == 0) {
            divisive2.add(n2);
        } if (n3 % 2 == 0) {
            divisive2.add(n3);
        } if (n4 % 2 == 0) {
            divisive2.add(n4);
        }

        if (n1 % 3 == 0) {
            divisive3.add(n1);
        } if (n2 % 3 == 0) {
            divisive3.add(n2);
        } if (n3 % 3 == 0) {
            divisive3.add(n3);
        } if (n4 % 3 == 0) {
            divisive3.add(n4);
        }

        System.out.println(divisive2);
        System.out.println(divisive3);
    }
}