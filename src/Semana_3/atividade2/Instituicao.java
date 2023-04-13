package Semana_3.atividade2;
import java.util.*;

public class Instituicao {
    private String nome;
    private String sigla;
    private Campus c;
    List<Campus> campus;
    public String getNome() {
        return nome;
    }

    public List<Campus> getCampus() {
        return campus;
    }

    public void setCampus(List<Campus> campus) {
        this.campus = campus;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public Instituicao(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
        campus = new ArrayList<>();
    }

    public Campus getC() {
        return c;
    }

    public void setC(Campus c) {
        this.c = c;
    }
    public void addCampus(List<Campus> campus, Campus c){
        campus.add(c);
    }
    public void printcampus(){
        for (Campus c: campus) {
            System.out.println("\nNome: "+c.getNome());
        }
    }
    @Override
    public String toString() {
        return "";
    }
}