package oopMostenire;

import java.util.HashMap;
import java.util.List;

public class Audi extends Masina {
    private Double pret;
    private List<String> dotariExterioare;
    private List<String> dotariInterioare;

    public Audi(String marca, String model, Integer nrRoti, String transmisie, String motor, Double pret, List<String> dotariExterioare,
    List<String> dotariInterioare) {
        super(marca, model, nrRoti, transmisie, motor); //trebuie sa contina sablonul parintelui
        //super apeleaza constructorul din clasa parintelui
        this.pret = pret;
        this.dotariExterioare = dotariExterioare;
        this.dotariInterioare = dotariInterioare;


    }
    public void pretStandard(){
        System.out.println("Pretul standard al masinii "+ getMarca() +" "+ getModel() + " este: " + pret);
    }

    public void adaugareDotariExterioare(){
        for(String dotare: dotariExterioare){
            switch (dotare){
                case "Negru mat":
                    pret = pret + 300;
                    break;
                case "Jante 18":
                    pret = pret+ 800;
                    break;
                case"Capace Jante":
                    pret = pret + 200;
                    break;

            }
        }
    }
    public void adaugareDotariInterioare() {
        for (String dotare : dotariInterioare) {
            switch (dotare) {
                case "Clima automata pe 4 zone":
                    pret = pret + 500;
                    break;
                case "Elemente cromate":
                    pret = pret + 200;
                    break;
                case "Geamuri electrice":
                    pret = pret + 100;
                    break;
                case"Navigatie":
                    pret = pret + 400;
                case"Oglinzi electrice si rabatabile":
                    pret = pret + 150;
                case"Camera spate":
                    pret = pret + 600;

            }
        }
    }
    public void pretFinal(){
        System.out.println("Pretul final dupa dotarile adaugate este: " + pret);
    }
    public void configuratieAudi(){
        infoMasina();
        System.out.println("Dotarile interioare sunt: " + dotariInterioare);
        System.out.println("Dotarile exterioare sunt: " + dotariExterioare);
        pretFinal();

    }

    public Double getPret() {
        return pret;
    }

    public List<String> getDotariExterioare() {
        return dotariExterioare;
    }

    public List<String> getDotariInterioare() {
        return dotariInterioare;
    }

    public void setDotariExterioare(List<String> dotariExterioare) {
        this.dotariExterioare = dotariExterioare;
    }

    public void setDotariInterioare(List<String> dotariInterioare) {
        this.dotariInterioare = dotariInterioare;
    }
}
