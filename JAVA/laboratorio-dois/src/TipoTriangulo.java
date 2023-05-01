import java.util.Scanner;

public class TipoTriangulo {

    public static boolean VerificarSeETriangulo(int a, int b, int c) {
        if(a  < 0 || b < 0 || c < 0) {
            return false;
        }

        if(Math.abs(a - b) < c && c < a + b && Math.abs(a - c) < b && b < a + c && Math.abs(c - b) < a && a < c + b   ) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean isTriangle = VerificarSeETriangulo(a, b, c);

        if (!isTriangle) {
            System.out.println("invalido");
            scanner.close();
            return;
        }

        if(a == b && b == c && a == c) {
            System.out.println("equilatero");
        } else if (a == b || b == c || c == a) {
            System.out.println("isosceles");
        } else {
           System.out.println("escaleno");
        }

        scanner.close();
    }
}
