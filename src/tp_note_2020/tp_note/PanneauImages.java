
package tp_note_2020.tp_note;

import myImage.MyImage;

import javax.swing.*;
import java.awt.*;

/**
 * A modifier
 *
 */
public class PanneauImages extends JPanel implements Observateur {

	ModelCommande mc;

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		//mim.superposer("images/ing_fromage.png");  //enlever le commentaire pour superposer l'ingredient fromage sur la pizza
		
		for(int i=0 ; i < mc.getNbPizza() ; i++){                    //Affiche 4 fois la meme pizza de base dans le JPanel courant
			MyImage mim;
			mim = mc.getListPizza().get(i).getPizzaIm();
			mim.dessinerDansComposant(g, (i+1)*25+ i*200,25); 
		}
		int i = mc.getNumPizzaCourante();
		g.drawRect((i+1)*25+ i*200,25, 200,200); // Affichage d'un rectangle entourant l'image

	}

	@Override
	public void actualiser(ModelCommande m) {
		this.mc = m;
		this.repaint();
	}
}
