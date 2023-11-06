package com;

public class Regime
{
    // les attributs 
    String name ;
    int prixKg;


    // constructeur :

    public Regime(String name , int prix)
    {
        this.name = name ;
        this.prixKg = prix ;
    }



    // 

    public int getPrix()
    {
        return this.prixKg;
    }

    public String getName()
    {
        return this.name;
    }



    @Override
    public String toString()
    {
        String chaine = String.format("%s a un prix de %d euro pour le kg" , this.name , this.prixKg);

        return chaine;
    }
}