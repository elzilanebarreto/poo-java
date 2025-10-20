import br.com.testes.modelos.ContaBancaria;

import java.util.Scanner;

public class PrincipalConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();

        System.out.println("Digite o nome do titular da conta: ");
        conta.titular = sc.nextLine();

        System.out.println("Digite o número da conta: ");
        int numero = sc.nextInt();
        conta.setNumeroConta(numero);

        conta.setSaldo(4500);

        conta.exibirDados();
    }
}
