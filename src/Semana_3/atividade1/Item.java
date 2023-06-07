package Semana_3.atividade1;

public class Item {
    private String nome;
    private double preco;
    private String descricao;
    public Item(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return  "\n--------------"+
                "\n-Nome: " + getNome()+
                "\n-Descrição: " + getDescricao()+
                "\n-Preço: " +getPreco();
    }
}
