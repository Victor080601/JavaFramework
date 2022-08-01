package oopMostenire;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MostenireTest {
    @Test
    public void test(){
        List<String> audiDotariExterioare = new ArrayList<>();
        audiDotariExterioare.add("Negru mat");
        audiDotariExterioare.add("Jante 18");
        List<String> audiDotariInterioare = new ArrayList<>();
        audiDotariInterioare.add("Clima automata pe 4 zone");
        audiDotariInterioare.add("Elemente cromate");
        audiDotariInterioare.add("Camera spate");

        Audi a5 = new Audi("Audi", "A5",4, "automata","2000 cm3",20000.00,
                audiDotariExterioare, audiDotariInterioare);
        a5.setModel("A4");
        a5.pretStandard();
        a5.adaugareDotariExterioare();
        a5.adaugareDotariInterioare();
        a5.configuratieAudi();
        a5.folosireVolan();
        a5.numarPasageri(5);
        a5.numarPasageri("4 pasageri");
        a5.numarPasageri(4,1);
        a5.proba();

    }
}
