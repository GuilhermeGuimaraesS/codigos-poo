package br.edu.ufrb.gcet236.carros.entities;

import java.util.ArrayList;

public class Estoque {

    private ArrayList<Carro> listaDeCarros;

    public ArrayList<Carro> getEstoqueDeCarros() {
        return this.listaDeCarros;
    }

    public void setEstoqueDeCarros(ArrayList<Carro> listaDeCarros) {
        this.listaDeCarros = listaDeCarros;
    }

    public Estoque() {
        this.listaDeCarros = new ArrayList<Carro>();
    }
    
    public void adicionarCarro(Carro carro) {
        this.listaDeCarros.add(carro);
    }

    public void removerCarro(Carro carroComprado) {
        for (Carro carro : this.listaDeCarros) {
            if (carroComprado == carro) {
                listaDeCarros.remove(carroComprado);
            }
        }
    }

    private String status;

    // public String getStatus() {
    //     return this.status;
    // }

    // public void setStatus(String status) {
    //     this.status = status;
    // }

    public String buscarCarro(Carro carroBuscado) {
        for (Carro carro : this.listaDeCarros) {
            if (carroBuscado == carro) {
                status = "DISPONÍVEL";
            } else {
                status = "INDISPONÍVEL";
            }
        }
        return status;
    }

    public String mostrarEstoque() {
        for (Carro carro : this.listaDeCarros) {
            return carro.informaçoesDoCarro();
        }
        return "OK";
    }
}
