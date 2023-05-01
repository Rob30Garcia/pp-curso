import java.util.Scanner;

public class VolumeCombustivel {
    public static double VolumeDaEsfera(double raio) {
        double volume = (4.0/3.0) * Math.PI * Math.pow(raio, 3);

        return volume;
    }

    public static double VolumeDaCalotaEsferica(double raio, double altura) {
        double volume = (Math.PI/3.0) * Math.pow(altura, 2) * ((3 * raio) - altura);

        return volume;
    }

    public static double VolumeCilindro(double raio, double altura) {
        double volume = Math.PI * Math.pow(raio, 2) * altura;

        return volume;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double H = scan.nextDouble();
        double h = scan.nextDouble();
        double raio = scan.nextDouble();

        if(h > H || raio > H || raio > h || H < 0 || h < 0 || raio < 0) {
            System.out.println("-1.00");
            scan.close();
            return;
        }

        if(h < raio) {

        }

        scan.close();
    }
}
