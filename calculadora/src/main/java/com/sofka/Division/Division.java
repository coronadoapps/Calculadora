package com.sofka.Division;
import java.util.Scanner;

public class Division {
    private static float num1, num2; // Se definen como float los numeros para la División

    public Division(float num1_, float num2_) { //Constructor
        num1 = num1_;
        num2 = num2_;
    }

    public void mostrarResultado() { //Se define el método para la operación de la División
        if (verificarCero(num2)) { //Se verifica si el segundo operando es 0
            System.out.println("");
            System.out.println("La división entre 0 no está definida.");
        } else {    
            float resultado = num1 / num2;
            System.out.println("");
            System.out.println("Operación realizada: ");
            System.out.println(num1 + " / " + num2 + " = " + resultado);
        }
    }
    
    private static boolean verificarCero(float num2) { //Se define el método para verificar si el segundo operando es 0
        if (num2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
