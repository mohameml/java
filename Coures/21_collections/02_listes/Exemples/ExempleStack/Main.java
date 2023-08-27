import java.util.Stack;

import javax.sound.midi.Synthesizer;

public class Main {

    public static void main(String[] args) {
        /*
         * Stack(Pile) : Principe LIFO : last _In_First_Out
         */

        Stack<String> pile = new Stack<String>();

        /*
         * Les Méthodes :
         * - push() : pour ajouter des élemnts
         * - pop() : pour supprimer
         * - peek() : pour récuper l'en tete de la pile
         * 
         */

        pile.push("Sidi");
        pile.push("khaled");
        pile.push("Nebil");

        // parcourir

        for (String str : pile) {
            System.out.println(str);
        }

        System.out.println();
        // suprimer Le dernire élemnt :
        String str = pile.pop();
        System.out.println(str);

        pile.push("Ahmed");

        // récupere un elemnent :

        String str2 = pile.peek();
        System.out.println(str2);
    }
}
