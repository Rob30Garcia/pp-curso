import java.util.Scanner;

public class Mediana {
    public static void main(String[] args) {
        int numerosParaMediana[] = new int[100];

        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();
        int meio = 0;
        double mediana = 0;

        int i = 0;
        while (numero > 0) {
            numerosParaMediana[i] = numero;
            i++;
            numero = scan.nextInt();
        }

        if (i % 2 == 0 ) {
            meio = i / 2;

            mediana = ((double) (numerosParaMediana[meio] + numerosParaMediana[meio - 1])) / 2.0;
        } else {
            meio = i / 2;
            mediana = numerosParaMediana[meio];
        }

        System.out.printf("%.2f\n", mediana);

        scan.close();
    }
}
