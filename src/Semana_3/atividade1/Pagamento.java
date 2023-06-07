package Semana_3.atividade1;

import java.util.ArrayList;
import java.util.List;

public class Pagamento {
    private String forma;
    private int qtdsParcelas;

    public Pagamento(String forma, int qtdsParcelas) {
        this.forma = forma;
        this.qtdsParcelas = qtdsParcelas;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public int getQtdsParcelas() {
        return qtdsParcelas;
    }

    public void setQtdsParcelas(int qtdsParcelas) {
        this.qtdsParcelas = qtdsParcelas;
    }


    @Override
    public String toString() {
        return "Forma de pagamento: "+ getForma() +
                "\nQuantidade de parcelas: "+ getQtdsParcelas();
    }
}
