package br.com.fiapride.main;

import br.com.fiapride.model.Garrafa;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Garrafa garrafa1 = new Garrafa();
        garrafa1.setMaterialDaGarrafa("Plástico");
        garrafa1.setMarca("Nestle");
        garrafa1.setCorDaTampa("Branca");

        System.out.println("Marca da garrafa: " + garrafa1.getMarca());
        System.out.println("Material da garrafa: " + garrafa1.getMaterialDaGarrafa());
        System.out.println("Cor da tampa: " + garrafa1.getCorDaTampa());
    }
}
