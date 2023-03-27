package br.edu.ufrb.gcet236.classes.requests;

public class Fatura {

    private long numeroItem;
    private String descricaoItem;
    private float precoItem;
    private int quantidadeDeItens;

    // Construtor da classe
    public Fatura(
        long numeroItem,
        String descricaoItem, 
        float precoItem,
        int quantidadeDeItens
    ) { 
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;
        if (precoItem > 0) {
            this.precoItem = precoItem;
        }
        else {
            this.precoItem = 0;
        }
        if (quantidadeDeItens > 0) {
            this.quantidadeDeItens = quantidadeDeItens;
        }
        else {
            this.quantidadeDeItens = 0;
        }
    
    }

    public long getNumeroItem() {
        return this.numeroItem;
    }

    public void setNumeroItem(long numeroItem) {
        this.numeroItem = numeroItem;
    }
    
    public String getDescricaoItem() {
        return this.descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public float getPrecoitem() {
        return this.precoItem;
    }

    public void setPrecoItem(float precoItem) {
        this.precoItem = precoItem;
    }

    public int getQuantidadeDeItens() {
        return this.quantidadeDeItens;
    }

    public void setQuantidaDeItens(int quantidadeDeItens) {
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public double getTotalFatura() {
        return precoItem * quantidadeDeItens;
    }

}
