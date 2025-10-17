import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno.nome = sc.nextLine();

        System.out.println("Digite a idade do aluno: ");
        aluno.idade = sc.nextInt();

        aluno.exibirInformacoes();

        sc.close();
    }
}
