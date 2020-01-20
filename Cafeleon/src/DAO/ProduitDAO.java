/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Metier.Produit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author p1801444
 */
public class ProduitDAO extends DAO<Produit>{
     public ProduitDAO(Connect conn) {
        super(conn);
    }

  

   

    public ArrayList<Produit> getReservationByCourt(int idCourt){
        ArrayList listeProduit = new ArrayList<>();
        try{
            String sql="select * from( select idReservation,type,dateDebut,dateFin,Reservation.nom,Users.idUser from Reservation,Users where Reservation.idUser = Users.idUser and idCourt=? and dateFin>date(SYSDATE()) UNION select idMatch as idReservation,'Match' as type ,dateMatch as dateDebut,DATE_ADD(dateMatch,INTERVAL 3 HOUR)as dateFin,'Tournois' as nom,0 as idUser from Matchs where idCourt=? and dateMatch>date(SYSDATE()) )a order by a.dateDebut asc ";
            PreparedStatement stmt= Connect.getConnexion().prepareStatement(sql);
            stmt.setInt(1,idCourt);
            stmt.setInt(2,idCourt);
            ResultSet rset=stmt.executeQuery();
            while(rset.next()){
               Produit res = new Produit(rset.getInt(1),rset.getString(2),rset.getInt(3),rset.getString(4));
                listeProduit.add(res);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProduitDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listeProduit; 
    }
   

}
