import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;  

import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;

public class Main {



    
    public static void main(String[] args) {
        
        try 
        {
            /*
             * 
             *  jdbc:mysql://localhost:3306/Test?useSSL=flase   
             */

            // étabilt la connexion et créer la vaible de statement :


            String url = "jdbc:mysql://localhost:3306/Test";
            String user = "mohameml";
            String password = "";


            Connection co = DriverManager.getConnection( url,user , password);
            //Statement stm = co.createStatement();
            PreparedStatement stmt = co.prepareStatement("UPDATE product SET product_name =?  WHERE product_name = ?");

            stmt.setString(1, "nv_produit");
            stmt.setString(2, "P1");
            // exceution des réquetes :

            stmt.executeUpdate();

            Statement stm = co.createStatement();
            ResultSet res = stm.executeQuery("SELECT * FROM product");

            ResultSetMetaData metaData = res.getMetaData();

            // System.out.println(metaData);
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                System.out.println("Nom de colonne : " + metaData.getColumnName(i));
                System.out.println("Type de données : " + metaData.getColumnTypeName(i));
                // Autres détails sur les colonnes disponibles via ResultSetMetaData
            }


            
            while(res.next())
            {
                String query = res.getString("product_name");
                int prix = res.getInt("product_price");
                System.out.println(query + " vendu au  prix " + prix + " euros ");
            }


            co.close();

        } 
        catch(SQLException e) 
        {
            System.out.println("SQL Exception : ");
            System.err.println(e.getSQLState());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
