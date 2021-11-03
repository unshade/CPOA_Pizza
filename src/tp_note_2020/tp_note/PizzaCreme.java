package tp_note_2020.tp_note;

import myImage.MyImage;

public class PizzaCreme implements Pizza {
    @Override
    public MyImage getPizzaIm() {
        return new MyImage("images/fond_creme.png");
    }

    @Override
    public double cout() {
        return 0;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
