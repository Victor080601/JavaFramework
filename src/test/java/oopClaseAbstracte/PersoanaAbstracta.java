package oopClaseAbstracte;

public abstract class PersoanaAbstracta {
    //Recunoastem o clasa abstracta dupa cuvantul abstract(pe care trebuie sa-l adaugam noi
    //O clasa abstracta poate sau nu sa contina metode abstracte
    //Intr-o clasa abstracta putem sa facem un constructor => nu putem sa facem un obiect
    //Clasa abstracta se mosteneste
    //Clasa care mosteneste clasa abstracta trebuie sa implementeze toate metodele abstracte
    //O clasa poate sa mosteneasca o singura clasa abstracta
    //O clasa abstracta poate sa implementeze mai multe interfete
    abstract void munceste();
    abstract void primesteSalariu();
    abstract void bursa();
    abstract void practica();
    abstract void pierdeVremea();
    abstract void primesteAjutorSocial();

    public void metodaNormala(){
        System.out.println("Clasa abstracta");
    }

    public String proba;
}
