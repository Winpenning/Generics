package Semana_3.atividade1;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String data;
    private boolean status;
    private Pagamento pagamento;
    List<Item> carrinho = new ArrayList<Item>(); // SE DER ERRO PROVAVELMENTE TA AQUI
    public Pedido(String data, boolean status) {
        this.data = data;
        this.status = status;
    }
    public void  addItem(Item item){
        carrinho.add(item);
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;

    }

    public boolean isStatus() {
        return status;
    }
    public String returStatus(){
        if(status == false){
            return "Pedido feito";
        }else{
            return "Pedido Finalizado";
        }
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    double total=0;
    public double calcPrecoTotal()
    {
        for(Item i : carrinho){
            total += i.getPreco();
        }
        return total;
    }

    public double calcImposto(){
        double valor=0;

        valor = total * 0.02;
        return valor;
    }
    public List<Item> exibiritem(){
        return carrinho;
    }

    @Override
    public String toString() {
        return "\nData: "+ getData()+
                "\nstatus: " + returStatus()+
                "\npreço total: "+ calcPrecoTotal()+
                "\nimposto total: "+ calcImposto()+
                "\nForma: " + pagamento.getForma()+
                "\nParcelas: " + pagamento.getQtdsParcelas()+
                "\nitens: " + exibiritem();

    }
}
