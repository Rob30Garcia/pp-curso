import java.util.Scanner;

public class AnimaisCedulas {
    public static void main(String[] args) {
        String cedulas[] = {"Tartaruga", "Garça", "Arara", "Mico-leão-dourado", "Onça-pintada", "Garoupa"};

        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        switch (valor) {
            case 2:
                System.out.println(cedulas[0]);
                break;
            case 5:
                System.out.println(cedulas[1]);
                break;
            case 10:
                System.out.println(cedulas[2]);
                break;
            case 20:
                System.out.println(cedulas[3]);
                break;
            case 50:
                System.out.println(cedulas[4]);
                break;
            case 100:
                System.out.println(cedulas[5]);
                break;
            default:
                System.out.println("erro");
                break;
        }

        scanner.close();
    }
}
