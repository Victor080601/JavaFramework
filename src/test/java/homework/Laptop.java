package homework;

import java.lang.reflect.Array;
import java.util.HashMap;

public class Laptop {

    //obiect = instanta unei clase
    //constructor = are ca rol sa initializeze atributele unei variabile
    //constructorul tot timpul este public ( private - se aplica conceptul de singletone )
    //constructorul tot timpul are numele la fel ca si clasa
    //constructorul e de 2 feluri : cu parametrii si fara parametrii
    //daca nu am facut noi un constructor => unul by default fara parametrii
    //dintr-o clasa putem face mai multe obiecte care se vor diferentia prin numele lor
    //in momentul in care se initializeaza un obiect => se apeleaza constructorul clasei
    //recunoastem un obiect dupa cuvantul "new"

    public String marca;
    public String model;
    public String dimensiuni;
    public String culoare;
    public Integer anFabricatie;
    public Boolean areAmprenta;
    public Double pret;

    public Laptop(String marca, String model, String dimensiuni, String culoare, Integer anFabricatie, Boolean areAmprenta) {
        this.marca = marca;
        this.model = model;
        this.dimensiuni = dimensiuni;
        this.culoare = culoare;
        this.anFabricatie = anFabricatie;
        this.areAmprenta = areAmprenta;
    }

    public Laptop(String marca, String model, String dimensiuni, String culoare, Integer anFabricatie, Boolean areAmprenta, Double pret) {
        this.marca = marca;
        this.model = model;
        this.dimensiuni = dimensiuni;
        this.culoare = culoare;
        this.anFabricatie = anFabricatie;
        this.areAmprenta = areAmprenta;
        this.pret = pret;
    }

    public void infoLaptop()
    {
        System.out.println("Marca este: " + marca);
        System.out.println("Modelul este: " + model);
        System.out.println("Are dimensiunile de: " + dimensiuni);
        System.out.println("Anul fabricatiei este: " + anFabricatie);
        System.out.println("Culoarea este: " + culoare);
        if(areAmprenta != null)
        {System.out.println("Are camera? " + areAmprenta);}
        else {
            System.out.println("Nu exista.");
        }
        if(pret!=null)
        {
            System.out.println("Laptopul costa: " +pret+ " lei");
        }
        else
        {
            System.out.println("Laptop neidentificat");
        }
    }

    public void editieLaptop()
    {
        if(anFabricatie >= 2020)
        {
            System.out.println("Laptopul este din generatia noua.");
        }
        if(anFabricatie<2020 && anFabricatie>=2015)
        {
            System.out.println("Laptopul este usor invechit.");
        }
        if(anFabricatie<2015)
        {
            System.out.println("Laptopul este vechi.");
        }
    }

    public void pretCuAccesorii(HashMap<String, Double> accesorii)
    {
        for(String key:accesorii.keySet())
        {
            pret = pret+ accesorii.get(key);
        }
        System.out.println("Pretul cu accesorii este: "+ pret + " lei");
    }

}
