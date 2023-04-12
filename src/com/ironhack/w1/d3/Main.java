package com.ironhack.w1.d3;

public class Main {
    public static void main(String[] args) {
        Movie harryPotter = new Movie("Harry Potter", 120);
        Movie mammaMia = new Movie("Mamma Mia", 180);
        Movie guardianesDeLaGalaxia = movieCreator("Guardianes de la Galaxia", 200);

        System.out.println(mammaMia.getTitle() + " is " + mammaMia.getDuration() + " minutes long");
        System.out.println(harryPotter);
        harryPotter.play();
        System.out.println(guardianesDeLaGalaxia);
        Movie.getAlert(); // los métodos estaticos se llaman desde la clase principal no desde el objeto
        System.out.println("¿Es buena la película " + guardianesDeLaGalaxia.getTitle() + "? -> " + guardianesDeLaGalaxia.IS_GOOD);


        HorrorMovie scream = new HorrorMovie("Scream", 130, false);
        System.out.println(scream.getTitle() + " " + scream.isIS_SCARY());
        scream.play();
    }

    public static Movie movieCreator(String title, int duration){
        return new Movie(title, duration);
    }
}
