package faccat;

import java.util.Scanner;

public class Ex022 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite as horas trabalhadas no mês: ");
        float hours = sc.nextFloat();
        System.out.print("Digite o salário por hora: R$");
        float salaryHours = sc.nextFloat();
        sc.close();

        float finalSalary;

        if (hours > 160) {
            finalSalary = hours * (salaryHours + salaryHours * 50 /100);
        } else finalSalary = hours * salaryHours;

        System.out.printf("O salário final do funcionário é de R$%.2f.\n", finalSalary);
    }
}