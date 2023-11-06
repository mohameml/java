
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.LocalTime;
import java.time.Duration;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.time.Instant;

import java.util.Set;

/*
 * 
 * LocalDate 
 * LocalTime
 * LocalDateTimem
 */

public class Main
{
    public static void main(String[] args) {



        Instant start = Instant.now();
        System.out.println(start.toEpochMilli());
        System.out.println("le temps écouel est " + start);
        

        // la constate EPOCH :
        LocalDate  date = LocalDate.EPOCH;
        System.out.println("date EPOCH is :"+date);

        // Date now :
        date = LocalDate.now();
        System.out.println("date now is :"+date);

        // Date qq :
        date = LocalDate.of(2002,02,04);
        System.out.println("my birthday is :" + date);


        // méthode of year 
        int anne = date.getYear();
        System.out.println("the year of my brithday is :"+anne);


        // méthode of moth 

        /*
         * getMothValue : --> postion du mois dans l'année 
         * getMoth : --> Month : MARCH .....etc
         * 
         * 
         */
        int moth = date.getMonthValue();
        Month moth_s = date.getMonth();
        System.out.println("the moth of my brithday is :"+moth_s);
        System.out.println("the moth of my brithday is :"+moth);



        // méthode of Day :
        /*
         * getDayOfweek : --> [Monday , ...]
         * getDayOfYear : --> sa position dans l'année 
         * getDayOfweek : sa position dans le seamain 
         */

        System.out.println("le jour de mon anniversaire est :"+date.getDayOfWeek());
        System.out.println("le jour de mon anniversaire est :"+date.getDayOfMonth());
        System.out.println("le jour de mon anniversaire est :"+date.getDayOfYear());




        /*
         *  ------ opérations : -------*
         * plusYears 
         * plusMoths 
         * PlusDays 
         * 
         * minusYears
         * minusMoths
         * minusDays
         */


        date = date.plusYears(2);
        System.out.println("the moth after plus2  is :"+date);

        date = date.plusMonths(2);
        System.out.println("the moth after plus2  is :"+date);

        date = date.plusDays(2);
        System.out.println("the moth after plus2  is :"+date);

        date = date.minusYears(2);
        System.out.println("the moth after plus2  is :"+date);

        date = date.minusMonths(2);
        System.out.println("the moth after plus2  is :"+date);

        date = date.minusDays(2);
        System.out.println("the moth after plus2  is :"+date);


        
        /*
         * 
         * 
         * -------------------------------------------- Time :-----------------------------------------
         */
        System.out.println("-------------------------------------------- Time :-----------------------------------------\n \n");

        LocalTime time = LocalTime.now();
        System.out.println(time);

        time = LocalTime.of(15,30,10);
        System.out.println("rappel : c'est excatement --> "+time);

        /*
         * 
         * getHour()
         * plusHours
         * 
         */
        System.out.println("l'heure mnt est :"+time.getHour());
        time = time.plusHours(2);
        System.out.println("l'heure mnt est :"+time.getHour());
    

        /*
         * 
         * 
         * -------------------------------------------- DateTime :-----------------------------------------
         */
        System.out.println("-------------------------------------------- DateTime :-----------------------------------------\n \n");

        LocalDateTime ldt = LocalDateTime.of(date,time);
        System.out.println(ldt);




        // la calsse Duration :

        System.out.println("------------------------- Duration ------------------------ \n \n");

        Duration durée = Duration.ofHours(3).plusMinutes(30); // une durée de 3h30 min 
        System.out.println(durée);

        // l'ajout d'une durée à une date : ---- la méthode plus ----
        LocalTime time1 = LocalTime.of(5,15 ,00).plus(durée);
        System.out.println(time1);

    

        System.out.println("-------------------------------- ZoneId ------------------------");
        ZoneId zoneSystème = ZoneId.systemDefault(); // Récupère le fuseau horaire système par défaut de la machine
        System.out.println("le fuseau horaire de la machine par défaut est :" + zoneSystème);


        System.out.println("--------------------- formateur ------------------------------ \n");

        LocalDate date2 = LocalDate.of(2000 , 1, 1);

        DateTimeFormatter formateur = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dateString = date2.format(formateur);

        System.out.println("la date formateur est : " + dateString);



        Instant end = Instant.now();

        // Calcul de la durée en utilisant Duration.between()
        Duration executionTime = Duration.between(start, end);

        // Affichage du temps d'exécution en millisecondes
        System.out.println("Temps d'exécution : " + executionTime.toMillis() + " millisecondes");



        // Set<String> fuseauxHoraires = ZoneId.getAvailableZoneIds();
        // for (String zone : fuseauxHoraires) {
        //     System.out.println(zone);
        // }

        LocalDate date3 = LocalDate.now();
        LocalTime time3 = LocalTime.now();
        System.out.println(date3);
        
        // ZonedDateTime timeUC = ZonedDateTime.now(ZoneId.of("    "));

        // System.out.println("le temps en UC now est :" + timeUC);    
    }   

}