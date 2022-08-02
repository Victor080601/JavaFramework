package homework;

import java.util.List;

public class Angajat extends Persoana{
    private Integer salariu;
    private String numeFirma;
    public Angajat(String nume, String prenume, String adresa, Integer varsta, Integer gen, Integer salariu, String numeFirma){
        super(nume, prenume, varsta, adresa, gen);
        this.salariu = salariu;
        this.numeFirma = numeFirma;

    }
    public void marireSalariu(){
        System.out.println("Salariul angajatului: " + getNume() +" "+ getPrenume() + " este " + salariu);
        Integer pretScumpire = salariu + (salariu * 15)/100;
        System.out.println("Dupa marirea de 15% este: " + pretScumpire);
    }
    public void vechimeFirma(){
        System.out.println("Angajatul lucreaza in firma noastra " + numeFirma + " de la varsta de 22 de ani");
        Integer vechime = getVarsta() - 22;
        System.out.println("Vechimea lui este de " + vechime);

    }
    public void numeleFirmei(){
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + " lucreaza la firma " + numeFirma);
    }
    public Integer getSalariu() {
        return salariu;
    }

    public void setSalariu(Integer salariu) {
        this.salariu = salariu;
    }

    public String getNumeFirma() {
        return numeFirma;
    }

    public void setNumeFirma(String numeFirma) {
        this.numeFirma = numeFirma;
    }
}
