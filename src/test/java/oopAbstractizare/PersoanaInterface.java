package oopAbstractizare;

public class PersoanaInterface {
    //Abstractizare = conceptul pe baza caruia definim comportamentul unei clase
    //Abstractizarea se poate face folosind interfete sau clase abstracte
    private String nume;
    private String prenume;
    private String varsta;

    public PersoanaInterface(String nume, String prenume, String varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
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

    public String getVarsta() {
        return varsta;
    }

    public void setVarsta(String varsta) {
        this.varsta = varsta;
    }
}
