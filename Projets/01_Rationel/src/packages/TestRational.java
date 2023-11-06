

public class TestRational {

    public static void main(String[] args) {
        
        Rationel r = new Rationel(3, 2);

        // Test de toSting 

        System.out.println(r.toString());


        // Test de mult :

        Rationel r2 = new Rationel(1,3);

        r.mult(r2);
        System.out.println("3/2"+"*"+r2.toString()+"="+r.toString());


        // Test de add :

        Rationel R1 = new Rationel(1, 2);
        Rationel R2 = new Rationel(2, 3);

        R1.add(R2);

        System.out.println("1/2+2/3 ="+ R1.toString());


        // Test de la fonction pgcd :

        System.out.println("------ Test de pgcd -----------");

        System.out.println("Le pgcd(12,4) = "+ReduceRationel.pgcd(12, 4));


        // Test de la classe : Reducerationnel :

        System.out.println("-------------- Test de la class ReduceRationnel : -------------------");
        System.out.println("");

        ReduceRationel r3 = new ReduceRationel(5, 10);

        System.out.print("La forme irréductible de 5/10 : ");
        System.out.println(r3.getNum()+"/   "+r3.getDenom());


    }
    
}
