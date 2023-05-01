import java.util.Arrays;
import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String frase = scan.nextLine();
        String f[] = frase.split(" ");

        String palindromo = "";
        for (String item : f) {
            palindromo += item;
        }

        palindromo = palindromo.toUpperCase();

        boolean ePalindromo = true;

        for (int i = 0; i < palindromo.length(); i++) {
            if(palindromo.charAt(i) != palindromo.charAt(palindromo.length() -  1 - i)) {
                ePalindromo = false;
            }
        }

        System.out.print(palindromo + " ");

        if(!ePalindromo){
            System.out.println("0");
            scan.close();
            return;
        }
        System.out.println("1");

        scan.close();
    }
}
