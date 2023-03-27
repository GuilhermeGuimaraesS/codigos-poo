package br.edu.ufrb.gcet236.exercicios_classes_3.entities;

import java.util.ArrayList;

public class Agenda {
    
    private ArrayList<Pessoa> listaPessoas;

    public ArrayList<Pessoa> getListaPessoas() {
        return this.listaPessoas;
    }

    public void setListaPessoas(ArrayList<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }

    public Agenda() {
        this.listaPessoas = new ArrayList<Pessoa>();
    }   

    public void armazenaPessoas(Pessoa pessoa) {
        this.listaPessoas.add(pessoa);
    }

    public int buscaPessoa(String nome) {
        for (Pessoa pessoa : this.listaPessoas) {
            String nomeDaPessoa = pessoa.getNome();
            if (nome.equalsIgnoreCase(nomeDaPessoa)) {
                int posicaoDaPessoaProcurada =  listaPessoas.lastIndexOf(pessoa);
                return posicaoDaPessoaProcurada;
            }
        }
        return -1;
    }

    public void removePessoa(String nome) {
        int indiceDaPessoaProcurada = buscaPessoa(nome);
            listaPessoas.remove(indiceDaPessoaProcurada);
    }

    public void imprimeAgenda() {
        for (Pessoa pessoa : this.listaPessoas) {
            pessoa.imprimirDados(); 
        }
    }

    public String imprimePessoa(int index) {
        for (Pessoa pessoa : this.listaPessoas) {
            int indiceAnalisado = listaPessoas.indexOf(pessoa);
            if (index == indiceAnalisado) {
                return pessoa.imprimirDados();
            } 
        }
        return "ok";
    }
 
}


