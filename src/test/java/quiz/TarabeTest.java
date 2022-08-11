package quiz;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TarabeTest {
    @Test
    public void test(){
        List<String> fructe = new ArrayList<>();
        fructe.add("Banana");

        Fructe fructe1 = new Fructe(4,"Fructe",fructe,50,20,"Spalat");
        fructe1.infoFruct();
        fructe1.pretFruct();
        fructe1.afisFructe();
        fructe1.tarabe();
        Fructe fructe2 = new Fructe(4,"Fructe", fructe,20,10,"Curatat");
        //fructe.add("Mar");
        fructe2.infoFruct();
        fructe2.pretFruct();
        //fructe2.pretFinal();
    }
}
