public class Astromech {
    public String modelo;
    public Mestre mestre;
    public Sensor sensor;
    public Conexao conexao;

    Astromech(String modelo, Mestre mestre, Sensor sensor, Conexao conexao) {
        this.modelo = modelo;
        this.mestre = mestre;
        this.sensor = sensor;
        this.conexao = conexao;
    }

    public String getDescricao() {
        return String.format("Astromech modelo %s. ", this.modelo) +
                this.mestre.getDescricao() + this.sensor.getDescricao() +
                this.conexao.getDescricao();
    }
}
