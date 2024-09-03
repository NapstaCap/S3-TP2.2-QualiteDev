package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

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
