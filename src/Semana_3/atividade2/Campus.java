package Semana_3.atividade2;
import java.util.ArrayList;
import java.util.List;
public class Campus {
    private String nome;
    private String endereco;
    private Professor p;

    public Professor getP() {
        return p;
    }

    public void setP(Professor p) {
        this.p = p;
    }

    private List<Professor> professor;
    private List<Departamento> departamento;
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
    public Campus(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        professor = new ArrayList<>();
        departamento = new ArrayList<>();
    }
    public int calcDepartamento(){
        return departamento.size(); //RETORNAR O NÚMERO DE DEPARTAMENTO
    }
    public int calcProfessor(){
        return professor.size(); //RETORNAR O NÚMERO DE DEPARTAMENTO
    }
    public void addProfessor(List<Professor> professor, Professor p){
        professor.add(p);
    }

}
