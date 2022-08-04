package homework;

import org.junit.Test;

public class TestPolimorfism {
    public void displayArea(Figura figura){
        System.out.println("aria este: " + figura.getArea());
    }
    @Test
    public void test(){
        Figura[] figuri= new Figura[2];
        figuri[0] = new Patrat(100.0,10.0);
        figuri[1] = new Triunghi(10.0,20.0);
        for(int i=0;i< figuri.length; i++){
            displayArea(figuri[i]);
        }
    }
}
