// Todos os metódos serão executados aqui, logo para verificar o método específico da classe, só descomente

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa user = new Pessoa();
        Calculadora calculo = new Calculadora();
        Musica musk = new Musica();
        Carro carro = new Carro();

//        System.out.printf("Digite uma frase: ");
//        user.frase = sc.nextLine();
//        user.exibirFrase();

//        System.out.printf("Informe o valor: ");
//        double valor = sc.nextDouble();
//        double resultado = calculo.dobrarNumero(valor); // Irá guardar o número para ser exibido no método seguinte
//        calculo.exibirValor(resultado);

//        System.out.printf("Digite o título da música: ");
//        musk.titulo = sc.nextLine();
//
//        System.out.printf("Digite o nome do artista: ");
//        musk.artista = sc.nextLine();
//
//        System.out.printf("Digite o ano de lançamento: ");
//        musk.anoLancamento = sc.nextInt();
//
//        System.out.printf("Digite uma nota de avaliação da música: ");
//        double valor1 = sc.nextDouble();
//
//        System.out.printf("Digite outra nota de avaliação da música: ");
//        double valor2 = sc.nextDouble();
//
//        musk.avaliarMusica(valor1);
//        musk.avaliarMusica(valor2);
//
//        musk.fichaTecnica();
//
//        System.out.printf("Média de avaliações da música: %.2f", musk.mediarAvaliacoes());

        System.out.println("Informe o modelo do carro: ");
        carro.modelo = sc.nextLine();

        System.out.println("Informe a cor do carro: ");
        carro.cor = sc.nextLine();

        System.out.println("Informe o ano de lançamento do carro: ");
        carro.anoDeLancamento = sc.nextInt();

        carro.fichaTecnica();
        carro.calcularIdadeDoCarro();

        sc.close();
    }
}
