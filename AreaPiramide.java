import java.util.Scanner;

public class AreaPiramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o comprimento da base: ");
        double comprimento = sc.nextDouble();

        System.out.print("Digite a largura da base: ");
        double largura = sc.nextDouble();

        System.out.print("Digite a altura inclinada (slant height): ");
        double slant = sc.nextDouble();

        double baseArea = comprimento * largura;
        double perimeter = 2 * (comprimento + largura);
        double lateralArea = (perimeter * slant) / 2;
        double totalArea = baseArea + lateralArea;

        System.out.printf("Área da base = %.2f%n", baseArea);
        System.out.printf("Área lateral = %.2f%n", lateralArea);
        System.out.printf("Área total da pirâmide = %.2f unidades quadradas%n", totalArea);

        sc.close();
    }
}