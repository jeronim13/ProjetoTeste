/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.gm.barbara.construapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DIGM1A
 */
public class ConstruApp {

    public static void main(String[] args) {
        System.out.println("Arroz e feijao POO");
        System.out.printf("--------------------");
        
        List<Comodo> meusComodos = new ArrayList<>();
        
        Comodo c;
        
        c = new Comodo ("Quarto", 5, 4);
        meusComodos.add(c);

        c = new Comodo ("Banheiro", 3, 2);
        meusComodos.add(c);
        
        c = new Comodo ("Sala", 7, 6);
        meusComodos.add(c);
        
        Residencia r = new Residencia("Jeronim",
                "Rua dos alfeneiros, 4",
                "Londres", "UK");
                
        
    r.setListaComodos(meusComodos);
        System.out.println(r.toString());
        
        
    }}

  