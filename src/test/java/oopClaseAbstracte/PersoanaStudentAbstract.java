package oopClaseAbstracte;

public class PersoanaStudentAbstract extends PersoanaAbstracta{

   private String nume;
   private String prenume;

    public PersoanaStudentAbstract(String nume, String prenume) {
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

    }

    @Override
    void primesteSalariu() {

    }

    @Override
    void bursa() {
        System.out.println(getNume() + " " + getPrenume());

    }

    @Override
    void practica() {
        System.out.println(getNume() + "  " + getPrenume());

    }

    @Override
    void pierdeVremea() {

    }

    @Override
    void primesteAjutorSocial() {

    }
}
