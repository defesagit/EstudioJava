package org.EstudioJava;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("\n--- Ingrese el numero de ejercicio ---");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("1. Imprime los números del 10 al 1:\n" +
                            "Escribe un programa que utilice un bucle for para imprimir los números del 10 al 1 en orden descendente.");
                    //Creo la instancia
                    CiclosFor printnum = new CiclosFor();
                    //llamo el metodo de la clase imprimir del 1 al 10
                    printnum.imprimirdel1al10();
                    break;
                case 2:
                    System.out.println("2. Imprime los números pares del 2 al 20:\n" +
                            "Escribe un programa que utilice un bucle for para imprimir todos los números pares entre 2 y 20.");
                    //Creo instancia
                    CiclosFor printpair = new CiclosFor();
                    //call method print pair
                    printpair.printpair();
                    break;

                case 3:
                    System.out.println("3. Imprime los números impares del 1 al 19:\n" +
                            "Escribe un programa que utilice un bucle for para imprimir todos los números impares entre 1 y 19.");
                    //Creo instancia
                    CiclosFor printodd = new CiclosFor();
                    //call method print pair
                    printodd.printodd();
                    break;
                case 4:
                    System.out.println("4. Imprime la tabla de multiplicar del 5:\n" +
                            "Escribe un programa que utilice un bucle for para imprimir la tabla de multiplicar del 5, desde 5x1 hasta 5x10.");
                    //Creo instancia
                    CiclosFor prinrestabla = new CiclosFor();
                    //call method print pair
                    prinrestabla.printmult5();
                    break;
                case 5:
                    System.out.println("5. Imprime los primeros 10 números cuadrados:\n" +
                            "Escribe un programa que utilice un bucle for para imprimir los primeros 10 números elevados al cuadrado (1², 2², 3², ...).");
                    //Creo instancia
                    CiclosFor numsq = new CiclosFor();
                    //call method print pair
                    numsq.squarenum();
                    break;
                case 6:
                    System.out.println("6. Imprime los números del 1 al 10 y su doble:\n" +
                            "Escribe un programa que utilice un bucle for para imprimir los números del 1 al 10 junto con su doble (por ejemplo: \"1 - 2\", \"2 - 4\", ...).");
                    //Creo instancia
                    CiclosFor numdoble = new CiclosFor();
                    //call method print pair
                    numdoble.numdoble();
                    break;
                case 7:
                    System.out.println("7. Imprime los primeros 10 números en forma de lista:\n" +
                            "Escribe un programa que utilice un bucle for para imprimir los primeros 10 números, cada uno en una línea diferente, con el formato: \"Número: X\".");
                    //Creo instancia
                    CiclosFor num = new CiclosFor();
                    //call method print pair
                    num.prinnum10();
                    break;
                case 8:
                    System.out.println("8. Suma de los primeros 10 números:\n" +
                            "Escribe un programa que utilice un bucle for para calcular la suma de los primeros 10 números enteros (1+2+3+...+10).");
                    //Creo instancia
                    CiclosFor eje8prinnum10 = new CiclosFor();
                    //call method print pair
                    eje8prinnum10.prinsumnum10();
                    break;
                case 9:
                    System.out.println("9. Imprime una secuencia de asteriscos:\n" +
                            "Escribe un programa que utilice un bucle for para imprimir 10 asteriscos en una sola línea (**********).");
                    //Creo instancia
                    CiclosFor psumnum = new CiclosFor();
                    //call method print pair
                    psumnum.printcharacter();
                    break;
                case 10:
                    System.out.println();
                    System.out.println("10. Imprime los elementos de un array:\n" +
                            "Escribe un programa que utilice un bucle for para imprimir todos los elementos de un array de números, uno por línea.");
                    //Creo instancia
                    CiclosFor parray = new CiclosFor();
                    //call method print pair
                    parray.printarray();
                    break;
                case 11:
                    System.out.println("11. Suma de los elementos de un array:\n" +
                            "Escribe un programa que utilice un bucle for para calcular la suma de todos los elementos en un array de números.");
                    //Creo instancia
                    CiclosFor psumarray = new CiclosFor();
                    //call method print pair
                    psumarray.printsumarray();
                    break;
                case 12:
                    System.out.println("12. Encuentra el número más grande en un array:\n" +
                            "Escribe un programa que utilice un bucle for para encontrar y mostrar el número más grande en un array de números.");
                    //Creo instancia
                    CiclosFor pmayarray = new CiclosFor();
                    //call method print pair
                    pmayarray.printmayarray();
                    break;
                case 13:
                    System.out.println("13. Cuenta cuántos números son mayores que 10 en un array:\n" +
                            "Escribe un programa que utilice un bucle for para contar cuántos números en un array son mayores que 10.");
                    //Creo instancia
                    CiclosFor pmayor10 = new CiclosFor();
                    //call method print pair
                    pmayor10.printarraycountmayor10();
                    break;
                case 14:
                    System.out.println("14. Imprime los números del 1 al 100, pero solo los múltiplos de 3:\n" +
                            "Escribe un programa que utilice un bucle for para imprimir solo los números entre 1 y 100 que sean múltiplos de 3.");
                    //Creo instancia
                    CiclosFor pmult3 = new CiclosFor();
                    //call method print pair
                    pmult3.printarraymult3();
                    break;
                case 15:
                    System.out.println("15. Reversa los elementos de un array:\n" +
                            "Escribe un programa que utilice un bucle for para imprimir los elementos de un array en orden inverso.");
                    //Creo instancia
                    CiclosFor parrayrevert = new CiclosFor();
                    //call method print pair
                    parrayrevert.revertarray();
                case 16:
                    System.out.println("16. Imprime los primeros 10 números Fibonacci:\n" +
                            "Escribe un programa que utilice un bucle for para imprimir los primeros 10 números de la secuencia de Fibonacci.");
                    //Creo instancia
                    CiclosFor eje16 = new CiclosFor();
                    //call method print pair
                    eje16.eje16Fibonacci();
                    break;
                case 17:
                    System.out.println("17. Imprime las letras de una palabra:\n" +
                            "Escribe un programa que utilice un bucle for para imprimir cada letra de una palabra (string) en una línea diferente.");
                    //Creo instancia
                    CiclosFor eje17 = new CiclosFor();
                    //call method print pair
                    eje17.eje17PrintLetter();
                    break;
                case 18:
                    System.out.println("18. Convierte todos los elementos de un array a mayúsculas:\n" +
                            "Escribe un programa que utilice un bucle for para recorrer un array de strings y convertir cada elemento a mayúsculas.");
                    //Creo instancia
                    CiclosFor eje18 = new CiclosFor();
                    //call method print pair
                    eje18.eje18ConvertMayus();
                    break;
                case 19:
                    System.out.println("19. Crea un patrón de pirámide con asteriscos:\n" +
                            "Escribe un programa que utilice un bucle for para crear una pirámide de asteriscos como la siguiente:\n" +
                            "*\n" +
                            "**\n" +
                            "***\n" +
                            "****\n" +
                            "*****");
                    //Creo instancia
                    CiclosFor eje19 = new CiclosFor();
                    //call method print pair
                    eje19.eje19PiramAst();
                    break;
                case 20:
                    System.out.println("20. Verifica si un array contiene un número específico:\n" +
                            "Escribe un programa que utilice un bucle for para verificar si un array \n" +
                            "contiene un número específico. Si el número está presente, imprime \\n\" + " +
                            "\"Encontrado\"; de lo contrario, imprime \"No encontrado\".");
                    //Creo instancia
                    CiclosFor eje20 = new CiclosFor();
                    //call method print pair
                    eje20.eje20SearchNumArray();
                    break;
                case 21:
                    System.out.println("21. Imprime los elementos en posiciones impares de un array:\n" +
                            "Escribe un programa que utilice un bucle for para imprimir los \\n\" + " +
                            "elementos que están en posiciones impares de un array.");
                    //Creo instancia
                    CiclosFor eje21 = new CiclosFor();
                    //call method print pair
                    eje21.eje21PosImpar();
                    break;
                case 22:
                    System.out.println("22. Calcula el promedio de un array de números:\n" +
                            "Escribe un programa que utilice un bucle for para calcular el promedio de todos los números en un array.");
                    //Creo instancia
                    CiclosFor eje22 = new CiclosFor();
                    //call method print pair
                    eje22.eje22Promedio();
                    break;
                case 23:
                    System.out.println("23. Cuenta cuántos elementos en un array son strings:\n" +
                            "Escribe un programa que utilice un bucle for para contar cuántos elementos en un array son de tipo string.");
                    //Creo instancia
                    CiclosFor eje23 = new CiclosFor();
                    //call method print pair
                    eje23.eje23ContString();
                    break;
                case 24:
                    System.out.println("24. Concatena todos los elementos de un array en un solo string:\n" +
                            "Escribe un programa que utilice un bucle for para concatenar todos los elementos de un array en un solo string, separado por comas.");
                    //Creo instancia
                    CiclosFor eje24 = new CiclosFor();
                    //call method print pair
                    eje24.eje24ConcatenarArreglo();
                    break;
                case 25:
                    System.out.println("25. Crea un patrón de pirámide invertida con asteriscos:\n" +
                            "Escribe un programa que utilice un bucle for para crear una pirámide invertida de asteriscos como la siguiente:\n" +
                            "\n" +
                            "*****\n" +
                            "****\n" +
                            "***\n" +
                            "**\n" +
                            "*");
                    //Creo instancia
                    CiclosFor eje25 = new CiclosFor();
                    //call method print pair
                    eje25.eje25PiramideInvert();
                    break;
                case 26:
                    System.out.println("26. Convierte un array de strings a un array de números:\n" +
                            "Escribe un programa que utilice un bucle for para convertir un array \\n\" +" +
                            "de strings que representan números (por ejemplo, [\"1\", \"2\", \"3\"]) \\n\" +" +
                            "en un array de números (por ejemplo, [1, 2, 3]).");
                    //Creo instancia
                    CiclosFor eje26 = new CiclosFor();
                    //call method print pair
                    eje26.eje26ConvertArrayString();
                    break;
                case 27:
                    System.out.println("27. Filtra los números mayores a 50 en un array:\n" +
                            "Escribe un programa que utilice un bucle for para filtrar \\n\" +" +
                            "todos los números mayores a 50 de un array y los almacene en un nuevo array.");
                    //Creo instancia
                    CiclosFor eje27 = new CiclosFor();
                    //call method print pair
                    eje27.eje27FiltroMayorCincuenta();
                    break;
                case 28:
                    System.out.println("28. Ordena un array de números de menor a mayor:\n" +
                            "Escribe un programa que utilice un bucle for (sin utilizar \\n\" +" +
                            "métodos de ordenación integrados) para ordenar un array de números de menor a mayor.");
                    //Creo instancia
                    CiclosFor eje28 = new CiclosFor();
                    //call method print pair
                    eje28.eje28OrdenArray();
                    break;
                case 29:
                    System.out.println("29. Imprime la matriz transpuesta de una matriz 2D:\n" +
                            "Escribe un programa que utilice un bucle for para imprimir la matriz transpuesta de una matriz 2D (array de arrays).\n" +
                            "// Matriz 2D de entrada\n" +
                            "let matriz = [\n" +
                            "  [1, 2, 3],\n" +
                            "  [4, 5, 6],\n" +
                            "  [7, 8, 9]\n" +
                            "];\n" +
                            "//Matriz Transpuesta:\n" +
                            "1 4 7\n" +
                            "2 5 8\n" +
                            "3 6 9");
                    //Creo instancia
                    CiclosFor eje29 = new CiclosFor();
                    //call method print pair
                    eje29.eje29Matriz();
                    break;
                case 30:
                    System.out.println("30. Verifica si un array es palíndromo:\n" +
                            "Escribe un programa que utilice un bucle for para \\n\" +" +
                            "verificar si un array de números o letras es un \\n\" +" +
                            "palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda).");
                    //Creo instancia
                    CiclosFor eje30 = new CiclosFor();
                    //call method print pair
                    eje30.eje30Palindromo();
                    break;
                default:
                    System.out.println("Opcion no valida");

            }
        }

    }
}