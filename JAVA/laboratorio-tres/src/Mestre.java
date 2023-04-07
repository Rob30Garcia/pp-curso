public class Mestre {
    public String nome;
    public int anoNascimento;
    public String afiliacao;
    public String posto;

    Mestre() {
        this("Luke Skywalker", 19, "Alianca para Restauracao da Republica", "Jedi");
    }

    Mestre(String nome, int anoNascimento, String afiliacao, String posto) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.afiliacao = afiliacao;
        this.posto = posto;
    }

    public int getIdade(int anoReferencia) {
        int idade = anoReferencia - this.anoNascimento;

        return idade;
    }

    public String getAnoNascimentoString() {
        if(this.anoNascimento > 0) {
            return String.format("%dDBY", this.anoNascimento);
        }

        return String.format("%dABY", -this.anoNascimento);
    }

    public boolean possuiForca() {
        if(this.posto == "Jedi" || this.posto == "Sith") {
            return true;
        }

        return false;
    }

    public String getDescricao() {
        return String.format("Mestre: nome=%s, anoNascimento=%s, " +
                "afiliacao=%s, " +
                "posto=%s, possuiForca=%b.", this.nome, this.getAnoNascimentoString(),
                    this.afiliacao, this.posto, this.possuiForca());
    }
}
