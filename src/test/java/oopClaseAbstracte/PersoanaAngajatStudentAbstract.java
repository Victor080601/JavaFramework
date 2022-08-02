package oopClaseAbstracte;

public class PersoanaAngajatStudentAbstract extends PersoanaAbstracta {

    private String nume;
    private String prenume;

    public PersoanaAngajatStudentAbstract(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    @Override
    void munceste() {
        System.out.println(getNume() + " " + getPrenume());
        proba = "Munceste";

    }

    @Override
    void primesteSalariu() {
        System.out.println(getNume() + " " + getPrenume());

    }

    @Override
    void bursa() {
        System.out.println(getNume() + " " + getPrenume());

    }

    @Override
    void practica() {
        System.out.println(getNume() + " " + getPrenume());

    }

    @Override
    void pierdeVremea() {

    }

    @Override
    void primesteAjutorSocial() {

    }
}
