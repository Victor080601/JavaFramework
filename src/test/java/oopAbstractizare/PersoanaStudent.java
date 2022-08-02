package oopAbstractizare;

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
}
