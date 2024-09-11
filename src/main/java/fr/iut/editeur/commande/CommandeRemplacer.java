package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;


/**
 * Commande permettant de remplacer un texte par un autre.
 */
public class CommandeRemplacer extends CommandeDocument {

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Remplace le texte entre les positions debut et fin par le texte de remplacement.
     */
    @Override
    public void executer() {
        String remplacement;
        if (parameters.length < 3) {
            System.err.println("Format attendu : remplacer;debut;fin;remplacement");
            return;
        }
        // VERSION FACILE
        if (parameters.length == 3) {
            remplacement = "";
        } else {
            remplacement = parameters[3];
        }
        // VERSION AVANCEE
        /*
        if (parameters.length < 4 || Objects.equals(parameters[3], "")) {
            this.document.remplacer(debut, fin, "");
            super.executer();
        } else {
        la suite...
        }
        */
        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        this.document.remplacer(debut, fin, remplacement);
        super.executer();
    }
}
