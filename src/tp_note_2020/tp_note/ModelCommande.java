package tp_note_2020.tp_note;

import java.util.ArrayList;
import java.util.List;

public class ModelCommande {
    private int nbPizza;
    private List<Pizza> listPizza;
    private int numPizzaCourante;
    private double prixCommande;
    private ArrayList<Observateur> observateurs;


    /**
     * Ajoute un observateur a la liste
     */
    public void enregistrerObservateur(Observateur o) {
        this.observateurs.add(o);
    }


    /**
     * Supprime un observateur a la liste
     */
    public void supprimerObservateur(Observateur o) {
        int i = this.observateurs.indexOf(o);
        if (i >= 0) {
            this.observateurs.remove(i);
        }
    }


    /**
     * Informe tous les observateurs de la liste des
     * modifications des mesures meteo en appelant leurs methodes actualiser
     */
    public void notifierObservateurs() {
        for (Observateur observer : this.observateurs) {
            observer.actualiser(this);
        }
    }

    public void ajouterPizza(String type, Pizza pizz) {
        if (this.nbPizza < 4) {
            this.listPizza.add(pizz);
            nbPizza ++;;
        }
    }

    public double calculPrixCommande() {
        int res = 0;
        for (Pizza pizza : this.listPizza) {
            if (pizza instanceof PizzaCreme) {
                res += 6;
            } else res += 5;
        }
        return res;
    }

    public void setNumPizzaCourante(int n) {
        if (n <= this.numPizzaCourante) {
            this.numPizzaCourante = n;
        }
    }

    public int getNbPizza() {
        return nbPizza;
    }

    public List<Pizza> getListPizza() {
        return listPizza;
    }

    public int getNumPizzaCourante() {
        return numPizzaCourante;
    }

    public double getPrixCommande() {
        return prixCommande;
    }

    public ArrayList<Observateur> getObservateurs() {
        return observateurs;
    }
}
