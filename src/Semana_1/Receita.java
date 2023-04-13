package Semana_1;
public class Receita {
    private String nome;
    private String descicao;
    private int numeroporcoes;
    private double custoreceita;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescicao() {
        return descicao;
    }

    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }

    public int getNumeroporcoes() {
        return numeroporcoes;
    }

    public void setNumeroporcoes(int numeroporcoes) {
        this.numeroporcoes = numeroporcoes;
    }

    public double getCustoreceita() {
        return custoreceita;
    }

    public void setCustoreceita(double custoreceita) {
        this.custoreceita = custoreceita;
    }

    public Receita(String nome, String descicao, int numeroporcoes, double custoreceita){
        this.nome = nome;
        this.descicao = descicao;
        this.numeroporcoes = numeroporcoes;
        this.custoreceita = custoreceita;
    }

    public double Custoporcao(){
        return custoreceita/numeroporcoes;
    }

    @Override
    public String toString() {
        return "Nome da receita: " + nome +
               "\nDescrição: " + descicao +
               "\nNúmero de porções" + numeroporcoes +
               "\nCusto por receita: " + custoreceita +
               "\nCusto por porção: " + Custoporcao();
    }
}
