package com;


public class Canard extends Animal
{
	
	String col_plume ;
	
	
	
	public String getCouleurPlumes()
	{
		return this.col_plume;
	}
	
	
	public Canard(String nom , int  poids , String col)
	{
		super(nom ,poids ,  new Regime("graines" , 10));
		this.col_plume = col;
		
	}


	@Override
	public void crier()
	{
		System.out.printf("%s crie .... ce canard de + %d kg aux belles plume  %s ......\n",this.nom,this.poids,this.col_plume);

	}

	@Override
	public String toString()
	{
		String chaine = String.format("le canard de nom %s et de poids %d et de couleur %s mange : " ,this.nom , this.poids , this.col_plume).concat(this.rg.toString());


		return chaine ; 
	}
    
}