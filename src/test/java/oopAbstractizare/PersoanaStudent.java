package oopAbstractizare;

import homework.Method;
import org.junit.Test;

public class PersoanaStudent extends PersoanaInterface implements InterfaceStudent{

    public PersoanaStudent(String nume, String prenume, String varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void practica() {
        System.out.println("Studentul " + getNume() + " " + getPrenume() + " face practica la Pentalog");

    }

    @Override
    public void bursa() {
        System.out.println("Studentul " + getNume() + " " + getPrenume() + " ia 800 lei bursa");

    }
    public static void main(String args[]){
        PersoanaStudent obj = new PersoanaStudent("Oprea","Victor","21");
        obj.bursa();
        obj.practica();
    }
}
