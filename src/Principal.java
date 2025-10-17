import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instanciando um objeto
        Filme meuFilme = new Filme();

        System.out.println("Informe o nome do filme: ");
        meuFilme.nome = sc.nextLine();

        System.out.println("Informe o ano de lançamento do filme: ");
        meuFilme.anoDeLancamento = sc.nextInt();

//        System.out.println("Informe a nota do filme: ");
//        double notasDeAvalicacao = sc.nextDouble();

        System.out.println("Informe a duração em minutos do filme: ");
        meuFilme.duracaoEmMinutos = sc.nextInt();

        meuFilme.avaliarFilme(8.5);
        meuFilme.avaliarFilme(5.5);
        meuFilme.avaliarFilme(6.5);

        meuFilme.exibirFichaTecnica();
        System.out.println("Soma das avaliações: " + meuFilme.somaDasAvaliacoes);
        System.out.printf("A média das avaliações: %.2f", meuFilme.retornarMedia());

        sc.close();
    }
}
