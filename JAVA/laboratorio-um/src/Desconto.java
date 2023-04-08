import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valorDaCompra = scan.nextDouble();

        if(valorDaCompra > 200.0) {
            valorDaCompra -= valorDaCompra*0.05;
        }

        System.out.printf("%.2f\n", valorDaCompra);

        scan.close();
    }
}
