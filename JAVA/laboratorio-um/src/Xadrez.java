import java.util.Scanner;

public class Xadrez {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeDeLinhas = scan.nextInt();

        for (int i = 0; i < quantidadeDeLinhas; i++) {
            for (int j = 0; j < quantidadeDeLinhas; j++) {
                if(i % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }

        scan.close();
    }
}
