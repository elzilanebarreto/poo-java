public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.nome = "O poderoso Chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        System.out.println("Nome: " + meuFilme.nome);
    }
}
