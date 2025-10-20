import br.com.alura.screenmatch.modelos.Filme;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instanciando um objeto
        Filme meuFilme = new Filme();

        System.out.println("Informe o nome do filme: ");
        String nome = sc.nextLine();
        meuFilme.setNome(nome);

        System.out.println("Informe o ano de lançamento do filme: ");
        int ano = sc.nextInt();
        meuFilme.setAnoDeLancamento(ano);

//        System.out.println("Informe a nota do filme: ");
//        double notasDeAvalicacao = sc.nextDouble();

        System.out.println("Informe a duração em minutos do filme: ");
        int tempo = sc.nextInt();
        meuFilme.setDuracaoEmMinutos(tempo);

        meuFilme.setIncluidoNoPlano(true);

        meuFilme.avaliarFilme(8.5);
        meuFilme.avaliarFilme(5.5);
        meuFilme.avaliarFilme(6.5);

        meuFilme.exibirFichaTecnica();
        System.out.printf("A média das avaliações: %.2f", meuFilme.pegarMedia());

        sc.close();
    }
}