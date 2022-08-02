package homework;

import org.junit.Test;

public class Telefoane {

    public Double getScumpireNokia(Double pretInitial)
    {
        Double pretScumpire = pretInitial + (pretInitial * 2)/100;
        return pretScumpire;
    }

    public Double getReducereTelefoane(Double pretInitial, Double procentReducere)
    {
        Double pretRedus = pretInitial - (pretInitial * procentReducere)/100;
        return pretRedus;
    }

    public void faraReducere()
    {
        System.out.println("Acest telefon nu este la reducere.");
    }

    public void afisarePreturiNoi(String brandTelefon)
    {
        switch(brandTelefon)
        {
            case "Samsung":
                System.out.println("Noul pret al telefonului S10 este: " + getReducereTelefoane(3600.00,15.0));
                System.out.println("Noul pret al telefonului Note22 este: " + getReducereTelefoane(5000.00,15.0));
                System.out.println("Noul pret al telefonului S10e este: " + getReducereTelefoane(7050.50,15.0));
                break;
            case "Huawei":
                System.out.println("Noul pret al telefonului Nova 9 este: " + getReducereTelefoane(1499.10,30.0));
                System.out.println("Noul pret al telefonului P20 este: " + getReducereTelefoane(1199.90,30.0));
                System.out.println("Noul pret al telefonului P50 este: " + getReducereTelefoane(3100.30, 30.0));
                System.out.println("Noul pret al telefonului Honor 3X este: " + getReducereTelefoane(2050.50, 30.0));
                System.out.println("Noul pret al telefonului P30 este: " + getReducereTelefoane(2001.00, 30.0));
                break;
            case "Apple":
                System.out.println("Noul pret al telefonului 13 Max Pro este: " + getReducereTelefoane(6500.00,5.0));
                break;
            case "Nokia":
                System.out.println("Noul pret al telefonului G21 este: " + getScumpireNokia(869.99));
                System.out.println("Noul pret al telefonului X20 este: " + getScumpireNokia(1550.00));
                break;
            default: faraReducere();
        }
    }

    @Test
    public void afisareTelefoane()
    {
        //afisarePreturiNoi("Samsung");
        //afisarePreturiNoi("Huawei");
        //afisarePreturiNoi("Apple");
        afisarePreturiNoi("Nokia");
        //afisarePreturiNoi("Xiaomi");
    }

}