package Semana_3;
import Semana_3.atividade2.*;
import Semana_3.atividade1.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        Scanner e = new Scanner(System.in);
        System.out.println("Digite qual gostaria de testar: ");
        byte x = e.nextByte();

        if(x == 1){
            Cliente cliente = new Cliente("Joãozinho", "Avenida Paulista 612 São Paulo");
            Pedido pedido = new Pedido("20 de janeiro", false);
            Item item = new Item("Xbox Series X", 5000, "Console de videogame");
            Item item2 = new Item("Playstation 5", 6000, "Console de videogame");
            Pagamento pagamento = new Pagamento("Débito", 0);
            pedido.setPagamento(pagamento);
            pedido.addItem(item);
            pedido.addItem(item2);
            cliente.addPedido(pedido);
            System.out.println(cliente);
        } else if (x==2) {
            Curso curso = new Curso("AED100","Algoritmos e Estruturas de Dados I");
            Departamento departamento = new Departamento("Departamendo de Computação", "Bloco B");
            Campus campus = new Campus("Santos Dumont","Rua Otávio Ferreira da Silva 612, Vila Velha, Campinas - SP");
            Campus campus2 = new Campus("Santos Dumon","Rua Otávio Ferreira da Silva 612, Vila Velha, Campinas - SP");

            Professor professor = new Professor("Alan Turing", "12345678");
            Instituicao instituicao = new Instituicao("Universidade Estadual de Campinas", "unicamp");

            instituicao.addCampus(instituicao.getCampus(),campus);
            instituicao.addCampus(instituicao.getCampus(),campus2);
            instituicao.printcampus();
        } else {

        }


    }
}
