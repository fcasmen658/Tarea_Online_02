/*
Ejercicio 2.
Un número Al-Ándalus es un número entero que es divisible entre la suma de sus dígitos.
Por ejemplo, 2024 es un número Al-Ándalus ya que 2+0+2+4=8 y 2024 es divisible entre 8.
Además, 2024 es un número Navideño, ya que la suma de sus divisores es mayor que él mismo:
1+2+4+8+11+22+23+44+46+88+92+184+253+506+1012=2296>2024.

Implementa un programa en Java que dados dos números positivos introducidos por teclado por el usuario, determine
cuantos números Al-Ándalus y Navideños hay entre ellos y cuáles son. Además, deberá indicar si en el intervalo indicado
hay más números Al-Ándalus o más números Navideños.

Criterios de Evaluación: 3e, 3f.
*/

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Variables
        int inicio;
        int fin;
        int contadorAlAndalus = 0;
        int contadorNavidenos = 0;


        // Pedimos al usuario dos números positivos.
        do {
            System.out.print("Introduce un número positivo: ");
            inicio = Entrada.entero();
        }while (inicio <= 0); //Y comprobamos que lo son.

        do {
            System.out.print("Introduce el segundo número positivo: ");
            fin = Entrada.entero(); //Y comprobamos que lo son.
        }while (fin <= 0);

        // Nos aseguramos de que el número inicial sea menor que el número final.
        if (inicio > fin) {
            int temp = inicio;
            inicio = fin;
            fin = temp;
        }

        for (int i = inicio; i <= fin; i++) {
            int sumaDigitos = 0;
            int digitoTemporal = i;
            //Separamos los dígitos del número y los sumamos.
            while (digitoTemporal > 0) {
                sumaDigitos += digitoTemporal % 10;
                digitoTemporal /= 10;
            }

            // Comprobamos si es un número Al-Ándalus.
            if (i % sumaDigitos == 0) {
                System.out.println("El número " + i + " es un número Al-Ándalus.");
                contadorAlAndalus++;
            }

            // Comprobar si es un número Navideño.
            int sumaDivisores = 0;
            for (int j = 1; j <= i/2; j++) {
                if (i % j == 0) {
                    sumaDivisores += j; // Sumar el divisor
                }
            }

            if (sumaDivisores > i) {
                System.out.println("El número " + i + " es un número Navideño.");
                contadorNavidenos++;
            }
        }


        // Resultado final
        System.out.println("Total de números Al-Ándalus: " + contadorAlAndalus);
        System.out.println("Total de números Navideños: " + contadorNavidenos);

        if (contadorAlAndalus > contadorNavidenos) {
            System.out.println("Hay más números Al-Ándalus.");
        } else if (contadorNavidenos > contadorAlAndalus) {
            System.out.println("Hay más números Navideños.");
        } else {
            System.out.println("Hay la misma cantidad de números Al-Ándalus y Navideños.");
        }
    }
}