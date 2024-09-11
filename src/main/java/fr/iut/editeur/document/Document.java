package fr.iut.editeur.document;

/**
 * Classe représentant un document texte.
 */
public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }

    /**
     * Remplace la partie du texte entre les deux int en paramètres par un autre texte.
     * @param debut
     * @param fin
     * @param remplacement
     */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    /**
     * Met en majuscules la partie du texte entre les deux int en paramètres.
     * @param debut
     * @param fin
     */
    public void majuscules(int debut, int fin) {
        remplacer(debut, fin, texte.substring(debut, fin+1).toUpperCase());
    }

    /**
     * Efface la partie du texte entre les deux int en paramètres.
     * @param debut
     * @param fin
     */
    public void effacer(int debut, int fin) {
        remplacer(debut, fin, "");
    }

    /**
     * Efface tout le texte.
     */
    public void clear() {
        texte = "";
    }
    // test pour close #1
}
