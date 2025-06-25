import java.util.Scanner;

public class AreaTubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do tubo (cilindro): ");
        double raio = scanner.nextDouble();

        System.out.print("Digite a altura do tubo: ");
        double altura = scanner.nextDouble();

        double area = 2 * Math.PI * raio * (raio + altura);

        System.out.printf("A área total do tubo é: %.2f unidades quadradas%n", area);

        scanner.close();
    }
}