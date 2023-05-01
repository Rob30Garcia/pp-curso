import java.util.Scanner;

public class CifraCesar {
    public final static String alfabeto[]= {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int desloc = scan.nextInt();
        String frase = scan.nextLine();

        frase = frase.substring(1, frase.length());

        char cCifrado;
        for (int i = 0; i < frase.length(); i++) {
            if((frase.charAt(i) - 'a') < 0) {
                System.out.print(frase.charAt(i));
                continue;
            }

            cCifrado = (char) (frase.charAt(i) - 'a');
            cCifrado = (char) ((cCifrado + desloc) % 26);
            cCifrado += 'A';
            System.out.print(cCifrado);
        }


        scan.close();
    }
}
