import java.util.Scanner;

public class MainMusica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Musica musk = new Musica();

        System.out.printf("Digite o título da música: ");
        musk.titulo = sc.nextLine();

        System.out.printf("Digite o nome do artista: ");
        musk.artista = sc.nextLine();

        System.out.printf("Digite o ano de lançamento: ");
        musk.anoLancamento = sc.nextInt();

        System.out.printf("Digite uma nota de avaliação da música: ");
        double valor1 = sc.nextDouble();

        System.out.printf("Digite outra nota de avaliação da música: ");
        double valor2 = sc.nextDouble();

        musk.avaliarMusica(valor1);
        musk.avaliarMusica(valor2);

        musk.fichaTecnica();

        System.out.printf("Média de avaliações da música: %.2f", musk.mediarAvaliacoes());



        sc.close();
    }
}
