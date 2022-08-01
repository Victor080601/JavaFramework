package structuriRepetitive;

public class Animal {
    //Structuri repetitive for, while, for each

    //Afisam primele n numere
    public void afisam(Integer n){

        for(int i=0;i<=n;i++) {
            if(i%5==0)
            {
                break;
            }
            System.out.println(i);
        }

    }
    public void afisamWhile(Integer n){
        Integer i = 0;
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }
    }
}
