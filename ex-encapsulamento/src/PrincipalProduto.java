import br.com.testes.modelos.Produto;

import java.util.Scanner;

public class PrincipalProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto prod = new Produto();

        System.out.println("Informe o nome do produto: ");
        String nome = sc.nextLine();
        prod.setNome(nome);

        System.out.println("Informe o preço do produto: ");
        double valor = sc.nextDouble();
        prod.setPreco(valor);

        System.out.println("Informe o valor para a porcentagem do desconto: ");
        double porcentagem = sc.nextDouble();

        System.out.println("Nome do produto: " + prod.getNome());
        System.out.printf("Preco do produto sem desconto: R$%.2f\n", prod.getPreco());
        prod.aplicarDesconto(porcentagem);
        System.out.printf("Preco do produto com desconto: R$%.2f", prod.getPreco());
    }
}
