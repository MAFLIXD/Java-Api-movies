package com.alura.screenmatch.principal;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read {
    public static void main(String[] args) {
        try {
            File archivo = new File("pelicula.txt");
            Scanner scanner = new Scanner(archivo);

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado!");
        }
    }
}
