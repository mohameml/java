package com;


public class Vache extends Animal
{
    // attributs nouveau :

    int nbTache ;

    public Vache(String nom , int poids , int nb )
    {
        super(nom , poids , new Regime("herbe",20));
        this.nbTache = nb ;
    }



    int getnbTache()
    {
        return this.nbTache;
    }


    @Override
    public void crier()
    {
        System.out.println(""+this.nom+" , la vache à "+this.nbTache +" taches qui tache , crie ... il meugle");

    }


    
}