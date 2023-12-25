package fr.exemple.entites;

public class Player {

    private String name ;
    private int level ;


    public String getName()
    {
        return this.name;
    }

    public int getLevel()
    {
        return this.level ;
    } 



    public Player(String name , int level)
    {
        this.name =  name ;
        this.level = level ;
    }


    @Override
    public String toString()
    {
        return "Player(name = " + this.name + " , level = " + this.level + ")";    
    }


    @Override
    public boolean equals(Object o)
    {
        if(o instanceof Player)
        {
            Player p = (Player)o ;

            return name.equals(p.getName()) && level==p.getLevel();
        }
   
        return false;
    }





}
