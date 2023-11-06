public class TestExtensibleVector {

    public static void main(String[] args) {
        
        System.out.println("------------------- Test de la classe ExtensibleVcetor -------------------");


        // 1ere : On ajout une table de  3 elme :

        Rationel[] tab = {new Rationel(1, 2) ,new Rationel(1, 2), new Rationel(1, 2)};

        ExtensibleVector v1 = new ExtensibleVector(tab);


        System.out.println(v1);

        // 2éme : On ajout mnt 10 élms :

        Rationel[] tab1 = {new Rationel(1, 3) ,new Rationel(1, 4), new Rationel(1, 5) , new Rationel(1, 2) , new Rationel(1, 10) , new Rationel(2, 1)};
        ExtensibleVector v2 = new ExtensibleVector(tab1);

        System.out.println(v2);

        // Test de la méthode getDimension :
        System.out.println("---------------- Test getDimension() ---------------");
        System.out.println("la dimension de v2 est : "+v2.getDimension());


        System.out.println("----------------- Test d'append -------------------");

        System.out.println("voici mnt v2 :"+v2);
        System.out.println("On ajout mnt 1/20 ");
        v2.append(new Rationel(1,20));
        System.out.println(v2);

        System.out.println("------------------- Test de get --------------");
        System.out.println("L'élment d'indice 0 "+v2.get(0));


    }


}
