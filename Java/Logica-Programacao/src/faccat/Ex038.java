package faccat;

import java.util.Scanner;

public class Ex038 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu usuário: ");
        int user = sc.nextInt();
        System.out.print("Digite a sua senha: ");
        int password = sc.nextInt();
        sc.close();

        if (user != 1234) {
            System.out.println("Usuário inválido!");
        } else if (password != 9999) {
            System.out.println("Senha incorreta!");
        } else System.out.println("Acesso permitido");
    }
}