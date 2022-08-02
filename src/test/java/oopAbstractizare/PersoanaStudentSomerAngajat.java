package oopAbstractizare;

public class PersoanaStudentSomerAngajat extends PersoanaInterface implements InterfaceSomer, InterfaceStudent, InterfaceAngajat{

    public PersoanaStudentSomerAngajat(String nume, String prenume, String varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void munceste() {

    }

    @Override
    public void primesteSalariu() {

    }

    @Override
    public void pierdeVremea() {

    }

    @Override
    public void primesteAjutorSocial() {

    }

    @Override
    public void practica() {

    }

    @Override
    public void bursa() {

    }
}
