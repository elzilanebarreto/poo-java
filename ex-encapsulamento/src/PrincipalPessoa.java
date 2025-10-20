import br.com.testes.modelos.IdadePessoa;

import java.util.Scanner;

public class PrincipalPessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IdadePessoa idadeP = new IdadePessoa();

        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();
        idadeP.setNome(nome);

        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();
        idadeP.setIdade(idade);

        idadeP.exibirInformacoes();
        idadeP.verificarIdade();
    }
}
