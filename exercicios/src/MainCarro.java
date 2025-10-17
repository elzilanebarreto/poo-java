import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();

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
