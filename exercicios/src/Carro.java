// Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
public class Carro {
    String modelo, cor;
    int anoDeLancamento;

    void fichaTecnica(){
        System.out.println("--------Ficha Técnica do Carro---------");
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + anoDeLancamento);
    }

    void calcularIdadeDoCarro(){
        int idade = 2025 - anoDeLancamento;

        System.out.println("Idade do carro: " + idade);
    }
}
