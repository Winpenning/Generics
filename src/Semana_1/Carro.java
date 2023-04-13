package Semana_1;

public class Carro {
    private boolean ligado = false;
    private  byte marcha = 0;
    private String marca;
    private String modelo;
    private double motorizacao;


    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public byte getMarcha() {
        return marcha;
    }

    public void setMarcha(byte marcha) {
        this.marcha = marcha;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getMotorizacao() {
        return motorizacao;
    }

    public void setMotorizacao(double motorizacao) {
        this.motorizacao = motorizacao;
    }

    public Carro(String marca, String modelo, double motorizacao){
        this.marca = marca;
        this.modelo = modelo;
        this.motorizacao = motorizacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void Ligarcarro(){
        ligado = true;
    }

    public  void Desligarcarro() {
        ligado = false;
    }
    public void adicionarmarcha(){
        marcha++;
    }
    public void reduzirmarcha()
    {
        marcha--;
    }
    public double velociade()
    {
        if (ligado == false) {
            return 0;
        }
        else {
            return ((10 + (marcha*motorizacao)) *Math.random());
        }
    }

    @Override
    public String toString() {
        return "\n"+ marca + " " + modelo + " " + motorizacao
                + "\nLigado: " + ligado + "\nMarcha: " + marcha + "\nVelocidade: " + velociade();
    }
}
