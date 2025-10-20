import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa user = new Pessoa();

        System.out.printf("Digite uma frase: ");
        user.frase = sc.nextLine();
        user.exibirFrase();

        sc.close();
    }
}
