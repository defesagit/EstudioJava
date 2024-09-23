package org.EstudioJava;

import java.net.SocketOption;
import java.util.ArrayList;
import java.util.Scanner;

public class CiclosFor {

    public void imprimirdel1al10() { //eje1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public  void printpair(){//eje2
        for (int i = 1; i <= 19; i++) {
            if (i % 2 == 0){
                System.out.println("el numero: " + i + " es par");
            }
        }
    }

    public  void printodd(){//eje3
        for (int i = 1; i <= 19; i++) {
            if (i % 2 != 0){
                System.out.println("el numero: " + i + " es impar");
            }
        }
    }

    public void printmult5(){//eje4
        for (int i = 1; i <= 10; i++) {
            int r = 5 * i;
            System.out.println("5 x " + i + " = " + r);
        }
    }

    public void squarenum(){//eje5
        for (int i = 1; i <= 10; i++) {
            int numsq = i * i;
            System.out.println("Numero: " + i + " al cuadrado es: " + numsq);
        }
    }

    public void numdoble(){//eje6
        for (int i = 1; i <= 10; i++) {
            int doble = i + i;
            System.out.println(i + ": su doble es  " + doble);
        }
    }

    public void prinnum10(){//eje7
        for (int i = 1; i <= 10; i++) {
            System.out.println("Numero: " + i);
        }
    }

    public void prinsumnum10(){//eje8
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma +=i;
        }
        System.out.println("La suma de los primeros 10 numeros es: " + suma);
    }

    public void printcharacter(){
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }
    }

    public void printarray(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 10; i++) {
            System.out.println("Posicion de array: " + i + " valor: " + arr[i]);
        }
    }

    public void printsumarray(){
        int suma = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 10; i++) {
            suma+= arr[i];
        }
        System.out.println("La suma del array es: " + suma);
    }

    public void printmayarray(){
        int suma, mayor = 0;
        int[] arr = {1, 2, 3, 4, 5, 40, 7, 8, 9, 10};
        for (int i = 0; i < 10; i++) {
            System.out.println("Posicion array: " + i + " su valor es: " + arr[i]);
            if (mayor < arr[i]){
                mayor = arr[i];
            }
        }
        System.out.println("El numero mayor del array es: " + mayor);
    }

    public void printarraycountmayor10(){
        int suma, mayor10 = 0;
        int[] arr = {1, 2, 50, 4, 5, 40, 7, 8, 9, 10};
        for (int i = 0; i < 10; i++) {
            System.out.println("Posicion array: " + i + " su valor es: " + arr[i]);
            if (arr[i] > 10){
                mayor10 += 1;
            }
        }
        System.out.println("El cantidad de numeros mayores a 10 es: " + mayor10);
    }

    public void printarraymult3(){
        for (int i = 1; i < 100; i++) {
            System.out.print("Numero: " + i);
            if (i % 3 == 0){
                System.out.print(" es multiplo de 3");
            }
            System.out.println();
        }
    }

    public void revertarray(){
        int[] arr = {1, 2, 50, 4, 5, 40, 7, 8, 9, 10};
        System.out.println("Array original: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array invertido: ");
        for (int j = arr.length -1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
    }

    public void  eje16Fibonacci(){
        int n1 = 0, n2 = 1, n3;

        System.out.print(n1 + " " + n2);

        // Bucle para calcular y mostrar los siguientes 8 números
        for (int i = 2; i < 10; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            // Desplazamos los valores para el siguiente ciclo
            n1 = n2;
            n2 = n3;
        }
    }

    public void  eje17PrintLetter(){
        // Crear un objeto Scanner para leer la palabra del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una palabra
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();

        // Bucle for para recorrer la palabra y mostrar cada letra en una línea
        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(palabra.charAt(i));
        }

        // Cerrar el scanner
//        scanner.close();
    }

    public void eje18ConvertMayus(){
        String[] palabras = {"hola", "mundo", "java", "NETEC"};

        // Bucle for para recorrer el array y convertir cada elemento a mayúsculas
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = palabras[i].toUpperCase(); // Convertir a mayúsculas
        }

        // Imprimir el array con los elementos convertidos
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    public void eje19PiramAst(){
        int filas = 5; // Número de filas de la pirámide

        // Bucle for para generar la pirámide
        for (int i = 1; i <= filas; i++) {
            // En cada iteración se imprimen 'i' asteriscos
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Salto de línea después de imprimir los asteriscos de cada fila
            System.out.println();
        }
    }

    public void eje20SearchNumArray() {
        int[] numeros = {10, 20, 30, 40, 50};

        int numeroBuscado = 10;

        // Variable para controlar si el número fue encontrado
        boolean encontrado = false;

        // Bucle for para recorrer el array
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                encontrado = true;
                break; // Salir del bucle si el número es encontrado
            }
        }

        // Verificar si el número fue encontrado o no
        if (encontrado) {
            System.out.println("Numero " + numeroBuscado + ": Encontrado en el array");
        } else {
            System.out.println("No encontrado");
        }
    }
        public void eje21PosImpar(){
            int[] num21 = {10, 20, 30, 40, 50, 60, 70};

            // Bucle for para recorrer el array e imprimir solo las posiciones impares
            for (int i = 1; i < num21.length; i += 2) { // Comienza en el índice 1 y avanza de 2 en 2
                System.out.println("Elemento en la posición impar " + i + ": " + num21[i]);
            }
        }

    public void eje22Promedio(){
        int[] numeros = {10, 20, 30, 40, 50};

        // Inicializar una variable para la suma de los elementos
        int suma = 0;

        // Bucle for para sumar todos los elementos del array
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        // Calcular el promedio
        double promedio = (double) suma / numeros.length;

        // Imprimir el resultado
        System.out.println("El promedio es: " + promedio);
    }

    public void eje23ContString(){
        Object[] elementos = { "hola", 42, "mundo", 3.14, "java", true };

        // Variable para contar los elementos de tipo String
        int conteoStrings = 0;

        // Bucle for para recorrer el array y contar los elementos de tipo String
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] instanceof String) {
                conteoStrings++;
            }
        }

        // Imprimir el resultado
        System.out.println("Número de elementos de tipo String: " + conteoStrings);
    }

    public void eje24ConcatenarArreglo(){
        String[] palabras = {"Hola", "mundo", "Java", "es", "divertido"};
        String resultado = "";

        // Iteramos sobre cada elemento del arreglo
        for (int i = 0; i < palabras.length; i++) {
            // Concatenamos el elemento actual al resultado
            resultado += palabras[i];

            // Si no estamos en el último elemento, agregamos una coma
            if (i < palabras.length - 1) {
                resultado += ", ";
            }
        }

        System.out.println(resultado); // Imprimirá: Hola, mundo, Java, es, divertido
    }

    public void eje25PiramideInvert(){
        int filas = 5; // Número de filas de la pirámide

        for (int i = filas; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void eje26ConvertArrayString(){
        String[] stringArray = {"1", "2", "3", "4", "5"};

        // Crear un array de enteros del mismo tamaño
        int[] intArray = new int[stringArray.length];

        // Convertir cada string a entero utilizando un bucle for
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }

        // Imprimir el array convertido
        System.out.println("Array de números:");
        for (int num : intArray) {
            System.out.println(num);
        }
    }

    public void eje27FiltroMayorCincuenta(){
        int[] numbers = {10, 55, 23, 68, 75, 30, 90, 42, 100};

        // Crear una lista para almacenar los números mayores a 50
        ArrayList<Integer> filteredNumbers = new ArrayList<>();

        // Filtrar los números mayores a 50
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 50) {
                filteredNumbers.add(numbers[i]);
            }
        }

        // Convertir la lista filtrada a un array si es necesario
        int[] filteredArray = new int[filteredNumbers.size()];
        for (int i = 0; i < filteredNumbers.size(); i++) {
            filteredArray[i] = filteredNumbers.get(i);
        }

        // Imprimir el array filtrado
        System.out.println("Números mayores a 50:");
        for (int num : filteredArray) {
            System.out.println(num);
        }
    }

    public void eje28OrdenArray(){
        int[] numbers = {29, 10, 14, 37, 13};

        // Algoritmo de Selection Sort
        for (int i = 0; i < numbers.length - 1; i++) {
            // Encontrar el índice del número más pequeño en el subarray restante
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambiar el número más pequeño con el número en la posición actual
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }

        // Imprimir el array ordenado
        System.out.println("Array ordenado de menor a mayor:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public void eje29Matriz(){
        // Matriz 2D de entrada
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Obtener el número de filas y columnas
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Imprimir la matriz transpuesta
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                // Intercambiar filas y columnas para transponer
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
    }

    public void eje30Palindromo(){
        // Array de números o letras para verificar
        int[] array = {1, 2, 3, 2, 1};  // Puedes cambiar este array para probar otros casos

        // Variable para almacenar el resultado
        boolean esPalindromo = true;

        // Verificar si el array es palíndromo
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                esPalindromo = false;
                break;  // Si encontramos un valor diferente, podemos detener la búsqueda
            }
        }

        // Imprimir el resultado
        if (esPalindromo) {
            System.out.println("El array es un palíndromo.");
        } else {
            System.out.println("El array no es un palíndromo.");
        }
    }

}
