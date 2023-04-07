public class Sensor {
    public String cor;
    public double resolucao;
    public int framesPorSegundo;

    Sensor() {
        this("Azul", 512.0, 240);
    }

    Sensor(String cor, double resolucao, int framesPorSegundo) {
        this.cor = cor;
        this.resolucao = resolucao;
        this.framesPorSegundo = framesPorSegundo;
    }

    public double getMPixelsPorSegundo() {
        return this.resolucao * this.framesPorSegundo;
    }

    public String getDescricao() {
        return String.format("Sensor: cor=%s, " +
                "resolucao=%.1fMp, " +
                "framesPorSegundo=%dfps, " +
                "mPixelsPorSegundo=%.1fMpps.",this.cor, this.resolucao, this.framesPorSegundo, this.getMPixelsPorSegundo());
    }
}
