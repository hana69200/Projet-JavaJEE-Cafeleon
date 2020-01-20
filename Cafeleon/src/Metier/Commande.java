package Metier;

public class Commande {
    private int idCommande;
    private int total;
    private String nomAcheteur;

    public Commande(int idCommande, int total, String nomAcheteur) {
        this.idCommande = idCommande;
        this.total = total;
        this.nomAcheteur = nomAcheteur;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getNomAcheteur() {
        return nomAcheteur;
    }

    public void setNomAcheteur(String nomAcheteur) {
        this.nomAcheteur = nomAcheteur;
    }
    
}
