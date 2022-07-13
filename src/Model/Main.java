package Model;

import Model.Adicao;
import Model.Calculadora;

public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        Adicao adicao = new Adicao(25,32);
        System.out.println(" O resultado é " + calculadora.executa(adicao));

        Subtracao subtracao = new Subtracao(2022,1979);
        System.out.println(" O resultado é " + calculadora.executa(subtracao));

        Multiplicacao multiplicacao = new Multiplicacao(128,2);
        System.out.println(" O resultado é " + calculadora.executa(multiplicacao));

        Divisao divisao = new Divisao(1200,30);
        System.out.println(" O resultado é " + calculadora.executa(divisao));

        System.out.println("Histórico das Operações: ");
        System.out.println(calculadora.getOperacoes().toString());

    }
}
