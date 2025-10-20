/*Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes,
e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.*/

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacao;

    void fichaTecnica(){
        System.out.println("Título da música: " + titulo);
        System.out.println("Nome do artista: " + artista);
        System.out.println("Ano de lançamento da música: " + anoLancamento);
    }

    void avaliarMusica(double valor){
        avaliacao += valor;
        numAvaliacao++;
    }

    double mediarAvaliacoes(){
        return avaliacao / numAvaliacao;
    }
}
