package org.EstudioJava;

import java.net.SocketOption;

public class CiclosFor {

    public void imprimirdel1al10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public  void printpair(){
        for (int i = 1; i <= 19; i++) {
            if (i % 2 == 0){
                System.out.println("el numero: " + i + " es par");
            }
        }
    }

    public  void printodd(){
        for (int i = 1; i <= 19; i++) {
            if (i % 2 != 0){
                System.out.println("el numero: " + i + " es impar");
            }
        }
    }

    public void printmult5(){
        for (int i = 1; i <= 10; i++) {
            int r = 5 * i;
            System.out.println("5 x " + i + " = " + r);
        }
    }

    public void squarenum(){
        for (int i = 1; i <= 10; i++) {
            int numsq = i * i;
            System.out.println("Numero: " + i + " al cuadrado es: " + numsq);
        }
    }

    public void numdoble(){
        for (int i = 1; i <= 10; i++) {
            int doble = i + i;
            System.out.println(i + ": su doble es  " + doble);
        }
    }

    public void prinnum10(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Numero: " + i);
        }
    }

    public void prinsumnum10(){
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
}
