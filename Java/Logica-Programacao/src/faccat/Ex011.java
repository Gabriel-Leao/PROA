package faccat;

import java.util.Scanner;

public class Ex011 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário fixo do funcionário: R$");
        float salary = sc.nextFloat();
        System.out.print("Digite quantos carros foram vendidos pelo funcionário: ");
        short qtyCar = sc.nextShort();
        System.out.print("Digite o valor da comissão fixa por carro vendido: R$");
        float commission = sc.nextFloat();
        System.out.print("Digite o valor total das vendas do funcionário: R$");
        float sellsTotalPrice = sc.nextFloat();
        sc.close();

        float totalSalary = salary + (commission * qtyCar) + (5 * sellsTotalPrice / 100);

        System.out.printf("O funcionário vai receber ao todo R$%.2f", totalSalary);
    }
}