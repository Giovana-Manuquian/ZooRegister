package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class Alojamento {
    List<Mamiferos> alojamentoMamiferos = new ArrayList<>();
    List<Aves> alojamentoAves = new ArrayList<>();
    List<Repteis> alojamentoRepteis = new ArrayList<>();

    public void adicionarMamifero(Mamiferos mamiferos){
        alojamentoMamiferos.add(mamiferos);
    }
    public void adicionarAves(Aves aves){
        alojamentoAves.add(aves);
    }
    public void adicionarRepteis(Repteis repteis){
        alojamentoRepteis.add(repteis);
    }
}
