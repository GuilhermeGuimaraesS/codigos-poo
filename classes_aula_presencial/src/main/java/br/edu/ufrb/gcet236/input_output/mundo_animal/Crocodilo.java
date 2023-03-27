package br.edu.ufrb.gcet236.input_output.mundo_animal;

public class Crocodilo {

    private String cor;
    
    public Crocodilo() {
        cor = "verde";
    }

    public Crocodilo(String cor) {
        this.cor = cor;
    }
    
    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void informaCor() {
        System.out.println(cor);
    }

    // public Crocodilo(String cor) {
    //     System.out.println("Hello, crocodilo" + cor);
    // }
    
    // public Crocodilo(int tamanho) {
    //     System.out.println("Hello, crocodilo" + tamanho);
    // }
    
}
