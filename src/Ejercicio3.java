/*
Ejercicio 3.
Implementa un programa en Java que simule la evaluación criterial del módulo de programación de una serie de alumnos,
debiendo indicar el número de alumnos aprobados y el número de alumnos suspensos en función de las calificaciones
obtenidas en cada uno de los criterios de evaluación.
Para ello se considerará que solo existen 2 Resultados de Aprendizaje y 3 Criterios de Evaluación por Resultado de
Aprendizaje. Además, el programa deberá pedir los porcentajes asociados a cada Resultado de Aprendizaje y los
porcentajes asociados a cada Criterio de Evaluación, debiendo tener en cuenta los siguientes aspectos:
La suma de los porcentajes de los Resultados de Aprendizaje no debe superar el 100%.
La suma de los porcentajes de los criterios de evaluación no debe superar el porcentaje que tenga el Resultado de
Aprendizaje al que están asociados dichos criterios de evaluación.

Se considera que un alumno/a está aprobado/a si la suma ponderada de las calificaciones de cada uno de los criterios de
evaluación es mayor o igual a 5. En otro caso, se considerará que está suspenso.
Además, el programa deberá indicar si hay más aprobados que suspensos o viceversa y deberá pedir el número de alumnos/as
que se quieren calificar.

Criterios de Evaluación: 3e, 3f.
*/

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio3 {
    public static void main(String[] args) {

        // Variables
        double ResultadoAprendizaje1;
        double ResultadoAprendizaje2;
        double porcentajeCE1RA1, porcentajeCE2RA1, porcentajeCE3RA1;
        double porcentajeCE1RA2, porcentajeCE2RA2, porcentajeCE3RA2;
        double notaCE1RA1, notaCE2RA1, notaCE3RA1;
        double notaCE1RA2, notaCE2RA2, notaCE3RA2;
        int numAlumnos;
        double notaResultadoAprendizaje1, notaResultadoAprendizaje2;
        double notaFinal;

        //Constantes
        final int PORCENTAJE = 100;

        //Contadores
        int aprobados = 0;
        int suspensos = 0;

        do {
            System.out.println("\n Porcentajes asociados a los Resultados de Aprendizaje. La suma de ambos no debe ser distinta al " + PORCENTAJE + "%.");
            System.out.println("=======================================================================================================\n");

            do {
                System.out.print("Introduzca el porcentaje asociado al Resultado de Aprendizaje 1 (RA1): ");
                ResultadoAprendizaje1 = Entrada.realDoble();
                System.out.print(" \n");
            }while (ResultadoAprendizaje1 <= 0 | ResultadoAprendizaje1 >= PORCENTAJE);

            do {
                System.out.print("Introduzca el porcentaje asociado al Resultado de Aprendizaje 2 (RA2): ");
                ResultadoAprendizaje2 = Entrada.realDoble();
            }while (ResultadoAprendizaje2 <= 0 | ResultadoAprendizaje2 >= PORCENTAJE);

            if (ResultadoAprendizaje1 + ResultadoAprendizaje2 > PORCENTAJE) {
                System.out.println("La suma de los porcentajes asociados a los RA superan el " + PORCENTAJE + "%. Debe introducir de nuevo los porcentajes de cada RA.\n");
            } else if (ResultadoAprendizaje1 + ResultadoAprendizaje2 < PORCENTAJE) {
                System.out.println("La suma de los porcentajes asociados a los RA es inferior al " + PORCENTAJE + "%. Debe introducir de nuevo los porcentajes de cada RA.\n");
            }
        }while((ResultadoAprendizaje1 + ResultadoAprendizaje2) != PORCENTAJE);

        System.out.println(" \n");
        System.out.println("=====================================================================================");
        System.out.println("Porcentajes asociados a los Criterios de Evaluación del Resultado de Aprendizaje 1");
        System.out.println("=====================================================================================\n");

        do {
            System.out.print("Introduzca el porcentaje asociado al Criterio de Evaluación 1 (RA1): ");
            porcentajeCE1RA1 = Entrada.realDoble();
            System.out.println(" \n");
            System.out.print("Introduzca el porcentaje asociado al Criterio de Evaluación 2 (RA1): ");
            porcentajeCE2RA1 = Entrada.realDoble();
            System.out.println(" \n");
            System.out.print("Introduzca el porcentaje asociado al Criterio de Evaluación 3 (RA1): ");
            porcentajeCE3RA1 = Entrada.realDoble();

            if (porcentajeCE1RA1 + porcentajeCE2RA1 + porcentajeCE3RA1 != ResultadoAprendizaje1) {
                System.out.println("La suma de los porcentajes de los criterios de evaluación del RA1 no es igual a " + ResultadoAprendizaje1 + ". Debe introducir de nuevo los porcentajes de cada Criterio de Evaluación del RA1\n");
            }
        }while (porcentajeCE1RA1 + porcentajeCE2RA1 + porcentajeCE3RA1 != ResultadoAprendizaje1);

        System.out.println(" \n");
        System.out.println("=====================================================================================");
        System.out.println("Porcentajes asociados a los Criterios de Evaluación del Resultado de Aprendizaje 2");
        System.out.println("=====================================================================================\n");

        do {
            System.out.print("Introduzca el porcentaje asociado al Criterio de Evaluación 1 (RA2): ");
            porcentajeCE1RA2 = Entrada.realDoble();
            System.out.println(" \n");
            System.out.print("Introduzca el porcentaje asociado al Criterio de Evaluación 2 (RA2): ");
            porcentajeCE2RA2 = Entrada.realDoble();
            System.out.println(" \n");
            System.out.print("Introduzca el porcentaje asociado al Criterio de Evaluación 3 (RA2): ");
            porcentajeCE3RA2 = Entrada.realDoble();

            if (porcentajeCE1RA2 + porcentajeCE2RA2 + porcentajeCE3RA2 != ResultadoAprendizaje2) {
                System.out.println("La suma de los porcentajes de los criterios de evaluación del RA2 no es igual a " + ResultadoAprendizaje2 + ". Debe introducir de nuevo los porcentajes de cada Criterio de Evaluación del RA2");
            }

        }while (porcentajeCE1RA2 + porcentajeCE2RA2 + porcentajeCE3RA2 != ResultadoAprendizaje2);

        System.out.println("\n");
        System.out.print("Introduzca el número de alumnos/as a evaluar: ");
        numAlumnos = Entrada.entero();

        for (int i = 1; i <= numAlumnos; i++) {

            System.out.println(" \n");
            System.out.println("=====================================================================================");
            System.out.println(" Calificaciones obtenidas por el alumno/a " + i + ": ");
            System.out.println("=====================================================================================");

            do {
                System.out.print("Introduzca la calificación obtenida para el Criterio de Evaluación 1 del Resultado de Aprendizaje 1: ");
                notaCE1RA1 = Entrada.realDoble();
            } while (notaCE1RA1 > 10 || notaCE1RA1 < 0);

            do {
                System.out.print("Introduzca la calificación obtenida para el Criterio de Evaluación 2 del Resultado de Aprendizaje 1: ");
                notaCE2RA1 = Entrada.realDoble();
            } while (notaCE2RA1 > 10 || notaCE2RA1 < 0);
            do {
                System.out.print("Introduzca la calificación obtenida para el Criterio de Evaluación 3 del Resultado de Aprendizaje 1: ");
                notaCE3RA1 = Entrada.realDoble();
            } while (notaCE3RA1 > 10 || notaCE3RA1 < 0);
            do {
                System.out.print("Introduzca la calificación obtenida para el Criterio de Evaluación 1 del Resultado de Aprendizaje 2: ");
                notaCE1RA2 = Entrada.realDoble();
            } while (notaCE1RA2 > 10 || notaCE1RA2 < 0);
            do {
                System.out.print("Introduzca la calificación obtenida para el Criterio de Evaluación 2 del Resultado de Aprendizaje 2: ");
                notaCE2RA2 = Entrada.realDoble();
            } while (notaCE2RA2 > 10 || notaCE2RA2 < 0);
            do {
                System.out.print("Introduzca la calificación obtenida para el Criterio de Evaluación 3 del Resultado de Aprendizaje 2: ");
                notaCE3RA2 = Entrada.realDoble();
            } while (notaCE3RA2 > 10 || notaCE3RA2 < 0);

            //Calculamos la nota media
            notaResultadoAprendizaje1 = ((notaCE1RA1 * porcentajeCE1RA1 + notaCE2RA1 * porcentajeCE2RA1 + notaCE3RA1 * porcentajeCE3RA1)/ResultadoAprendizaje1);
            notaResultadoAprendizaje2 = ((notaCE1RA2 * porcentajeCE1RA2 + notaCE2RA2 * porcentajeCE2RA2 + notaCE3RA2 * porcentajeCE3RA2)/ResultadoAprendizaje2);
            notaFinal = (notaResultadoAprendizaje1 * (ResultadoAprendizaje1 / PORCENTAJE)) + (notaResultadoAprendizaje2 * (ResultadoAprendizaje2 / PORCENTAJE));

            //Comprobación y contadores de aprobados y suspensos
            if (notaFinal >= 5){
                aprobados++;
            }else{
                suspensos++;
            }

            System.out.println(" \n");
            System.out.println("Resumen calificaciones obtenidas por alumno/a 1:");
            System.out.println("Resultado de Aprendizaje 1 - Criterio de Evaluación 1: " + notaCE1RA1);
            System.out.println("Resultado de Aprendizaje 1 - Criterio de Evaluación 2: " + notaCE2RA1);
            System.out.println("Resultado de Aprendizaje 1 - Criterio de Evaluación 3: " + notaCE3RA1);
            System.out.println("Resultado de Aprendizaje 2 - Criterio de Evaluación 1: " + notaCE1RA2);
            System.out.println("Resultado de Aprendizaje 2 - Criterio de Evaluación 2: " + notaCE2RA2);
            System.out.println("Resultado de Aprendizaje 2 - Criterio de Evaluación 3: " + notaCE3RA2 + "\n");

            System.out.println("La calificación \033[1m\033[34mfinal\033[0m\033[0m obtenida para alumno/a " + "\033[35m" + i + "\033[0m" + " es: " + "\033[35m" + ((notaFinal*100)/100) + "\033[0m");
        }

        System.out.println(" \n");
        System.out.println("=====================================================================================");
        System.out.println("Estadística \033[1m\033[34mfinal\033[0m\033[0m del alumnado");
        System.out.println("=====================================================================================");
        System.out.println("El total de alumnos/as aprobados son: " + "\033[35m" + aprobados + "\033[0m");
        System.out.println("El total de alumnos/as aprobados son: " + "\033[35m" + suspensos + "\033[0m");

        if (aprobados > suspensos){
            System.out.println("Por tanto, hay mayor número de aprobados que de suspensos.");
        }else if(suspensos > aprobados){
            System.out.println("Por tanto, hay mayor número de aprobados que de suspensos.");
        }else{
            System.out.println("Por tanto, hay igual número de alumnos aprobados que de suspensos.");
        }
    }
}