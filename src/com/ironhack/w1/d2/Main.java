package com.ironhack.w1.d2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //// ARRAYS

        // Array con sus valores desde el inicio
        String[] days = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
        System.out.println(days[0]);

        String[] subjectsArray = createSubjectsArray();
        System.out.println(subjectsArray[0]);
        System.out.println(subjectsArray.length);
        System.out.println(createSubjectsArray()[0]); // Otra forma de imprimir un dato de un método


        //// LOOPS

        /// For Loop
        for (int i = 0; i < subjectsArray.length; i++) {
            if (subjectsArray[i].equals("english")) continue;
            if (subjectsArray[i].equals("chemistry")) System.out.println("Estamos en quimica");
            ;
            if (subjectsArray[i].equals("sports")) break;
            System.out.println(subjectsArray[i]);
        }

        int[] evenNumbers = new int[51];
        int j = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                evenNumbers[j] = i;
                j++;
            }
        }

        System.out.println(evenNumbers.length);
        System.out.println(Arrays.toString(evenNumbers));  // Mostrar los datos de un array


        /// For Each Loop
        for (int number : evenNumbers) {
            System.out.println(number);
        }

        for (String subject : subjectsArray) {
            System.out.println(subject); // println salto de línea
            System.out.print(subject + " "); // print te imprime en la misma línea
        }


        /// While Loop
        int counter = 0;
        while (counter < evenNumbers.length) {
            counter++;
        }

        System.out.println("counter: " + counter);


        /// Do While Loop --> Siempre se ejecuta el codigo aunque sea 1 vez.
        counter = 100;
        do {
            counter++;
        } while (counter < evenNumbers.length);

        //// MATH CLASS & CASTING
        System.out.println(Math.sqrt(64)); // devuelve la raíz cuadrada de un número
        System.out.println(Math.pow(2, 5)); // potencia
        System.out.println((int) 3.52); // quitar los decimales

        //// ARRAY LIST
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Spain");
        countries.add("France");
        countries.add("Germany");
        System.out.println(countries);
        System.out.println(countries.get(0)); // sacar un dato de una lista

        countries.set(2, "Italy"); // cambiar un dato
        System.out.println(countries.get(2));
        System.out.println(countries.size()); // equivale a .length

        countries.remove(0); // eliminar elemento
        System.out.println(countries);

        for (int i = 0; i < countries.size(); i++){
            System.out.println(countries.get(i));
        }

        List<Integer> intList = new ArrayList<>();

        /// Adding elements to an Array
        int[] numbers = {0, 1 , 2, 3, 4};
        int[] newArray = new int[6];
        for(int i = 0; i < 5; i++){
            newArray[i] = numbers[i];
        }
        newArray[5] = 5;
        System.out.println(Arrays.toString(newArray));
    }


        public static String[] createSubjectsArray() {

            // Array vacío que lo vas llenando después
            String[] subjects = new String[5];
            subjects[0] = "maths";
            subjects[1] = "english";
            subjects[2] = "chemistry";
            subjects[3] = "sports";
            subjects[4] = "spanish";

            return subjects;
        }
    }

