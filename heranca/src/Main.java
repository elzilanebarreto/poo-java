import br.org.heranca.modelos.Filme;
import br.org.heranca.modelos.Titulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Filme filme1 = new Filme();

        System.out.println("Digite o título: ");
        String titulo = sc.nextLine();
        filme1.setNome(titulo);

        System.out.println("Digite o nome do diretor: ");
        String nomeDiretor= sc.nextLine();
        filme1.setDiretor(nomeDiretor);

        System.out.println("Digite o Ano de Lançamento: ");
        int ano = sc.nextInt();
        filme1.setAnoDeLancamento(ano);

        System.out.println("Digite a Duração (em minutos): ");
        int duracao = sc.nextInt();
        filme1.setDuracaoEmMinutos(duracao);


        filme1.exibirFichaTecnica();

        sc.close();
    }
}
