package Semana_3.atividade2;
public class Curso {
    private String codigo;
    private String nome;
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Curso(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
}