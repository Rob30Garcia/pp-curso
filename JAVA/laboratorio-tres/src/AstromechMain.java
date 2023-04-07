public class AstromechMain {
    public static void main(String[] args) {
        Mestre mestre = new Mestre();

        System.out.println(mestre.getDescricao());

        Mestre m = new Mestre("Kanan Jarrus", -33, "Jedi Order", "Jedi");
        System.out.println(m.getIdade(-5));
        System.out.println(m.getAnoNascimentoString());

        System.out.println();

        Sensor sensor = new Sensor();
        System.out.println(sensor.getDescricao());

        System.out.println();

        Conexao conexao = new Conexao();
        System.out.println(conexao.getDescricao());

        Astromech astromech = new Astromech("R2-D2", m, sensor, conexao);
        System.out.println(astromech.getDescricao());
    }
}