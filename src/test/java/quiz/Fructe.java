package quiz;

import java.util.HashMap;
import java.util.List;

public class Fructe extends Piata{
    private List<String> fruct;
    public Integer pretFruct;
    public Integer pretPunga;
    public String pregatireFruct;

    public Fructe(Integer nrTarabe, String tipTaraba, List<String> fruct, Integer pretFruct, Integer pretPunga, String pregatireFruct) {
        super(nrTarabe, tipTaraba);
        this.fruct = fruct;
        this.pretFruct = pretFruct;
        this.pretPunga = pretPunga;
        this.pregatireFruct = pregatireFruct;
    }
    public void afisFructe(){
        HashMap<String,Integer> cuvinte = new HashMap<>();
        cuvinte.put("Mar", 20);
        cuvinte.put("Banana",30);
        cuvinte.put("Piersici",50);
        for (String Key: cuvinte.keySet()){
            System.out.println("Fructul este  " + Key);
            System.out.println("Pretul pentru fruct " + cuvinte.get(Key));
        }
    }
    public void infoFruct(){
        System.out.println("Fructul " + fruct + " are pretul de " + pretFruct + " pretul pungii este de "
                + pretPunga + " fructul fiind " + pregatireFruct);
    }
    //public void pretFinal(){
       // Integer pret;
       // pret = pretFruct + pretPunga;
       // System.out.println(pret);
  //  }
    public void pretFruct(){
        Integer pret;
        for(String fructe: fruct){
            switch (fructe){
                case "Mar":
                    pret = pretFruct + pretPunga;
                    System.out.println("Marul costa cu punga " + pret);
                    break;
                case "Banana":
                    pret = pretFruct + pretPunga;
                    System.out.println("Banana costa cu punga " + pret);
                    break;
                case"Piersici":
                    pret = pretFruct + pretPunga;
                    System.out.println(pret);
                    break;

            }
        }

    }


}
