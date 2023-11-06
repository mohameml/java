import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class Main {
    



    public static LocalDate parseAge(String a)
    {
        DateTimeFormatter formateur = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate a_p = LocalDate.now();
        
        try
        {
            a_p = LocalDate.parse(a,formateur);   

        } 
        catch (DateTimeParseException e) {
            
            System.out.println("Erruer vous n'avez pas respceter le format  : jour/mois/année");

            System.exit(0);
        }


        return a_p;

        

    }


    public static void main(String[] args) 
    {
        
        
        // demansde de l'uitilisateur de saisie son date de naissance :

        Scanner sc = new Scanner(System.in);

        System.out.println("vous devez siaise votre aneée de naissance avec le format : jour/mois/année");
        System.out.print("-- saisie ton année de naissance : "); 

        String anneéNaissance = sc.nextLine();

        LocalDate anneéNaisParsing = parseAge(anneéNaissance); 
        LocalDate nowDate = LocalDate.now();




        // calcul de l'age :


        Period per = Period.between(anneéNaisParsing, nowDate);

        int age = per.getYears();



        // affichage de l'age :
        System.out.println("\n \n");
        System.out.println("-- Votre age est : " + age);
        System.out.println("");



        sc.close();
    }
}
