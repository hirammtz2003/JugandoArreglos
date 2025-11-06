/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jugandoarreglos;

import java.util.Arrays;

/**
 *
 * @author Hiram
 */
public class JugandoArreglos {
    public static void main(String[] args) {
        OperacionesArreglos op = new OperacionesArreglos();

        float[] numeros = {2.5f, -3.1f, 4.7f, -1.0f};

        System.out.println("Suma: " + op.calcularSuma(numeros));
        System.out.println("Promedio: " + op.calcularPromedio(numeros));
        System.out.println("Mayores que 0: " + op.contarMayoresQue(numeros, 0));
        System.out.println("Invertido: " + Arrays.toString(op.invertirArreglo(numeros)));
        System.out.println("Absolutos: " + Arrays.toString(op.obtenerAbsolutos(numeros)));
    }
}
