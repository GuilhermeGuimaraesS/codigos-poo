package br.edu.ufrb.gcet236.exercicio_classes_2.data.requests;

import java.time.LocalDate;


public class Data {

    private int dia; 
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if ((dia > 0) && (dia <= 31)) {
            this.dia = dia;
        } else {
            this.dia = 12;
        }
        if ((mes >= 1) && (mes <= 12)) {
            this.mes = mes;
        } else {
            this.mes = 12;
        }
        if (ano > 0) {
            this.ano = ano;
        } else {
            this.ano = 2012;
        }

    }

        public Data() {
            LocalDate dataAgora = LocalDate.now();
            this.dia = dataAgora.getDayOfMonth();
            this.mes = dataAgora.getMonthValue();
            this.ano = dataAgora.getYear();
        }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano)  {
        this.ano = ano;
    }

    public String getData() {
        String diaString = Integer.toString(this.dia);
        if (this.dia < 10) {
            diaString = "0" + diaString;
        }
        String mesString = Integer.toString(this.mes);
        if (this.mes < 10) {
            mesString = "0" + mesString;
        }
        return diaString + "/" + mesString + "/" + this.ano;
    }
    
    public void proximoDia(){
        if ((this.dia == 31) && (this.mes == 12)) {
            this.dia = 1;
            this.mes= 1;
            this.ano++;
        } else if (this.dia == 31) {
            this.dia = 1;
            this.mes++;
        } else {
            this.dia++;
        }

    }

}
