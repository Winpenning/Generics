package Semana_1;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        Scanner e1 = new Scanner(System.in);

        System.out.println("Digite qual exercício gostaria de resolver? (2 ou 3)");
        int x = e.nextInt();

        if(x == 2)
        {
            System.out.print("Digite o nome da receita: ");
            String nome = e.next();
            System.out.print("Digite a descrição da receita: ");
            String descriptor = e.next();
            System.out.print("Digite o numero de porções: ");
            int numerologists = e.nextInt();
            System.out.print("Digite o custo da receita: ");
            double resuscitator = e.nextDouble();
            Receita receita = new Receita(nome,descriptor,numerologists,resuscitator);
            System.out.print(receita);
        }
        else if(x == 3)
        {
            JTextField primeirofield = new JTextField(20);
            JTextField segundofield = new JTextField(20);
            JTextField terceirofield = new JTextField(20);
            JPanel painel = new JPanel();
            painel.add(new JLabel("Marca: "));
            painel.add(primeirofield);
            painel.add(new JLabel("Modelo"));
            painel.add(segundofield);
            painel.add(new JLabel("Motorização"));
            painel.add(terceirofield);

            String marca = "";
            String modelo = "";
            double motorizacao = 0;
            int c =JOptionPane.showConfirmDialog(null, painel);
            if(c == JOptionPane.YES_OPTION){
                marca = primeirofield.getText();
                modelo = segundofield.getText();
                motorizacao = Double.parseDouble(terceirofield.getText());
            }
            Carro carro = new Carro(marca,modelo,motorizacao);
            System.out.print(carro);
           int esc0 = 0;
           boolean b = true;
           int xab = 10;
           while (xab == 10){
                JTextField whilefield = new JTextField(10);
                JPanel whilepanel = new JPanel();
                whilepanel.add(new JLabel("1- Ligar carro | 2- Desligar carro | 3- Mostrar informações do veículo    |" +
                        " 4- Adicionar marcha | 5- Reduzir marcha | 6- Sair (encerrar o software)"));
                whilepanel.add(whilefield);
                int a = JOptionPane.showConfirmDialog(null, whilepanel);
                int esc1 = Integer.parseInt(whilefield.getText());

                if (a == JOptionPane.YES_OPTION && esc1 == 1){
                    carro.Ligarcarro();
                } else if ( a == JOptionPane.YES_OPTION && esc1 == 2 ) {
                    carro.Desligarcarro();
                } else if (a == JOptionPane.YES_OPTION && esc1 == 3) {
                    System.out.print(carro);
                    JOptionPane.showMessageDialog(null,carro);
                } else if (a == JOptionPane.YES_OPTION && esc1 == 4) {
                    carro.adicionarmarcha();
                } else if (a == JOptionPane.YES_OPTION && esc1 == 5) {
                    carro.reduzirmarcha();
                } else if (a == JOptionPane.YES_OPTION && esc1 == 6) {
                    xab++;
                }else {
                    JOptionPane.showMessageDialog(null,"Valor inválido!");
                }

           }

        }
        else {
            System.out.println("Erro");
        }

    }
}