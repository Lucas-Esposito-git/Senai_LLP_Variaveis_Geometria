import java.util.Scanner;

public class AreaCaixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o comprimento da caixa: ");
        double comprimento = sc.nextDouble();

        System.out.print("Digite a largura da caixa: ");
        double largura = sc.nextDouble();

        System.out.print("Digite a altura da caixa: ");
        double altura = sc.nextDouble();

        double area = 2 * (comprimento * largura
                         + largura * altura
                         + comprimento * altura);

        System.out.printf("A área total da caixa é: %.2f unidades quadradas%n", area);

        sc.close();
    }
}
