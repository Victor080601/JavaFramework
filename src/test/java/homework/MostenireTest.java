package homework;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MostenireTest {
    @Test
    public void test(){
        List<String> tip = new ArrayList<>();
        tip.add("IT");
        tip.add("Doctor");
        Angajat ang = new Angajat("Ionescu", "Popescu", "Strada Cutarescu", 34,5000,"Pentalog", tip);
        ang.infoPersoana();
        ang.marireSalariu();
        ang.vechimeFirma();
        ang.adaugareTip();
    }
}
