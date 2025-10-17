//Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.

public class Calculadora {

    double dobrarNumero(double numero){
        return numero * 2;
    }

    public void exibirValor(double valorDobrado){
        System.out.printf("O dobro do número é: %.2f", valorDobrado);
    }
}
