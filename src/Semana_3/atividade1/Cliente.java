package Semana_3.atividade1;

import java.util.ArrayList;
import java.util.List;

public class Cliente
{
    private String nome;
    private String endereco;
    List<Pedido> pedidos = new ArrayList<Pedido>();
    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    public void addPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Pedido> exibirpedidos() {
        return pedidos;
    }

    @Override
    public String toString() {
        return "-----------------"+
                "\nNome: " + getNome()+
                "\nEndereco: " + getEndereco()+
                "\nPedidos: " + exibirpedidos();
    }
}
