package com.ironhack.w1.d3;

public class HorrorMovie extends Movie{ // HERENCIA

    private boolean IS_SCARY;

    public HorrorMovie(String title, int duration, boolean IS_SCARY) {
        super(title, duration); // SUPER
        this.IS_SCARY = IS_SCARY;
    }

    public boolean isIS_SCARY() {
        return IS_SCARY;
    }

    public void setIS_SCARY(boolean IS_SCARY) {
        this.IS_SCARY = IS_SCARY;
    }

    public void play(){ // se puede sobrecargar un método
        System.out.println("Playing a horror movie");
    }
}
