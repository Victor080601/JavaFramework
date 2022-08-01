package homework;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Hashmap {
    @Test
    public void Test(){
        HashMap<String,Integer> fam = econimiiFamilie();
        adaugareEconimii(fam);
    }
    public Integer totalEconomii(List<Integer> economisireTotala){
        Integer total = 0;
        for(int i=0;i<economisireTotala.size();i++){
            total += economisireTotala.get(i);

        }
        return total;

    }
    public void adaugareEconimii(HashMap<String,Integer> familie){

        for(String Key: familie.keySet()){
            if(Key.equals("Sora")){
                Integer valoareCurenta = familie.get(Key) + 20;
                familie.replace(Key,valoareCurenta);
            } else {
                Integer valoareCurenta = familie.get(Key) + 100;
                familie.replace(Key,valoareCurenta);

            }
            System.out.println("Membrul: " + Key + " are noile economii: " + familie.get(Key));
        }


    }

    public HashMap econimiiFamilie(){
        //Key = Value
        HashMap<String,Integer> economii = new HashMap<>();
        economii.put("Sora", 100);
        economii.put("Mama",200);
        economii.put("Tata",500);
        for (String Key: economii.keySet()){
            System.out.println("Membrul familiei este  " + Key);
            System.out.println("A economisit " + economii.get(Key));

        }
        return economii;
    }
}
