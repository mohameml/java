import java.util.ArrayList;


public class Player 
{
    private int level ;
    private String name ;

    private ArrayList<String> missions = new ArrayList<>();

    public Player(int level , String name )
    {
        this.level = level;
        this.name = name;
        

    }


    public ArrayList<String> getMiss()
    {
        return this.missions;
    }
    public void add(String miss)
    {
        this.missions.add(miss);
    }
}