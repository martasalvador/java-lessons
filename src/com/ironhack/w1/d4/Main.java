package com.ironhack.w1.d4;

public class Main {
    public static void main(String[] args) {
        Player player = new WebPlayer(0.5,1);  // se puede crear una instancia de webPlayer con tipo de player
        WebPlayer webPlayer =  new WebPlayer(0.3, 2);

        System.out.println(player.getCurrentTrack());
        System.out.println(webPlayer.getVolume());

        AndroidPlayer androidPlayer = new AndroidPlayer(0.8, 6);
        IPlayable androidPlayer2 = new AndroidPlayer(0.9,4);
        androidPlayer.close();
        // androidPlayer2.close();  -> no se puede porque al poner q es de tipo Interfaz le limitas a los métodos de la I no de la instancia
        androidPlayer2.play();
    }
}
