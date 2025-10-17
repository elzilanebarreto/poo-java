import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculo = new Calculadora();


        System.out.printf("Informe o valor: ");
        double valor = sc.nextDouble();
        double resultado = calculo.dobrarNumero(valor); // Irá guardar o número para ser exibido no método seguinte
        calculo.exibirValor(resultado);

        sc.close();
    }
}
