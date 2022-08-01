package oopMostenire;

public class Masina {
    //Mostenire: In java se poate mosteni o singura clasa
    //Polimorfism e de 2 feluri: static(overload) si dinamic(override)
    //Dinamic = Intr-o ierarhie de clase o metoda poate avea implementari diferite
    //Static = Putem avea mai multe metode cu acelasi nume care sa se diferentieze prin numarul sau tipul de parametrii

    private String Marca;
    private String Model;
    private Integer nrRoti;
    private String Transmisie;
    private String Motor;

    public Masina(String marca, String model, Integer nrRoti, String transmisie, String motor) {
        Marca = marca;
        Model = model;
        this.nrRoti = nrRoti;
        Transmisie = transmisie;
        Motor = motor;
    }
    public void infoMasina(){
        System.out.println("Marca este: " + Marca);
        System.out.println("Modelul este: " + Model);
        System.out.println("Numarul rotilor este: " + nrRoti);
        System.out.println("Transmisia este de tip: " + Transmisie);
        System.out.println("Motorul are capacitatea de: " + Motor);
    }

    //Polimorfism dinamic
    public void folosireVolan(){
        System.out.println("Volanul masinii se conduce foarte bine");
    }

    public String getMarca() {
        return Marca;
    }

    public String getModel() {
        return Model;
    }

    public Integer getNrRoti() {
        return nrRoti;
    }

    public String getTransmisie() {
        return Transmisie;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setTransmisie(String transmisie) {
        Transmisie = transmisie;
    }

    public void setMotor(String motor) {
        Motor = motor;
    }
}
