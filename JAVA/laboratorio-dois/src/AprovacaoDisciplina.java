import java.util.Scanner;

public class AprovacaoDisciplina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double notas[] = new double[100];
        int frequencias[]  = new int[100];
        int maximoDeFrequencia;

        double nota = scan.nextDouble();
        int i = 0;
        while (nota >= 0.0) {
            notas[i] = nota;
            i++;
            nota = scan.nextDouble();
        }

        i = 0;
        int frequencia = scan.nextInt();
        while (frequencia >= 0) {
            frequencias[i] = frequencia;
            i++;
            frequencia = scan.nextInt();
        }

        maximoDeFrequencia = scan.nextInt();

        int aprovado = 0;
        int reprovadoPorNota = 0;
        int reprovadoPorFalta = 0;

        for (int j = 0; j < i; j++) {
            if (frequencias[j] < (int) maximoDeFrequencia*0.75) {
                reprovadoPorFalta++;
                continue;
            }

            if (notas[j] < 5.0) {
                reprovadoPorNota++;
                continue;
            }

            aprovado++;
        }

        System.out.printf("%d %d %d\n", aprovado, reprovadoPorNota, reprovadoPorFalta);

        scan.close();
    }
}
