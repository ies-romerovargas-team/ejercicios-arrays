package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean continuar = true;
        while(continuar) {
            System.out.println();
            System.out.println("MENÚ EJERCICIOS DE ARRAYS (II)");
            System.out.print("11. rellenaEnOrden");
            System.out.print("\t 12. rellenaEnOrdenDesc");
            System.out.print("\t 13. rellenaAleatorio");
            System.out.println("\t 14. estaOrdenado");
            System.out.print("15. numeroImpares");
            System.out.print("\t 16. minArray");
            System.out.print("\t\t\t 17. maxArray");
            System.out.println("\t\t\t 18. numeroAprobados");
            System.out.print("19. porEncimaDe");
            System.out.println("\t\t 20. cuantosCeros");
            System.out.println("0. Finalizar");
            System.out.print("Indique opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    continuar = false;
                    break;
                case 11:
                {
                    int[] a;
                    a = new int[8];
                    escribeArray(a);
                    rellenaEnOrden(a);
                    escribeArray(a);
                }
                break;
                case 12:
                {
                    int[] a;
                    a = new int[5];
                    escribeArray(a);
                    rellenaEnOrdenDesc(a);
                    escribeArray(a);
                }
                break;
                case 13:
                {
                    int[] a;
                    a = new int[5];
                    escribeArray(a);
                    rellenaAleatorio(a);
                    escribeArray(a);
                }
                break;
                case 14:
                {
                    int[] a;
                    a = new int[5];
                    rellenaAleatorio2(a, 5, 15);
                    escribeArray(a);
                    if(estaOrdenado(a))
                    {
                        System.out.println("Ordenado");
                    }
                    else
                    {
                        System.out.println("No ordenado");
                    }
                }
                break;
                case 15:
                {
                    int[] a;
                    a = new int[8];
                    rellenaAleatorio(a);
                    escribeArray(a);
                    System.out.print("Número de elementos impares: ");
                    System.out.println(numerosImpares(a));
                }
                break;
                case 16:
                {
                    int[] a;
                    a = new int[8];
                    rellenaAleatorio(a);
                    escribeArray(a);
                    System.out.print("Elemento mas pequeño: ");
                    System.out.println(minArray(a));
                }
                break;
                case 17:
                {
                    int[] a;
                    a = new int[8];
                    rellenaAleatorio(a);
                    escribeArray(a);
                    System.out.print("Elemento mas grande: ");
                    System.out.println(maxArray(a));
                }
                break;
                case 18:
                {
                    int[] a;
                    a = new int[8];
                    rellenaAleatorio(a);
                    escribeArray(a);
                    System.out.print("Número de aprobados: ");
                    System.out.println(numeroAprobados(a));
                }
                break;
                case 19:
                {
                    System.out.print("Indique un valor límite: ");
                    int l = sc.nextInt();
                    int[] a;
                    a = new int[8];
                    rellenaAleatorio(a);
                    escribeArray(a);
                    System.out.print("Número de elementos mayor que " + l + ": ");
                    System.out.println(numeroAprobados(a));
                }
                break;
                case 20:
                {
                    int[] a;
                    a = new int[8];
                    rellenaAleatorio2(a, 0, 15);
                    escribeArray(a);
                    System.out.print("Número de 'ceros': ");
                    System.out.println(cuantosCeros(a));
                }
                break;
                default: {
                    // opcion no válida
                }
            }
        }
    }

    public static int cuantosCeros(int[] a)
    {
        int cont = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 0 ){
                cont++;
            }
        }
        return cont;
    }

    public static int porEncimaDe(int[] a, int lim)
    {
        int encima = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] >= lim ){
                encima++;
            }
        }
        return encima;
    }

    public static int numeroAprobados(int[] a)
    {
        int aprobados = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] >= 5 ){
                aprobados++;
            }
        }
        return aprobados;
    }

    public static int maxArray(int[] a)
    {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i] > max ){
                max = a[i];
            }
        }
        return max;
    }

    public static int minArray(int[] a)
    {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i] < min ){
                min = a[i];
            }
        }
        return min;
    }

    public static int numerosImpares(int[] a)
    {
        int impares = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 != 0){
                impares++;
            }
        }
        return impares;
    }

    public static boolean estaOrdenado(int[] a)
    {
        int b = a[0];
        boolean orden = true;
        for (int i = 1; i < a.length; i++) {
            if(b > a[i]){
                orden = false;
            }
        }
        return orden;
    }

    public static void rellenaAleatorio(int[] a)
    {
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(10) + 1;
        }

    }

    public static void rellenaEnOrdenDesc(int[] a)
    {
        for (int i = a.length - 1; i >= 0; i--) {
            a[i] = a.length - i;
        }
    }

    public static void rellenaEnOrden(int[] a)
    {
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
    }

    public static void escribeArray(int[] a)
    {
        int i;
        System.out.print("[");
        for(i = 0; i < a.length - 1; i++)
        {
            System.out.print(a[i]);
            System.out.print(", ");
        }
        System.out.print(a[a.length-1]);
        System.out.println("]");
    }

    public static void rellenaAleatorio2(int[] a, int min, int max)
    {
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(max) + min;
        }

    }
}