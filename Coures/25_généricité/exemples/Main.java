
import java.util.ArrayList;
import java.util.List;


public class Main {



    public static void printList(List<?> l)
    {
        // une méthode génerique 
        
        for(Object o : l)
        {
            System.out.println(">"+ o.toString());
        }
    }
    
    public static void main(String[] args) {
        

        Fruit fr1 = new Fruit("f1" , 12);
        Fruit fr2 = new Fruit("f2" , 12);
        Fruit fr3 = new Fruit("f3" , 12);
        
        List<Fruit>  lf = new ArrayList<>();
        lf.add(fr1);
        lf.add(fr2);
        lf.add(fr3);
        

        Vegetable v1 = new Vegetable("v1", Color.BLACK);
        Vegetable v2 = new Vegetable("v2", Color.BLACK);
        Vegetable v3 = new Vegetable("v3", Color.BLACK);

        List<Vegetable> lv = new ArrayList<>();

        lv.add(v1);
        lv.add(v2);
        lv.add(v3);


        printList(lf);
        printList(lv);





    }


}
