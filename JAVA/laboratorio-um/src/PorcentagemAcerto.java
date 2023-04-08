import java.util.Scanner;

public class PorcentagemAcerto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int respostas[] = new int[100];
        int gabarito[] = new int[100];

        int valor = scan.nextInt();

        int quantidade = 0;
        while (valor > 0) {
            respostas[quantidade] = valor;
            valor = scan.nextInt();
            quantidade++;
        }

        valor = scan.nextInt();
        int i = 0;
        while (valor > 0) {
            gabarito[i] = valor;
            valor = scan.nextInt();
            i++;
        }

        int acertos = 0;
        for (int j = 0; j < quantidade; j++) {
            if(respostas[j] == gabarito[j]) {
                acertos++;
            }
        }


        double porcentagem = ((double) acertos)/ (double) quantidade;

        System.out.printf("%.2f\n", porcentagem*100);

        scan.close();
    }
}
