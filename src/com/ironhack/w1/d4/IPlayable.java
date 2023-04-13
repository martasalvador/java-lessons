package com.ironhack.w1.d4;

public interface IPlayable {
    public abstract void play();
    void pause(); // al ser una interfaz se da por hecho q van a ser public y abstract
    void mute();
    void increaseVolume();

    final double MAX_VOLUME = 1; // todas las variables de una I son CONSTANTES(FINAL), lo da por hecho
}
