package tp_note_2020.tp_note;

import javax.swing.*;

public class VueCommText extends JLabel implements Observateur {
    @Override
    public void actualiser(ModelCommande m) {
        String s = "<html>" +
                "<strong>VOTRE COMMANDE<strong/> <br> " +
                "<ul>";

    }
}
