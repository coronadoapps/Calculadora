package com.sofka;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.RunElement;

import com.sofka.Division.Division;
import com.sofka.Modulo.Modulo;
import com.sofka.Multiplicacion.Multiplicacion;
import com.sofka.Resta.Resta;
import com.sofka.Suma.Suma;

public class App 
{
    private static boolean continuar = true;
    private static int opcion;

    public static void main( String[] args )
    {
        do {
            limpiarPantalla();
            menu();
            opcion = capturarInt();
            limpiarPantalla();
            continuar = evaluarOpcion(opcion);
            
        } while (continuar);
        //presioneCualquierTeclaParaContinuar();
        limpiarPantalla();
    }

    private static void menu() {
        System.out.println("-- Mi Calculadora --");
        System.out.println("Seleccione una opción: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Módulo de la división");
        System.out.println("0. Salir");
    }

    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    private static void presioneCualquierTeclaParaContinuar() { 
        System.out.println("Presione cualquier tecla para continuar...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    }

    private static int capturarInt() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private static boolean evaluarOpcion(int opcion){
        float num1, num2;
        switch (opcion) {
            case 1:
                System.out.println("-- Suma --");
                solicitarFloat("primer");
                num1 = capturarFloat();
                solicitarFloat("segundo");
                num2 = capturarFloat();
                Suma miSuma = new Suma(num1, num2);
                Suma.mostrarResultado();
                presioneCualquierTeclaParaContinuar();
                return true;

            case 2:
                System.out.println("-- Resta --");
                solicitarFloat("primer");
                num1 = capturarFloat();
                solicitarFloat("segundo");
                num2 = capturarFloat();
                Resta miResta = new Resta(num1, num2);
                miResta.mostrarResultado();
                presioneCualquierTeclaParaContinuar();
                return true;

            case 3:
                System.out.println("-- Multiplicación --");
                solicitarFloat("primer");
                num1 = capturarFloat();
                solicitarFloat("segundo");
                num2 = capturarFloat();
                Multiplicacion miMultiplicacion = new Multiplicacion(num1, num2);
                miMultiplicacion.mostrarResultado();
                presioneCualquierTeclaParaContinuar();
                return true;

            case 4:
                System.out.println("-- División --");
                solicitarFloat("primer");
                num1 = capturarFloat();
                solicitarFloat("segundo");
                num2 = capturarFloat();
                Division miDivision = new Division(num1, num2);
                miDivision.mostrarResultado();
                presioneCualquierTeclaParaContinuar();
                return true;

            case 5:
                System.out.println("-- Modulo de la División --");
                solicitarFloat("primer");
                num1 = capturarFloat();
                solicitarFloat("segundo");
                num2 = capturarFloat();
                Modulo miModulo = new Modulo(num1, num2);
                miModulo.mostrarResultado();
                presioneCualquierTeclaParaContinuar();
                return true;

            case 0:
                return false;

            default:
                System.out.println("Opción incorrecta!!");
                System.out.println("Por favor vuelva a intentarlo.");
                presioneCualquierTeclaParaContinuar();
        }
        return true;
    }

    private static float capturarFloat() {
        Scanner input = new Scanner(System.in);
        return input.nextFloat();
    }

    private static void solicitarFloat(String i) {
        System.out.println("Ingrese el " + i + " número: ");
    }

}
