public class Animal {


    protected String name ;
    protected int poids;

    public Animal(String name , int poids)
    {
        this.name = name;
        this.poids = poids ;
    }


    public void crier()
    {
        System.out.println("Crier .....Aniaml ");
    }


    @Override 
    public  String toString()
    {
        String chaine = "L'Animal "+ this.name + "de poids " + this.poids + "kg ";

        return chaine;
    }
    
}
