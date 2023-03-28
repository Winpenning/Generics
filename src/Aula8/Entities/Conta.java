package Aula8.Entities;

public class Conta {
    private int numero;
    private int agencia;
    private double saldo;
    private  String titular;


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Conta(int numero, int agencia, double saldo, String titular){
        this.numero = numero;
        this. agencia = agencia;
        this. saldo = saldo;
        this.titular = titular;
    }

    public void Deposito(double valor){ saldo +=valor;}
    public void Retirada(double valor){saldo -=valor;}

    @Override
    public String toString() {
        return  " numero: " + numero +
                "\n agencia: " + agencia +
                "\n saldo: " + saldo +
                "\n titular: " + titular;
    }
}
