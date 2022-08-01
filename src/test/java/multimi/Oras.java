package multimi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Oras {
    @Test
    public void Test(){
        //printNumeArray();
        //printNumeList();
        printCuvinte();
        //printTariOrase();
    }
    //Array
    public void printNumeArray(){
        String[] nume = new String[5];
        nume[0] = "Victor";
        nume[1] = "Laura";
        nume[2] = "Alex";
        nume[3] = "Diana";
        nume[4] = "Andreea";
        for(int i=0;i<nume.length; i++)
        {
            System.out.println(nume[i]);
        }

    }

    public void printNumeList(){
        List<String> nume = new ArrayList<>();
        nume.add("Victor");
        nume.add("Laura");
        nume.add("Alex");
        nume.add("Diana");
        nume.add("Andreea");
        Integer numarElemente = nume.size();
        System.out.println(numarElemente);
        nume.remove(nume.size()-1);
        nume.remove(0);
        for(int i=0;i< nume.size();i++){
            System.out.println(nume.get(i));

        }


    }


    public void printCuvinte(){
        //Key = Value
        HashMap<String,String> cuvinte = new HashMap<>();
        cuvinte.put("Haina", "Pantaloni");
        cuvinte.put("Fruct","Mar");
        cuvinte.put("Mancare","Supa");
        cuvinte.remove("Mancare");
        for (String Key: cuvinte.keySet()){
            System.out.println("Cheia curenta este: " + Key);
            System.out.println("Valoarea pe baza cheii este: " + cuvinte.get(Key));
        }
    }
    public void printTariOrase(){
        HashMap<String,List<String>> tariOrase = new HashMap<>();
        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Bucuresti");
        oraseRomania.add("Bacau");
        oraseRomania.add("Brasov");
        oraseRomania.add("Cluj");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Roma");
        oraseItalia.add("Bologna");
        oraseItalia.add("Napoli");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Madrid");
        oraseSpania.add("Sevilia");

        tariOrase.put("Romania",oraseRomania);
        tariOrase.put("Italia", oraseItalia);
        tariOrase.put("Spania", oraseSpania);
        for(String Key: tariOrase.keySet()){
            System.out.println("Tara este: " + Key);
            List<String> oraseCurente = tariOrase.get(Key);
            for(int i=0;i<oraseCurente.size();i++){
                System.out.println(oraseCurente.get(i));
            }
        }

    }
}
