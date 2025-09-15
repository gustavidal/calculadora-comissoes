package br.senai.sp.jandira.ds1t.comissoes.model;

import java.util.Scanner;

public class Vendedor {

    String nomeVendedor;
    double totalVendas;
    double percentualComissao;
    double valorComissao;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        // obtendo os dados dos vendedores
        System.out.println("** CALCULADORA DE COMISSÕES **");
        System.out.println("------------------------------------");

        // Obtendo o nome do(a) vendedor(a)
        System.out.print("Nome do(a) vendedor(a): ");
        nomeVendedor = leitor.nextLine();

        // Obtendo o total de vendas do(a) vendedor(a)
        System.out.print("Total de vendas do(a) " + nomeVendedor + ": ");
        totalVendas = leitor.nextDouble();

        calcularComissao();
    }

    public void calcularComissao(){
        if(totalVendas < 20000){
            percentualComissao = 5;
        } else {
            percentualComissao = 10;
        }

        valorComissao = totalVendas * percentualComissao / 100;
        exibirResultados();
    }

    public void exibirResultados(){
        String resultadoFinalComissao = String.format("%.2f", valorComissao);
        System.out.println("-------------------------------------");
        System.out.println("Nome do(a) vendedor(a): " + nomeVendedor);
        System.out.println("Total de vendas R$" + totalVendas);
        System.out.println("Percentual de comissão: " + percentualComissao + "%");
        System.out.println("Valor da comissão: R$" + resultadoFinalComissao);
        System.out.println("-------------------------------------");
    }
}
