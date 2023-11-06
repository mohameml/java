import packages.*;


public class Main {
    public static void main(String args[]) {
      Prof p = new Prof("Sidonie", 1542);
         // La classe Prof dérive de la classe Animal.
         // => Un objet Prof "est" aussi un Animal
         // => On peut manipuler un objet de type Prof "en tant que" Animal !
         Animal unProfEstUnAnimal = p; // et voila !

         // Notez qu'on pourrait même écrire directement sans problème :
         // Animal unProfEstUnAnimal = new Prof("Sidonie", 1542);

         // Désormais, unProfEstUnAnimal est une référence de type Animal
         // qui manipule (réfère) un objet dont le "vrai" type est Prof !

         // Faisons crier notre Animal... qui est un Prof... donc fait crier le prof. Aie !
         unProfEstUnAnimal.crier(); // affiche "Grrrr"

         // affiche l'état du Prof :
         // "Mon nom est Sidonie. Je suis un Animal de type Prof. J'ai 1542 étudiants"
         System.out.println(unProfEstUnAnimal.toString());
    }
}