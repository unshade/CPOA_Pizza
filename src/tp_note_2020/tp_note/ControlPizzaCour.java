package tp_note_2020.tp_note;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControlPizzaCour implements MouseListener {

    ModelCommande mc;

    public ControlPizzaCour(ModelCommande mc) {
        this.mc = mc;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        int numpizzaSelec = x/225;
        switch (numpizzaSelec) {
            case 1 : {
                mc.setNumPizzaCourante(1);
            }
            case 2 : {
                mc.setNumPizzaCourante(2);
            }
            case 3 : {
                mc.setNumPizzaCourante(3);
            }
            case 4 : {
                mc.setNumPizzaCourante(4);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
