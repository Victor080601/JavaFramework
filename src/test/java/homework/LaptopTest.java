package homework;

import homework.Laptop;
import org.junit.Test;

import java.util.HashMap;

public class LaptopTest {

    @Test
    public void test()
    {
        //declaram un obiect;
        Laptop Dell = new Laptop("Dell" , "Latitude 5521" , "35.96 x 25.19 x 2.42" , "negru", 2022, true);
        Dell.infoLaptop();
        Dell.editieLaptop();

        Laptop Lenovo = new Laptop("Lenovo", "IdeaPad 3 Gaming " , "30.06 x 23.50 x 1.40" , "auriu" ,  2015 , true , 2200.01);
        Lenovo.infoLaptop();
        HashMap<String , Double> accesoriiLenovo = new HashMap<>();
        accesoriiLenovo.put("Ghiozdan" , 115.87);
        accesoriiLenovo.put("Mouse" , 70.50);
        accesoriiLenovo.put("MousePad" , 60.0);
        Lenovo.pretCuAccesorii(accesoriiLenovo);

    }



}

