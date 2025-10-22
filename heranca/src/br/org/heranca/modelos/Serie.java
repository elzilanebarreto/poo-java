package br.org.heranca.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private int epidodiosPorTemporada;
    private boolean ativa;
    private int minutosPorTemporada;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpidodiosPorTemporada() {
        return epidodiosPorTemporada;
    }

    public void setEpidodiosPorTemporada(int epidodiosPorTemporada) {
        this.epidodiosPorTemporada = epidodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorTemporada() {
        return minutosPorTemporada;
    }

    public void setMinutosPorTemporada(int minutosPorTemporada) {
        this.minutosPorTemporada = minutosPorTemporada;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * epidodiosPorTemporada * minutosPorTemporada;
    }

    @Override
    public void exibirFichaTecnica() {
        super.exibirFichaTecnica();
        System.out.println("Temporada: " + temporadas);
        System.out.println("Episódios por temporada: " + epidodiosPorTemporada);
        System.out.println("Ativa: " + ativa);
        System.out.println("Minutos por temporada: " + minutosPorTemporada);
    }
}
