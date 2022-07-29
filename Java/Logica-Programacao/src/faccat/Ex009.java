package faccat;

import java.util.Scanner;

public class Ex009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário: R$");
        float salary = sc.nextFloat();
        System.out.print("Digite o percentual reajuste: ");
        float readjustment = sc.nextFloat();
        sc.close();

        float newSalary = salary + (salary * readjustment / 100);

        System.out.println("Com o reajuste de " + readjustment + "% o novo salário do funcionário é de R$" + newSalary);
    }
}