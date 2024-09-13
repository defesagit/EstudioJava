package org.EstudioJava;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // ----------------------------------------------------------------
        System.out.println("Ejercicio 1");
        //Creo la instancia
        CiclosFor printnum = new CiclosFor();

        //llamo el metodo de la clase imprimir del 1 al 10
        printnum.imprimirdel1al10();

        // ----------------------------------------------------------------
        System.out.println();
        System.out.println("Ejercicio 2");
        //Creo instancia
        CiclosFor printpair = new CiclosFor();

        //call method print pair
        printpair.printpair();
        // ----------------------------------------------------------------
        System.out.println();
        System.out.println("Ejercicio 3");
        //Creo instancia
        CiclosFor printodd = new CiclosFor();
        //call method print pair
        printodd.printodd();

        // ----------------------------------------------------------------
        System.out.println();
        System.out.println("Ejercicio 4");
        //Creo instancia
        CiclosFor prinrestabla = new CiclosFor();
        //call method print pair
        prinrestabla.printmult5();
        // ----------------------------------------------------------------
        System.out.println();
        System.out.println("Ejercicio 5");
        //Creo instancia
        CiclosFor numsq = new CiclosFor();
        //call method print pair
        numsq.squarenum();
        // ----------------------------------------------------------------
        System.out.println();
        System.out.println("Ejercicio 6");
        //Creo instancia
        CiclosFor numdoble = new CiclosFor();
        //call method print pair
        numdoble.numdoble();
        // ----------------------------------------------------------------
        System.out.println();
        System.out.println("Ejercicio 7");
        //Creo instancia
        CiclosFor num = new CiclosFor();
        //call method print pair
        num.prinnum10();
        // ----------------------------------------------------------------
        System.out.println();
        System.out.println("Ejercicio 8");
        //Creo instancia
        CiclosFor psumnum = new CiclosFor();
        //call method print pair
        num.printcharacter();
        // ----------------------------------------------------------------
        System.out.println();
        System.out.println("Ejercicio 9");
        //Creo instancia
        CiclosFor parray = new CiclosFor();
        //call method print pair
        parray.printarray();
        // ----------------------------------------------------------------
        System.out.println();
        System.out.println("Ejercicio 10");

        //Creo instancia
        CiclosFor psumarray = new CiclosFor();
        //call method print pair
        psumarray.printsumarray();
        // ----------------------------------------------------------------
        System.out.println();
        System.out.println("Ejercicio 11");

        //Creo instancia
        CiclosFor pmayarray = new CiclosFor();
        //call method print pair
        pmayarray.printmayarray();

        // ----------------------------------------------------------------
        System.out.println();
        System.out.println("Ejercicio 12");

        //Creo instancia
        CiclosFor pmayor10 = new CiclosFor();
        //call method print pair
        pmayor10.printarraycountmayor10();

        // ----------------------------------------------------------------
        System.out.println();
        System.out.println("Ejercicio 13");

        //Creo instancia
        CiclosFor pmult3 = new CiclosFor();
        //call method print pair
        pmult3.printarraymult3();

        // ----------------------------------------------------------------
        System.out.println();
        System.out.println("Ejercicio 13");

        //Creo instancia
        CiclosFor parrayrevert = new CiclosFor();
        //call method print pair
        parrayrevert.revertarray();
    }
}