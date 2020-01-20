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

  

   

    public ArrayList<Produit> getProduit(){
        ArrayList listeProduit = new ArrayList<>();
        System.out.println("test");
        try{
            String sql="select * from Produit";
            PreparedStatement stmt= Connect.getConnexion().prepareStatement(sql);
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
