import br.com.testes.modelos.Aluno;

import java.util.Scanner;

public class PrincipalAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.printf("Informe o nome do aluno: ");
        String nome = sc.nextLine();
        aluno.setNome(nome);

        System.out.printf("Informe a primeira nota do aluno: ");
        double nota1 = sc.nextDouble();
        aluno.setNota1(nota1);

        System.out.printf("Informe a segunda nota do aluno: ");
        double nota2 = sc.nextDouble();
        aluno.setNota2(nota2);

        System.out.printf("Informe a terceira nota do aluno: ");
        double nota3 = sc.nextDouble();
        aluno.setNota3(nota3);

        System.out.println("----------Dados do aluno------------");
        System.out.println("Nome: " + aluno.getNome());
        System.out.printf("Nota 1: %.2f", aluno.getNota1());
        System.out.printf("\nNota 2: %.2f", aluno.getNota2());
        System.out.printf("\nNota 3: %.2f", aluno.getNota3());
        System.out.printf("\nMédia: %.2f", aluno.calcularMedia());

        sc.close();

    }
}
