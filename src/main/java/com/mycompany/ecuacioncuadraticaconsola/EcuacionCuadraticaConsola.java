package com.mycompany.ecuacioncuadraticaconsola;

import java.util.Scanner;

public class EcuacionCuadraticaConsola {

    public static void main(String[] args) {
        //Instrucción para capturar errores que se presenten durante la ejecución
        try {
            //Declarar el objeto para lectura de variables
            Scanner sc;
            //Instanciar el objeto
            sc = new Scanner(System.in);

            System.out.println("Programa para calcular las raices de la ecuación cuadrática");
            //Obtener datos de entrada
            System.out.print("Coeficiente A:");
            double a = sc.nextDouble();
            System.out.print("Coeficiente B:");
            double b = sc.nextDouble();
            System.out.print("Coeficiente C:");
            double c = sc.nextDouble();

            //proceso
            if (a != 0) {
                double r = Math.pow(b, 2) - 4 * a * c;
                if (r >= 0) {
                    double x1 = (-b + Math.sqrt(r)) / (2 * a);
                    double x2 = (-b - Math.sqrt(r)) / (2 * a);

                    //mostrar resultados
                    System.out.println("Las raices son:\nX1 = " + x1 + "\nX2 = " + x2);
                } else {
                    double xr = -b / (2 * a); //Calcular parte real
                    double xi = Math.sqrt(-r) / (2 * a); //Calcular parte imaginaria
                    //mostrar resultados NUMEROS COMPLEJOS
                    System.out.println("Las raices son:\nX1 = " + xr + " + " + xi + " * i"
                            + "\nX2 = " + xr + " - " + xi + " * i");
                }
            } else {
                System.out.println("La ecuación no es cuadrática");
            }
        } catch (Exception ex) {
            System.out.println("Error en la entrada de datos\n" + ex.getMessage());
        }
    }

}
