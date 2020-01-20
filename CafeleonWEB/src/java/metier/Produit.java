/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

/**
 *
 * @author pierr
 */
public class Produit {
    private int idProduit;
    private String intitule;
    private int prix;
    private String saveur;

    public Produit(int idProduit, String intitule, int prix, String saveur) {
        this.idProduit = idProduit;
        this.intitule = intitule;
        this.prix = prix;
        this.saveur = saveur;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getSaveur() {
        return saveur;
    }

    public void setSaveur(String saveur) {
        this.saveur = saveur;
    }
    
}
