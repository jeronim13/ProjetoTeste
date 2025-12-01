/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gm.barbara.construapp;

//REPRESENTA O COMOOD DA RESIDENCIA

/**
 *
 * @author DIGM1A
 */
public class Comodo {
    private String nome;
    private double largura;
    private double comprimento;

    public Comodo() {
    //UNICO METODO LETRA MAIUSCULA POR SER O NOME DA CLASSE
    System.out.printf("Passei por aqui");
    }

    public Comodo(String nome, double largura, double comprimento) {
        this.nome = nome;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public Comodo(String nome) {
        this.nome = nome;
    }
    
    
    
    public String getNome() {
        return this.nome.toUpperCase();
    }

    public void setNome(String nome) {
        if (nome.length() <= 3) {
            throw new UnsupportedOperationException("Nome comodo Invalido.");

        } else {
            this.nome = nome;
        }
    }

    double calcularArea() {
        return this.largura * this.comprimento;
    }

    @Override
    public String toString() {

        String aux = String.format("Comodo: %-10s Largura: %6.2f Comprimento: %6.2f Area do comodo: %.2f\n",
                this.getNome(),
                this.largura,
                this.comprimento,
                this.calcularArea());
        
        return aux;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

}
    

