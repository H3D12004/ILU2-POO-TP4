package produit;

public class Poisson extends Produit {
    private String datePeche;

    public Poisson(String datePeche) {
        super("poisson", "pièce");
        this.datePeche = datePeche;
    }

    @Override
    public String decrire() {
        return "poisson pêché " + datePeche + ".";
    }
}
