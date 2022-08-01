package structuriAlternative;

import org.junit.Test;

public class Laptop {
    //Structuri Alternative = if, else si switch, case
    @Test
    public void Test() {
        verificare(20);
        verificare(3);
        verificare(-2);
        verificare(-3);
        verificare(0);
    }

    @Test
    public void telefonTest() {
        afisareZile("Huawei p30pro");
    }

    @Test
    public void Test1() {
        System.out.println(conditiiIf(3));
    }

    //verificam daca un numar este par si pozitiv

    public void verificare(Integer nr) {
        if (nr == 0) {
            System.out.println("numarul este 0");
        }
        if (nr < 0) {
            if (nr % 2 == 0) {
                System.out.println("numarul " + nr + " negativ si par");
            } else {
                System.out.println("numarul " + nr + " negatvi si imapr");
            }
        }
        if (nr > 0) {
            if (nr % 2 == 0) {
                System.out.println("numarul " + nr + " este pozitiv si par");
            } else {
                System.out.println("numarul " + nr + " e pozitiv si par");
            }
        }

    }

    public void afisareZile(String nume) {
        switch (nume) {
            case "Huawei p30pro":
                System.out.println("S-a ieftinit cu 15%");
                break;
            case "marti":
                System.out.println("marti");
                break;
            case "miercuri":
                System.out.println("miercuri");
                break;
        }
    }

    public Integer conditiiIf(Integer numar) {
        switch (numar) {
            case 1:
                return numar;
            case 2:
                return numar * 2;
            default:
                return 0;
        }

    }
}
