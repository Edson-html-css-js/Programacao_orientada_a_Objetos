package edu.curso;

import javax.annotation.processing.SupportedOptions;

public class selva {

    double calibre;
    int municao;
    String tipo;
    boolean scope;

    public void atirar() { 
        if ("caiu na selva".equals(tipo)) { 
            System.out.println("leão matou...");
        } else if ("bazuca".equals(tipo)) {
            System.out.println("onça matou !!!");
        } else { 
            System.out.println("caiu da avore morreu !!!");
        }

        municao = municao - 1;
    }

    public void recarregar() { 
        System.out.println("na selva com arma");
        municao = 6;
    }

    public void colocarScope() { 
        System.out.println("Scope adicionado a arma");
        scope = true;
    }

    public void retirarScope() { 
        System.out.println("Scope retirado da arma");
        scope = false;
    }
    
}
