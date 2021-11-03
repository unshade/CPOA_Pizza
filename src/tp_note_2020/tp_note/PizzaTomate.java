package tp_note_2020.tp_note;

import myImage.MyImage;

public class PizzaTomate implements Pizza{
    @Override
    public MyImage getPizzaIm() {
        return new myImage.MyImage("images/fond_tomate.png");
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
