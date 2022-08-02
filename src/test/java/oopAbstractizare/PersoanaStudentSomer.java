package oopAbstractizare;

public class PersoanaStudentSomer extends PersoanaInterface implements InterfaceStudent, InterfaceSomer{

    public PersoanaStudentSomer(String nume, String prenume, String varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void pierdeVremea() {
        System.out.println("Studentul somer " + getNume() + " " + getPrenume() + " pierde vremea");

    }

    @Override
    public void primesteAjutorSocial() {
        System.out.println("Studentul somer " + getNume() + " " + getPrenume() + " primeste ajutor social");
    }

    @Override
    public void practica() {
        System.out.println("Studentul somer " + getNume() + " " + getPrenume() + " face practica la Pentalog");
    }

    @Override
    public void bursa() {
        System.out.println("Studetul somer " + getNume() + " " + getPrenume() + " ia 800 de lei bursa");
    }
}
