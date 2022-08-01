package homework;

import org.junit.Test;

public class Biblioteca {

    public String material;
    public String model;
    public Integer nrusi;
    public Double inaltime;
    public Float greutate;
    public Character marime;
    public Boolean esteLacuita;

    @Test
    public void InfoBiblioteca(){
        material = "brad";
        model = "cu rafturi inclinate";
        nrusi = 2;
        inaltime = 20.9;
        greutate = 50.2f;
        marime = 'L';
        esteLacuita = true;


        System.out.println("Din ce material este facuta: " + material);
        System.out.println("Ce model de rafturi are: " + model);
        System.out.println("Care este numarul de usi: " + nrusi);


        System.out.println("Inaltimea este: " + inaltime);
        System.out.println("Greutatea este:" + greutate);
        System.out.println("Marimea este: " + marime);
        System.out.println("Este lacuita? " + esteLacuita);

        AfiseazaPret();
    }


    public void AfiseazaPret(){
        Double pret = 3.242;
        System.out.println("Pretul scaunului este: " + pret);
        Double pretDupaReducere = 1.296;
        System.out.println("Diferenta dintre pretul initial si cel dupa reducere este:" +(pret-pretDupaReducere));
        System.out.println("Reducerea este de: " + (40*pret/100));
        System.out.println("Produsul este la 40% ceea ce ar duce la o economisire de 1.296 din pretul initial.");
        System.out.println(getCuloareScaun());

    }




    public String getCuloareScaun(){
        return "rosu";
    }


}
