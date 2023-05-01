import java.util.Scanner;

public class TanqueCombustivel {
    public static double VolumeDaEsfera(double raio) {
        double volume = (4.0/3.0) * Math.PI * Math.pow(raio, 3);

        return volume;
    }

    public static double VolumeDaCalotaEsferica(double raio, double altura) {
        double volume = (Math.PI/3.0) * Math.pow(altura, 2) * ((3 * raio) - altura);

        return volume;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double raio = scan.nextDouble();
        double altura = scan.nextDouble();
        int tipo = scan.nextInt();

        double volume;

        if(tipo == 1) {
            volume = VolumeDaCalotaEsferica(raio, altura);

            System.out.printf("%.4f\n", volume);

            scan.close();
            return;
        }

        volume = VolumeDaEsfera(raio) - VolumeDaCalotaEsferica(raio, altura);
        System.out.printf("%.4f\n", volume);
        scan.close();
    }
}
