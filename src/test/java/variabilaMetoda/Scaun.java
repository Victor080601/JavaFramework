package variabilaMetoda;

import org.junit.Test;

public class Scaun {
    //clasa = colectie de atribute si metode
    //atribut = variabila unei clase
    //metoda = actiunea unei clase
    // intr-un fisier java se pot face n clase
    //variabila = 2 tipuri: globala si locala
    //variabila globala = vizibila peste tot
    //variabila locala = vizibila unde o declari
    //structura variabila globala = are un access control(public, private, protected), trebuie sa aiba un tip de variabila, sa aiba un nume
    //o variabila poate sau nu sa primeasca o valoare
    public String material;
    public String model;
    public Integer nrpicioare;
    public Double inaltime;
    public Float greutate;
    public Character marime;
    public Boolean esteTapitat;

    @Test
    public void InfoScaun(){
        material = "fag";
        model = "smecher";
        nrpicioare = 4;
        inaltime = 10.7;
        greutate = 2.5f;
        marime = 'M';
        esteTapitat = true;


        System.out.println(material + " ");
        System.out.println(model);
        System.out.println(nrpicioare);


        System.out.println("Inaltimea este: " + inaltime);
        System.out.println("Greutatea este:" + greutate);
        System.out.println("Marimea este: " + marime);
        System.out.println("Este tapitat? " + esteTapitat);

        AfiseazaPret();
    }


    public void AfiseazaPret(){
        Double pret = 1.234;
        System.out.println("Pretul scaunului este: " + pret);
        System.out.println(getCuloareScaun());

    }


    public String getCuloareScaun(){
        return "rosu";
    }

}
