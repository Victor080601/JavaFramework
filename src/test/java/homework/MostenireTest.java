package homework;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MostenireTest {
    @Test
    public void test(){
        Angajat ang = new Angajat("Ionescu", "Popescu", "Strada Cutarescu", 34,1,5000,"Pentalog");
        ang.infoPersoana();
        ang.marireSalariu();
        ang.vechimeFirma();
        ang.numeleFirmei();
    }
}
