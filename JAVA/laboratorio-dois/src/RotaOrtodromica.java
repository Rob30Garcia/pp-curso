import java.util.Scanner;

public class RotaOrtodromica {

    public static double seno(double t1, double t2) {

        double t1Radianos = Math.toRadians(t1);
        double t2Radianos = Math.toRadians(t2);

        double result = Math.sin(t1Radianos) * Math.sin(t2Radianos);
        return result;
    }

    public static double conseno(double t1, double t2, double g1, double g2) {
        double t1Radianos = Math.toRadians(t1);
        double t2Radianos = Math.toRadians(t2);
        double subG1G2 = Math.toRadians(g1 - g2);

        double result = Math.cos(t1Radianos) * Math.cos(t2Radianos) * Math.cos(subG1G2);
        return  result;
    }

    public static double arccos(double t1, double t2, double g1, double g2) {
        double result = Math.acos(seno(t1, t2) + conseno(t1, t2, g1, g2));
        return result;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double t1 = scan.nextDouble();
        double g1 = scan.nextDouble();
        double t2 = scan.nextDouble();
        double g2 = scan.nextDouble();

        double distancia = 6371 * arccos(t1, t2, g1, g2);

        System.out.printf("A distancia entre os pontos (%.6f, %.6f) e (%.6f, %.6f) e de %.2f km",
                t1, g1, t2, g2, distancia);

        scan.close();
    }
}
