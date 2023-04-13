package Semana_2;

import java.util.Scanner;

public class Corvertendo {
    public static void main(String[] args){
        Scanner escaneador = new Scanner(System.in);
        System.out.println("Entre com um valor: ");
        String valornaoconvertido = escaneador.next();
        Integer valorconvertido = Integer.parseInt(valornaoconvertido);
        System.out.println(valorconvertido);
        System.out.println("Entre com um valor: ");
        Integer valornaoconvertido1 = escaneador.nextInt();
        String valorconvertido1 = String.valueOf(valornaoconvertido1);
        System.out.println(valorconvertido1);
    }
}
