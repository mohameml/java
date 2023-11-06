package com;

public class Animal
{

    // lea attributs 
    protected String nom ;
    protected int poids ;
    protected  Regime rg ;


    // lea accesseures :

    public String getNom()
    {
        return this.nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom ;
    }


    public int getPoids()
    {
        return this.poids;
    }

    public void setPoids(int p)
    {
        this.poids = p ;
    }

    // un construcuteur :


    public Animal(String nom , int p )
    {
        this.nom = nom ;
        this.poids = p;

    }


    public Regime getRg()
    {
        return this.rg ;
    }

    public Animal(String nom , int p , Regime rgime)
    {
        this.nom = nom ;
        this.poids = p;
        this.rg = rgime;
    }


    // les méthodes :

    public void crier()
    {
        System.out.println(""+this.nom + " crie  ...");
    }


    @Override 
    public String toString()
    {
        String chaine = "l'Animal "+ this.nom + "de poids "+ this.poids;


        return chaine ;
    }


    public double calculNourriture()
    {
        if(this instanceof Vache)
        {
            return this.rg.getPrix()*(this.getPoids())*(0.1) ;
        }
        else if(this instanceof Canard) 
        {
            return this.getRg().getPrix();
        }
        else 
        {
            return -1 ; // cas d'un erreur 
        }
    }










}