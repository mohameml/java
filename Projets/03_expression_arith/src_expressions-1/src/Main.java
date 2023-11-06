import java.util.Scanner;

import packages.*;



public class Main
{


    static Env parserEnvironnement(Scanner sc) 
    {
        Env env = new Env();

        while (sc.hasNext()) 
        {
            String varStr = sc.next();
            // est-ce une variable ?
            if (varStr.matches("[a-zA-Z]+?")) 
            {
                String dblStr = sc.next();
                double d = Double.parseDouble(dblStr);
                env.associer(varStr, d);
            } 
            else 
            {
                throw new RuntimeException("Erreur. Nom de variable attendu");
            }
        }
        return env;
    }


    static ExpAbstraite parser(Scanner sc)
    {
        if (!sc.hasNext()) 
        {
            throw new RuntimeException("parsing impossible : il manque des operandes !");
        }

        String op = sc.next();

        switch (op) 
        {
            case "+":
                ExpAbstraite opGauche = parser(sc);
                ExpAbstraite opDroite = parser(sc);
                return new BinairePlus(opGauche, opDroite);

            case "*":
                return new BinaireMult(parser(sc), parser(sc));

            case "sin":
                return new UnaireSin(parser(sc));

            case "cos":
                return new UnaireCos(parser(sc));
        }

        try 
        {
            double d = Double.parseDouble(op);
            return new Constante(d);
        } 
        catch (NumberFormatException e) {
            // TODO: jamais laisser vide!
        }

        // est-ce une variable ?
        if(op.matches("[a-zA-Z]+?")) 
        {
            
            // variable : uniquement des lettres !
            
            return new Variable(op);
        }

        throw new RuntimeException("parsing impossible : operateur '" + op + "' non reconnu");
    }








    public static void main(String[] args)
    {
        ExpAbstraite exp ;



        /*
         * 
         * ---------------------------- Test  Affichage infixée --------------------------- 
         * 
        */

        System.out.println("---------------------------- Test  Affichage infixée --------------------------- ");

        exp = new Constante(42);

        System.out.println(exp.toStringInfixe());


        // teste l'expression préfixée *  y  3
        exp = new BinaireMult(new Variable("y"), new Constante(3)) ;

        String chaine = exp.toStringInfixe() ;

        if(chaine==null)
        {
            System.out.println("Il y'a un erreur  ");
        }
        else 
        {
            System.out.println(chaine);
        }

        // teste l'expression préfixée * + x x 5
        exp = new BinaireMult(
                new BinairePlus(
                    new Variable("x"),
                    new Variable("x")
                    ),
                new Constante(5)
                );
        System.out.println(exp); // et pas toStringInfixe; juste comme ça



        // teste l'expression préfixée * -3.5 sin + a b
        exp = new BinaireMult(
                new Constante(-3.5),
                new UnaireSin(
                    new BinairePlus(
                        new Variable("a"),
                        new Variable("b")
                        )
                    )
                );
        System.out.println(exp);


        /*
         * 
         * ---------------------------- Test  Eval--------------------------- 
         * 
        */

        System.out.println("------------------------------------ Test Eval ------------------------------------- ");
        

		Env env = new Env();
		env.associer("y", 2);
		env.associer("x", 1);
		env.associer("a", 9);
		env.associer("b", 3);
		System.out.println(env);

		// ExpAbstraite exp2 ;
		// teste l'expression préfixée *  y  3
		exp = new BinaireMult(new Variable("y"), new Constante(3)) ;
		System.out.print("Valeur de l'expression " + exp.toStringInfixe() + " -- attendu == 6.0: ");
		System.out.println(exp.evaluer(env));

		// teste l'expression préfixée * + x x 5
		exp = new BinaireMult(
		                new BinairePlus(
		                                   new Variable("x"),
		                                   new Variable("x")
		                ),
		                new Constante(5)
		);
		System.out.print("Valeur de l'expression " + exp.toStringInfixe() + " -- attendu == 10.0: ");
		System.out.println(exp.evaluer(env));

		env.associer("x", 2);
		System.out.print("Rebelote avec x==2 -- attendu == 20.0: ");
		System.out.println(exp.evaluer(env));

		// teste l'expression préfixée * -3.5 sin + a b
		exp = new BinaireMult(
		            new Constante(-3.5),
		            new UnaireSin(
		                    new BinairePlus(
		                            new Variable("a"),
		                            new Variable("b")
		                    )
		            )
		);
		System.out.print("Valeur de l'expression " + exp.toStringInfixe() + " -- attendu == 1.878005213: ");
		System.out.println(exp.evaluer(env));



    /*
     * 
     * ---------------------------------- Test de calcul de dériver : -------------------------
     * 
     * 
    */

    System.out.println("--------------------------------- Test de calcul de dériver : -------------------------");

    exp = new BinairePlus(new Variable("x"), new Constante(1));
    ExpAbstraite der = exp.calculerDerivee();
    System.err.print("la dériveé de l'expression "+ exp.toStringInfixe() +" -- attendu == 1.0 : ");
    System.out.println(der.toStringInfixe());


    exp = new BinairePlus(new BinaireMult(new Variable("x"), new Variable("x")), new Constante(1));
    der = exp.calculerDerivee();
    System.err.print("la dériveé de l'expression "+ exp.toStringInfixe() +" -- attendu == 2.0*x + 0.0 :  ");
    System.out.println(der.toStringInfixe());

    exp = new BinaireMult(new Constante(2), new UnaireSin(new Variable("x")));
    der = exp.calculerDerivee();
    System.err.print("la dériveé de l'expression "+ exp.toStringInfixe() +" -- attendu == 2*cos(x): ");
    System.out.println(der.toStringInfixe());





    /*
     * 
     * --------------------------------------- Test Parser ------------------------------------------ 
     * 
    */
    
    System.out.println("---------------- Test parser -------------------------- \n");
    
    Scanner input = new Scanner(System.in);
    System.out.println("Veuillez saisir l'expression en notation infixée. Utilisez des espaces entre chaque element ! : ");
    System.out.println(" Exemple :  + x * sin y 0.1 ");
    System.out.println("C'est à vous !");

    String exprString = input.nextLine();

    System.out.println("Vous avez saisi : " + exprString);
    Scanner sc = new Scanner(exprString);

    exp = parser(sc);
    if (sc.hasNext()) 
    {
        // pas normal !
        input.close();
        throw new RuntimeException("Erreur. Expression mal formée");
    }

    System.out.println(exp.toString());

    
    while (true) 
    {
        // création de l'environnement stockant les valeurs des variables
        System.out.println("-----------------------");
        System.out.println("Veuillez saisir les valeurs de toutes les variables (environnement)");
        System.out.println("  Format : <variable> <valeur> <variable> <valeur> sur une seule ligne.");
        System.out.println("  Exemple x 2.5 y 3.1416 .... ");
        System.out.println("Tapez exit pour sortir");
        System.out.println("C'est à vous !");
        
        input = new Scanner(System.in);
        String envString = input.nextLine();
        if (envString.equals("exit")) 
        {
            System.out.println("Bye bye");
            input.close();
            System.exit(0);
        }
            
        sc = new Scanner(envString);
        try 
        {
            env = parserEnvironnement(sc);
            System.out.println("Expression    : " + exp.toStringInfixe());
            System.out.println("Environnement : " + env);
            double resultat = exp.evaluer(env);
            
            System.out.print("Valeur de l'expression, compte tenu de l'environnement : ");
            System.out.println(resultat);
            
        } 
        catch (Exception e) 
        {
            System.out.println();
            System.out.println("erreur detectee : " + e);
            System.out.println("Recommencez !");
        }
    }








    }

}