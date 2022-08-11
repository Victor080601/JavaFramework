package quiz;

import java.util.HashMap;

public class Piata {
    public Integer nrTarabe;
    public String tipTaraba;

    public Piata(Integer nrTarabe, String tipTaraba) {
        this.nrTarabe = nrTarabe;
        this.tipTaraba = tipTaraba;

    }

    public Integer getNrTarabe() {
        return nrTarabe;
    }

    public void setNrTarabe(Integer nrTarabe) {
        this.nrTarabe = nrTarabe;
    }

    public String getTipTaraba() {
        return tipTaraba;
    }

    public void setTipTaraba(String tipTaraba) {
        this.tipTaraba = tipTaraba;
    }



    public void tarabe(){
        HashMap<String,Integer> numar = new HashMap<>();
        numar.put("Tarabe cu Fructe", 2);
        numar.put("Tarabe cu legume", 7);
        numar.put("Tarabe cu Lactate",5);
        numar.put("Tarabe cu flori",4);
        for (String Key: numar.keySet()){
            System.out.println("Taraba este: " + Key);
            System.out.println("Sunt: " + numar.get(Key));
        }

    }
}
