package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect {
    
    private static Connection connexionBD = null;
    
    public static void main(String[] args) {

        // TODO Auto-generated method stub
   

    }
    
    public static Connection getConnexion(){
        if(connexionBD == null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://iutdoua-web.univ-lyon1.fr:3306/p1801444";
                String id = "p1801444";
                String mdp = "365308";
                connexionBD = DriverManager.getConnection(url , id, mdp);
            }
            catch(SQLException | ClassNotFoundException ex){
                Logger.getLogger(ProduitDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return connexionBD;
    }

}