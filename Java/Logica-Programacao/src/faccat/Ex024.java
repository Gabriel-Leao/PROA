package faccat;

import java.util.Scanner;

public class Ex024 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário fixo do funcionário: R$");
        float salary = sc.nextFloat();
        System.out.print("Valor total das vendas: R$");
        float sellsTotal = sc.nextFloat();
        sc.close();

        float finalSalary;

        if (sellsTotal > 1500) {
            finalSalary = salary + (sellsTotal * 5 / 100);
        } else finalSalary = salary + (sellsTotal * 3 / 100);

        System.out.printf("O salário total do funcionário é de R$%.2f\n", finalSalary);
    }
}