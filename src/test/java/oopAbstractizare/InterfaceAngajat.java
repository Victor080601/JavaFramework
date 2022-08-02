package oopAbstractizare;

public interface InterfaceAngajat {
    //Recunoastem o interfata dupa interface
    //Toate metodele dintr-o interfata sunt abstracte
    //Toate variabilele dintr-o interfat sunt abstracte
    //Intr-o interfata nu putem sa avem un constructor => nu putem face un obiect
    //Interfata se implementeaza
    //Clasa care implementeaza interfata trebuie sa implementeze toate metodele interfetei
    //O clasa poate sa implementeze n interfete
    //O interfata poate sa mosteneasca o alta interfata
    //O clasa abstracta poate sa implementeze o interfata

    void munceste();
    void primesteSalariu();
    
    public String proba = "";
}
