package oopAbstractizare;

public class PersoanaAngajat extends PersoanaInterface implements InterfaceAngajat{


    public PersoanaAngajat(String nume, String prenume, String varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul cu numele" + getNume() + " " + getPrenume() + " munceste");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste 1500 lei");
    }
}
