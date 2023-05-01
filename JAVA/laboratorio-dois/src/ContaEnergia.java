import java.util.Scanner;

public class ContaEnergia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int gasto = scan.nextInt();
        char tipo = scan.next().charAt(0);

        if(gasto < 0) {
            System.out.println("-1.00");
            scan.close();
            return;
        }

        double valorParaPagar = 0.0;
        switch (tipo) {
            case 'R': {
                if(gasto <= 500) {
                    valorParaPagar = gasto * 0.40;
                } else {
                    valorParaPagar = gasto * 0.65;
                }
                break;
            }

            case 'C': {
                if(gasto <= 1000) {
                    valorParaPagar = gasto * 0.55;
                } else {
                    valorParaPagar = gasto * 0.60;
                }
                break;
            }

            case 'I': {
                if(gasto <= 5000) {
                    valorParaPagar = gasto * 0.55;
                } else {
                    valorParaPagar = gasto * 0.60;
                }
                break;
            }

            default:
                System.out.println("-1.00");
                scan.close();
                return;
        }

        System.out.printf("%.2f\n", valorParaPagar);

        scan.close();
    }
}
