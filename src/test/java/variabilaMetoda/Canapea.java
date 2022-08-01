package variabilaMetoda;

import org.junit.Test;

public class Canapea {

    //printam numele canapelei
    @Test
    public void metodaTest(){
        afisareCanapea("extensibila");
        afisareCanapea("dreapta");
        afisareCanapea("coltar");

        calculReducere(160,10);
        calculReducere(200, 50);
        calculReducere(80,30);
    }
    public void afisareCanapea(String nume){
        System.out.println(nume);
    }

    //aplicam o reducere la o canapea
    public void calculReducere(Integer pret, Integer reducere){
        Integer pretRedus = (pret*reducere)/100;
        Integer pretFinal = pret - pretRedus;
        System.out.println("Pretul "+pret+" dupa o reducere de "+ reducere+"% este: " + pretFinal );
    }
}
