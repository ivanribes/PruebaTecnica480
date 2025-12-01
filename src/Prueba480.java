import java.util.Arrays;
import java.util.Scanner;

public class Prueba480 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

//Declaramos las variables
        int numeroAsignaturas;
        double notaMedia;
        int suspensos = 0;

        System.out.println("[MINI CALCULADORA DE NOTAS]");

//region Pedir numero de asignaturas

        System.out.print("¿Cuantas asignaturas tienes?: ");
        numeroAsignaturas = key.nextInt();

        //Mensaje de error y nueva petición de nº de asignaturas
        while (numeroAsignaturas < 1 || numeroAsignaturas > 10) {
            System.out.print("El numero de asignaturas no es valido." +
                    "\nPor favor introduce un numero entre 1 y 10: ");
            numeroAsignaturas = key.nextInt();
        }

//endregion


//region Lectura de notas

        //Declaramos el tamaño del array una vez conocemos el nº de asignaturas.
        double[] notas = new double[numeroAsignaturas];

        for (int i = 0; i < numeroAsignaturas; i++) {
            System.out.print("Introduce la " + (i+1) + "ª nota: ");
                notas[i] = key.nextDouble();

                //Mensaje de advertencia y petición de una nueva nota
                while (notas[i] < 0 || notas[i] > 10) {
                    System.out.print("Nota no valida. La nota debe estar entre 0 y 10: ");
                    notas[i] = key.nextDouble();
                }
        }
//endregion


//region Calculo y salida de datos

        //Lectura del array notas
        System.out.println("Estas son tus notas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + ", ");
        }

        //Calculo de la nota media
        notaMedia = Arrays.stream(notas).average().getAsDouble();
        System.out.printf("\nTu nota media es de: %.2f", notaMedia);

        //Filtramos los valores menores que 5 en el array notas para calcular suspensos
        suspensos = (int)Arrays.stream(notas).filter(n -> n < 5).count();
        System.out.println("\nAsignaturas suspensas: " + suspensos);

        //Condición para aprobar
        if (notaMedia >= 5 && suspensos <= 1) {
            System.out.println("Resultado final: APROBADO");
        } else {
            System.out.println("Resultado final: SUSPENSO");
        }

//endregion

    }
}
