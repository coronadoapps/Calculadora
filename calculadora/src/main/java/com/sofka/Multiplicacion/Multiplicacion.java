package com.sofka.Multiplicacion;
import java.util.Scanner;

public class Multiplicacion {
    private static float num1, num2; // Se definen como float los numeros para la Suma

    public Multiplicacion(float num1_, float num2_) { //Constructor
        num1 = num1_;
        num2 = num2_;
    }

    public void mostrarResultado() { //Se define el método para la operación de la Suma
        float resultado = num1 * num2;
        System.out.println("");
        System.out.println("Operación realizada: ");
        System.out.println(num1 + " x " + num2 + " = " + resultado);
    }    
}
