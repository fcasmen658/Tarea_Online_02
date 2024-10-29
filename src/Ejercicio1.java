/*
Ejercicio 1. Implementa un programa en Java que pida un número de al menos dos cifras y muestre los números mágicos
que existen entre 1 y el número introducido (ambos inclusive). Se dice que tres números (a, b, c) son mágicos, si se
cumple que a2 + b2 = c2.

Criterios de Evaluación: 3e, 3f.
 */

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio1 {

    public static void main(String[] args) {
        // Pedimos un número de al menos dos cifras al usuario.
        int numero = 0;
        while (numero <= 9) { // Verificamos que el número introducido por el usuario sea de al menos dos cifras.
            System.out.print("Introduce un número con al menos dos cifras: ");
            numero = Entrada.entero();
        }

        // Buscamos los Números Mágicos entre 1 y el número introducido por el usuario.
        System.out.println("Los números mágicos menores que " + numero + " son los siguientes:");

        // Bucle 'for' sobre cada triple (a, b, c) y verificamos si es mágico, si lo es, se muestra.
        for (int a = 1; a <= numero; a++) {
            for (int b = a; b <= numero; b++) {
                for (int c = 1; c <= numero; c++) {
                    if (a * a + b * b == c * c) {
                        System.out.println("(" + a + ", " + b + ", " + c + ")");
                    }
                }
            }
        }
    }
}