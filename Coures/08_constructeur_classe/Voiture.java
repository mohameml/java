
/*
 construction du classe voiture  
*/

public class Voiture {
    // on definit le construcuteur de cette classe

    int numéro;
    private int vitesse_max;
    private String type;

    public Voiture(int num, int vitesse_max_f) {
        /*
         * - Un construcuteur posséde le méme nom de la classe;
         * -
         * 
         */
        this.numéro = num;
        this.vitesse_max = vitesse_max_f;

    }

}