public class Conexao {
    public String tipoPorta;
    public int idProtocolo;
    public int taxaTransmissao;

    Conexao() {
        this("SCOMP Link", 1, 4096000);
    }

    Conexao(String tipoPorta, int idProtocolo, int taxaTransmissao){
        this.tipoPorta = tipoPorta;
        this.idProtocolo = idProtocolo;
        this.taxaTransmissao = taxaTransmissao;
    }

    public String getProtocoloString() {
        switch (this.idProtocolo) {
            case 1:
                return "Rotoscope";
            case 2:
                return "Acustico";
            case 3:
                return "Radio";
            default:
                return "Outros";
        }
    }

    public double getTaxaMBps() {
        return ((double) this.taxaTransmissao) / 1024.0;
    }

    public String getDescricao() {
        return String.format("Conexao: tipoPorta=%s, " +
                "protocolo=%s, " +
                "taxaTransmissao=%.1fMBps.", this.tipoPorta, this.getProtocoloString(), this.getTaxaMBps());
    }
}
