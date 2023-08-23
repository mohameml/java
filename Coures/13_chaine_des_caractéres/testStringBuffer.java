public class testStringBuffer {

    public static void main(String[] args) {

        // Test de la Méthode append() :
        System.out.println("---- Test de : append() -----");
        StringBuffer chaineBuffer = new StringBuffer("Bonjour ");

        chaineBuffer.append("Tout le mond ");

        System.out.println(chaineBuffer);

        // Test de la Méthode insert()

        System.out.println("---- Tset de la méthode : insert()  -------");
        StringBuffer chaine2Buffer = new StringBuffer("Tout le mond!!!");

        chaine2Buffer.insert(0, "Bonjour");

        System.out.println(chaine2Buffer);
    }

}
