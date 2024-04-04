package villagegaulois;

import personnages.Gaulois;
import produit.Produit;

public interface IEtal<P extends Produit> {
    boolean isEtalOccupe();
    Gaulois getVendeur();
    int getQuantite();
    P getProduit();
    void occuperEtal(Gaulois vendeur, P produit, int quantite);
    boolean contientProduit(String nomProduit);
    int acheterProduit(int quantiteAcheter);
    void libererEtal();
    String[] etatEtal();
}
