package br.edu.ufrb.gcet236.exercicios_classes_3.entities;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura)  {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String imprimirDados()  {
        String idadeString = Integer.toString(this.idade);
        String alturaString = Double.toString(this.altura);
        return "Nome: " + this.nome + "\nIdade:  " + idadeString + "\nAltura: " + alturaString;
    }

}
