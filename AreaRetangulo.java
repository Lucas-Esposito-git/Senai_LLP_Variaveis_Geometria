import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do retângulo: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();

        double area = comprimento * largura;

        System.out.printf("A área do retângulo é: %.2f unidades quadradas%n", area);

        scanner.close();
    }
}