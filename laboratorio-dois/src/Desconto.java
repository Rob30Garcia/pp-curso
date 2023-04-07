import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorDaCompra = scanner.nextDouble();

        if(valorDaCompra >= 200.0) {
            valorDaCompra = valorDaCompra - (valorDaCompra * 0.05);
        }

        System.out.printf("%.2f\n",valorDaCompra);

        scanner.close();
    }
}
