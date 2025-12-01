/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gm.barbara.construapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DIGM1A
 */
public class Residencia {
    
    private String proprietario;
    private String endereco;
    private String cidade;
    private String uf;
    
    // Constructors 
    
    private List<Comodo> listaComodos = new ArrayList<>();

    public Residencia() {
    }
    
    public Residencia(String proprietario, String endereco, String cidade, String uf) {
        this.proprietario = proprietario;
        this.endereco = endereco;
        this.cidade = cidade;
        this.uf = uf;
    }
    
    // getters and setters

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public List<Comodo> getListaComodos() {
        return listaComodos;
    }

    public void setListaComodos(List<Comodo> listaComodos) {
        this.listaComodos = listaComodos;
    }
    
    

    
}
