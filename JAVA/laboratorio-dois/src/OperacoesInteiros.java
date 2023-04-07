import java.util.Scanner;

public class OperacoesInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeDeNumeros = 0;
        int quantidadeDePares = 0;
        int quantidadeDeImpares = 0;
        int somaTotal = 0;
        int maiorNumero = Integer.MIN_VALUE;
        int menorNumero = Integer.MAX_VALUE;

        int numeroInteiro = scanner.nextInt();
        while (numeroInteiro > 0) {
            while (numeroInteiro > 0) {
                if(numeroInteiro % 2 == 0) {
                    quantidadeDePares++;
                } else {
                    quantidadeDeImpares++;
                }

                if (menorNumero > numeroInteiro) {
                    menorNumero = numeroInteiro;
                }

                if(maiorNumero < numeroInteiro) {
                    maiorNumero = numeroInteiro;
                }

                somaTotal += numeroInteiro;
                quantidadeDeNumeros++;
                numeroInteiro = scanner.nextInt();
            }

            //quantidade de elementos
            System.out.println(quantidadeDeNumeros);

            //quantidade são pares
            System.out.println(quantidadeDePares);

            //quantidades são impares
            System.out.println(quantidadeDeImpares);

            //soma total dos numeros
            System.out.println(somaTotal);

            //media
            System.out.printf("%.2f\n", ((double)somaTotal / (double) quantidadeDeNumeros));

            //maior
            System.out.println(maiorNumero);

            //menor
            System.out.println(menorNumero);

            quantidadeDeNumeros = 0;
            quantidadeDePares = 0;
            quantidadeDeImpares = 0;
            somaTotal = 0;
            maiorNumero = Integer.MIN_VALUE;
            menorNumero = Integer.MAX_VALUE;

            numeroInteiro = scanner.nextInt();
        }

        scanner.close();
    }
}
