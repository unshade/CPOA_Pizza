package tp_note_2020.tp_note;

import javax.swing.*;

public class VuePrix extends JLabel implements Observateur {

    public VuePrix(String text, int horizontalAlignment) {
        super(text, horizontalAlignment);
    }

    @Override
    public void actualiser(ModelCommande m) {
        this.setText("Prix total de votre commande : " + m.calculPrixCommande() + " euros");
    }
}
