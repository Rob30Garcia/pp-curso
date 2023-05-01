import java.util.Scanner;

public class TimeFutebol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int golDoTime[] = new int[100];
        int golDoAdversario[] = new int[100];
        int gol = scanner.nextInt();
        int i = 0;
        while (gol >= 0) {
            golDoTime[i] = gol;
            i++;
            gol = scanner.nextInt();
        }

        gol = scanner.nextInt();
        i = 0;
        while (gol >= 0) {
            golDoAdversario[i] = gol;
            i++;
            gol = scanner.nextInt();
        }

        int vitorias = 0;
        int empates = 0;
        int derrotas = 0;

        for (int j = 0; j < i; j++) {
            if(golDoTime[j] > golDoAdversario[j]) {
                vitorias++;
            } else if (golDoTime[j] == golDoAdversario[j]) {
                empates++;
            } else {
                derrotas++;
            }
        }

        System.out.printf("%d %d %d\n", vitorias, empates, derrotas);

        scanner.close();
    }
}
