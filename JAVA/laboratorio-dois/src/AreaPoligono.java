import java.util.Scanner;

public class AreaPoligono {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double abscissas[] = new double[100];
        double ordenadas[] = new double[100];

        double ponto = scanner.nextDouble();

        int quantidade = 0;
        while (ponto != -1) {
            abscissas[quantidade] = ponto;
            quantidade++;
            ponto = scanner.nextDouble();
        }

        ponto = scanner.nextDouble();
        quantidade = 0;
        while (ponto != -1) {
            ordenadas[quantidade] = ponto;
            quantidade++;
            ponto = scanner.nextDouble();
        }

        double pontos = 0.0;
        for (int i = 0; i <= quantidade - 2; i++) {
            pontos += (abscissas[i+1] + abscissas[i]) * (ordenadas[i+1] - ordenadas[i]);
        }

        double area = (1.0/2.0) * Math.abs(pontos);

        System.out.printf("%.4f\n", area);

        scanner.close();
    }
}
