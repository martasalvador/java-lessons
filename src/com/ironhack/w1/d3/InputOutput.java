package com.ironhack.w1.d3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws IOException {
        //// INPUT & OUTPUT

        /// SOUT Y SERR
        System.out.println("Prueba de salida por consola");
        System.err.println("Prueba de error por consola");

        /// SCANNER
        Scanner scanner = new Scanner(System.in); // Recoge datos del usuario en la consola

            // Ejemplo
        String name;
        // utlizamos un DO...WHILE porque si el usuario le diese al enter el programa seguiría corriendo
        // y de esta manera si no tienes un nombre de 3 letras te lo vuelve a preguntar
        do {
            System.out.println("Please write your name");
            name = scanner.nextLine();
        } while (name.length() < 3);
        System.out.println("Your name is: " + name);


        System.out.println("Please write your age");
        int age;

        if (scanner.hasNextInt()) {
            age = scanner.nextInt();
            System.out.println("Your age is: " + age);
        } else {
            System.err.println("Invalid type of age");
        }

        scanner.close(); // mejor CERRAR el scanner para que consuma menos


        /// FILE HANDLING
        String filePath = "src/com/ironhack/w1/d3/fichero.txt"; // creamos la ruta del fichero
        File file = new File(filePath);

        if(file.createNewFile()){
            System.out.println("El archivo se ha creado");
        } else {
            System.out.println("El archivo ya existe");
        }

            // Para escribir en nuestro archivo
        FileWriter writer = new FileWriter(filePath, true);
        // TRUE -> para que la info que escribamos aparezca después de lo ya escrito
        // FALSE -> para que borre lo que hay y escriba de nuevo

        writer.write("The name is: " + name + "\n");
        writer.write("Esto es la siguiente línea\n");
        writer.close();

        Scanner fileScanner = new Scanner(file);
        String str = "";
        while (fileScanner.hasNextLine()){
            str += fileScanner.nextLine() + "\n";
           // System.out.println(str);
        }
        scanner.close();
    }
}

