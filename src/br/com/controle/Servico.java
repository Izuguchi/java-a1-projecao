/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;


public class Servico {
    private int codpet; 
    private String nome;
    private double vservico;
    private int qt;
    private double somar;
    private double maior;
    

       

    public int getCodpet() {
        return codpet;
    }

    public void setCodpet(int codpet) {
        this.codpet = codpet;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVservico() {
        return vservico;
    }

    public void setVservico(double vservico) {
        this.vservico = vservico;
    }

    public int getQt() {
        return qt;
    }

    public void setQt(int qt) {
        this.qt = qt;
    }
    
    public double somar() {
        return somar=this.somar+this.vservico;
    }

    public double getMaior() {
        for (int i = 0; i < vservico; i = i + 1) {

            if (maior < vservico) {
                maior = vservico;

                if (maior > vservico) {
                    maior = vservico;
                }
            }
        }
        return maior;
    }

    public void setMaior(double maior) {
        this.maior = maior;
    }
           
}
