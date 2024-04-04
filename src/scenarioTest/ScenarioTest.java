package scenarioTest;

import villagegaulois.IEtal;
import produit.Sanglier;
// Assurez-vous d'importer les classes et interfaces nécessaires

public class ScenarioTest {
    public static void main(String[] args) {
        // Déclaration et initialisation du tableau d'étals pour accepter uniquement des sangliers
        IEtal<Sanglier>[] marche = new IEtal[3];

        // Exemple de création d'un étal spécifiquement pour des sangliers
        // Supposons que vous avez une classe concrète qui implémente IEtal<Sanglier>
        Etal<Sanglier> etalSanglier = new Etal<>(); // Assurez-vous que la classe Etal est bien adaptée pour cela

        // Placement de l'étal de sanglier dans le marché
        marche[0] = etalSanglier; // Ajout de l'étal de sanglier au tableau

        // À ce stade, le tableau `marche` est typé pour accepter uniquement des étals de type Sanglier,
        // ce qui signifie que vous ne pourrez pas y ajouter des étals destinés à d'autres types de produits.
        
        // Remplir le reste du tableau et manipuler les étals comme nécessaire
    }
}
