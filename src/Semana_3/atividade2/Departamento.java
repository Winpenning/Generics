package Semana_3.atividade2;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private String endereco;
    List<Curso> curso;
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
    public Departamento(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        curso = new ArrayList<>();
    }
    public int calcCurso(){
        return curso.size();
    }
}
