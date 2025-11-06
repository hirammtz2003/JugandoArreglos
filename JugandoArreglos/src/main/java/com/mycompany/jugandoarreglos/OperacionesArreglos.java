/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jugandoarreglos;

/**
 *
 * @author Hiram
 */
public class OperacionesArreglos {

    // 5.1. Función que recibe un arreglo de números decimales y regresa la sumatoria
    public float calcularSuma(float[] num) {
        if (num == null) {
        return 0f;
        }
        
        float suma = 0f;
        for (int i = 0; i < num.length; i++) {
            suma += num[i];
        }
        return suma;
    }

    // 5.2. Función que recibe un arreglo de números decimales y regresa el promedio
    public float calcularPromedio(float[] num) {
        if (num.length == 0) {
            return 0f;
        }
        float suma = calcularSuma(num);
        return suma / num.length;
    }

    // 5.3. Función que recibe un arreglo y un límite, y regresa la cantidad de elementos que exceden el límite
    public int contarMayoresQue(float[] num, float limite) {
        int contador = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > limite) {
                contador++;
            }
        }
        return contador;
    }

    // 5.4. Función que recibe un arreglo y devuelve un nuevo arreglo invertido
    public float[] invertirArreglo(float[] num) {
        float[] invertido = new float[num.length];
        for (int i = 0; i < num.length; i++) {
            invertido[i] = num[num.length - 1 - i];
        }
        return invertido;
    }

    // 5.5. Función que recibe un arreglo y devuelve uno con los valores absolutos
    public float[] obtenerAbsolutos(float[] num) {
        float[] absolutos = new float[num.length];
        for (int i = 0; i < num.length; i++) {
            absolutos[i] = Math.abs(num[i]);
        }
        return absolutos;
    }
}