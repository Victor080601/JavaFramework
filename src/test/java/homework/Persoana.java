package homework;

public class Persoana {
    private String nume;
    private String prenume;
    private Integer varsta;
    private String adresa;
    private Integer gen;

    public Persoana(String nume, String prenume, Integer varsta, String adresa, Integer gen) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.adresa = adresa;
        this.gen = gen;
    }

    public void infoPersoana(){
        System.out.println("Numele persoanei este: " + nume);
        System.out.println("Prenumele persoanei este: " + prenume);
        System.out.println("Varsta persoanei este: " + varsta);
        System.out.println("Adresa persoanei este: " + adresa);
        if(gen == 1){
            System.out.println(getNume() + " " + getPrenume() + " este de sex masculin");
        }
        if(gen == 2){
            System.out.println(getNume() + " " + getPrenume() + " este de sex feminin");
        }

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

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public Integer getGen() {
        return gen;
    }

    public void setGen(Integer gen) {
        this.gen = gen;
    }
}
