
public class Main {
    
    public static void main(String[] args) {
        Player p1 = new Player(1, "sidi");

        p1.add("miss1");

        for(String miss : p1.getMiss())
        {
            System.out.println(miss);
        }

        Player p2 = new Player(2 , "sidi");
        p2.add("miss2");





        
    }
}
