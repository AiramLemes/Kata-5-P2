
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Mail;

public class MailListReaderDB {
    
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:Kata5.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Connexión a SQLite establecida");
        } catch (SQLException e) {
         System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public List<Mail> read() {

        ArrayList<Mail> mailList = new ArrayList<>();
    
        String sql = "SELECT * FROM EMAIL";
        
        try (Connection conn = this.connect();
                
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) 
        {
            
            // Bucle sobre el conjunto de registros.
            
            while (rs.next()) {
                mailList.add(new Mail(rs.getString("mail")));
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    

         return mailList;
    }
   
}
