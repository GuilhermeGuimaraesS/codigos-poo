package br.edu.ufrb.gcet236.carros.entities;

public class Carro {

    // Declaração dos atributos de um objeto da classe Carro
    private String marca;
    private String modelo;
    private String cor;
    private int ano;

    // Construtor de um objeto da classe Carro
    public Carro (String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    // Getters e Setters de cada atributo (linha 19 - linha 50)
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    } 

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return this.ano;
    }

    public void setCor(int ano) {
        this.ano = ano;
    }

    public String informaçoesDoCarro() {
        String anoString = Integer.toString(this.ano);
        return "Marca: " + this.marca +
               "\nModelo: " + this.modelo +
               "\nCor: " + this.cor +
               "\nAno de Fabricação: " + anoString;
    }
}
