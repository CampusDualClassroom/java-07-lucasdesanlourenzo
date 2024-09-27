package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        positionInAList(8);
    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <11 ; i++) {
            lista.add(i);
            System.out.println(i);

        }
        boolean esta = false;

        for (int i = 0; i <lista.size() ; i++) {
            if(num == lista.get(i)){
                esta=true;
                System.out.println("El elemento "+ num +"se encuentra en la posición: "+i);
                return;
            }
        }

        if(!esta){
            System.out.println("El elemento"+ num +" no se encuentra en la lista.");
        }
    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int suma = 0;

        if (num <= 0) {
            System.out.println("El número no es entero positivo");
            return;
        }
        System.out.print("suma de los primeros " + num + " números naturales: ");

        for (int i = 1; i <= num; i++) {
            suma += i;
            if (i < num) {
                System.out.print(i + " + ");
            } else {
                System.out.print(i + " = ");
            }
        }

        System.out.println(suma);
    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        if (num <= 0) {
            System.out.println("El número no es entero positivo.");
            return;
        }

        System.out.print("Los primeros " + num + " números naturales son: ");

        for (int i = 1; i <= num; i++) {
            if (i < num) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }

        System.out.println();
    }
    }


