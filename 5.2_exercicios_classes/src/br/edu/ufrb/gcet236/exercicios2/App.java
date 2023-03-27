package br.edu.ufrb.gcet236.exercicios2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* Data dataConstrutorComParametros = new Data(7, 3, 2023);
        dataConstrutorComParametros.imprimirData();
        Data dataComConstrutorVazio = new Data();
        dataComConstrutorVazio.imprimirData();
        Data dataComEntradasInvalidas = new Data(-8, 0, -123);
        dataComEntradasInvalidas.imprimirData(); */

        Scanner leitorDeNumeros = new Scanner(System.in);
        int dia = leitorDeNumeros.nextInt();
        int mes = leitorDeNumeros.nextInt();
        int ano = leitorDeNumeros.nextInt();
        Data dataComLeituraDoTeclado = new Data(dia, mes, ano);
        dataComLeituraDoTeclado.imprimirData();
        dataComLeituraDoTeclado.proximoDia();
        dataComLeituraDoTeclado.imprimirData();

    }
}
