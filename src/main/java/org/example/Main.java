package org.example;

import clases.Calculadora;
import clases.Personaje;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // creo un objeto de la clase Personaje

        //Personaje raton=new Personaje("RATON",90,50,7,18,100);
        //Personaje pikachu=new Personaje("SUSANA",95,32,9,18,100);

        // CREAMOS UN OBJETO DE LA CLASE CALCULADORA

        Calculadora calculadora= new Calculadora();


        // MENU

        int observador = 100;

        Scanner entradaPorTeclado = new Scanner(System.in);

        System.out.println("**MENU**");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("3. Salir");

        while (observador != 5) {

            System.out.println("Digite una opcion: ");
            observador=entradaPorTeclado.nextInt();

            if (observador==1){

                System.out.println("Eligio la opcion 1");
                System.out.println("Ingrese el primer numero: ");
                calculadora.setNumero1(entradaPorTeclado.nextInt());
                System.out.println("Ingrese el segundo numero: ");
                calculadora.setNumero2(entradaPorTeclado.nextInt());


                System.out.println(calculadora.sumar());


            }else if (observador==2){

                System.out.println("Eligio la opcion 2");
                System.out.println("Ingrese el primer numero: ");
                calculadora.setNumero1(entradaPorTeclado.nextInt());
                System.out.println("Ingrese el segundo numero: ");
                calculadora.setNumero2(entradaPorTeclado.nextInt());


                System.out.println(calculadora.restar());

            } else if (observador==3){

                System.out.println("Eligio la opcion 3");
                System.out.println("Ingrese el primer numero: ");
                calculadora.setNumero1(entradaPorTeclado.nextInt());
                System.out.println("Ingrese el segundo numero: ");
                calculadora.setNumero2(entradaPorTeclado.nextInt());


                System.out.println(calculadora.multiplicar());

            }else if (observador==4) {

                System.out.println("Eligio la opcion 4");
                System.out.println("Ingrese el primer numero: ");
                calculadora.setNumero1(entradaPorTeclado.nextInt());
                System.out.println("Ingrese el segundo numero: ");
                calculadora.setNumero2(entradaPorTeclado.nextInt());


                System.out.println(calculadora.dividir());

            }else if (observador==5){

                System.out.println("Eligio la opcion 5");
                break;


            }

        }

    }

}