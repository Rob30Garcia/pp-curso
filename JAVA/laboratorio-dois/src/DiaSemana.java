import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int horasDeTrabalhos[] = new int[7];

        int horasPorDia = scan.nextInt();

        int i = 0;
        int j = 0;
        while(horasPorDia > 0) {
            if(i == 7) {
                i = 0;
                j++;
            }
            horasDeTrabalhos[i] += horasPorDia;
            i++;
            horasPorDia = scan.nextInt();
        }

        int maior = horasDeTrabalhos[0];

        for (int k = 1; k < horasDeTrabalhos.length; k++) {
            if(maior < horasDeTrabalhos[k]) {
                maior = horasDeTrabalhos[k];
            }
        }

        for (int k = 0; k < horasDeTrabalhos.length; k++) {
            if(maior == horasDeTrabalhos[k]) {
                System.out.println(k+1);
            }
        }

        scan.close();
    }
}
