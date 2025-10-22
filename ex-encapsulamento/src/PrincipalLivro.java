import br.com.testes.modelos.Livro;

import java.util.Scanner;

public class PrincipalLivro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro livro = new Livro();

        System.out.printf("Informe o título do livro: ");
        String titulo = sc.nextLine();
        livro.setTitulo(titulo);

        System.out.printf("Informe o autor do livro: ");
        String autor = sc.nextLine();
        livro.setAutor(autor);

        livro.exibirDetalhes();

        sc.close();
    }
}
