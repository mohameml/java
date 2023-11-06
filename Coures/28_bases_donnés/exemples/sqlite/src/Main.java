import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {


    public static void afficheTable(ResultSet res)
    {
        System.out.println("------------- Result of rquest : ----------- \n");
        try 
        {
            while(res.next())
            {
                String query = res.getString("product_name");
                int prix = res.getInt("product_price");
                System.out.println(query + " vendu au  prix " + prix + " euros ");
            }         
        } 
        catch(SQLException e) 
        {
            System.out.println("SQL Exception : ");
            System.err.println(e.getSQLState());        
        }

    }
    
    public static void main(String[] args) {
        
        try 
        {
            // étabilt la connexion et créer la vaible de statement :
            Connection co = DriverManager.getConnection("jdbc:sqlite:./res/test.db");
            Statement stm = co.createStatement();
    
            // exceution des réquetes :

            ResultSet res = stm.executeQuery("SELECT * FROM product");

            while(res.next())
            {
                String query = res.getString("product_name");
                int prix = res.getInt("product_price");
                System.out.println(query + " vendu au  prix " + prix + " euros ");
            }

            // upadte to the datebase :
            String req = "DELETE FROM product WHERE product_quantity < 3 ";
            stm.executeUpdate(req);


            System.out.println("le produit 9 et 10 sont supprimées ");

            res = stm.executeQuery("SELECT * FROM product");

            afficheTable(res);


            // et à la fin on fereme la connexion :
            co.close();

        } 
        catch(SQLException e) 
        {
            System.out.println("SQL Exception : ");
            System.err.println(e.getSQLState());
        }

    }
}
