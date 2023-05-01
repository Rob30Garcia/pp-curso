import java.util.Scanner;

public class DataExtenso {
    public final static String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho",
            "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String data = scan.nextLine();

        int dia = Integer.parseInt(data.substring(0, 2));
        int mes = Integer.parseInt(data.substring(2, 4));
        int ano = Integer.parseInt(data.substring(4, 8));

        String dataExtenso = String.format("%d de %s de %d", dia, meses[mes - 1], ano);

        System.out.println(dataExtenso);

        scan.close();
    }
}
