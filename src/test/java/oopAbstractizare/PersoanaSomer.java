package oopAbstractizare;

public class PersoanaSomer extends PersoanaInterface implements InterfaceSomer{

    public PersoanaSomer(String nume, String prenume, String varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void pierdeVremea() {
        System.out.println("Somerul " + getNume() + " " + getPrenume() + " pierde vremea");

    }

    @Override
    public void primesteAjutorSocial() {
        System.out.println("Somerul " + getNume() + " " + getPrenume() + " primeste ajutor social");

    }
}
