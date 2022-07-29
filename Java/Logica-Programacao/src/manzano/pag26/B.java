package manzano.pag26;

import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o salário mensal: R$");
        float salary = input.nextFloat();
        System.out.print("Digite o porcentual de reajuste: ");
        float reajuste = input.nextFloat();
        input.close();

        float newSalary = salary + salary * reajuste / 100;

        System.out.printf("O novo salário é de R$%.2f.\n", newSalary);
    }
}