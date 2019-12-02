package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean continuar = true;
        while(continuar) {
            System.out.println();
            System.out.println("MENÚ EJERCICIOS DE ARRAYS (I)");
            System.out.print("1. escribeArray5");
            System.out.print("\t 2. escribeArray");
            System.out.print("\t 3. leeArray5");
            System.out.println("\t 4. leeArray");
            System.out.print("5. ponCeros5");
            System.out.print("\t\t 6. ponCeros");
            System.out.print("\t\t 7. sumaArray5");
            System.out.println("\t 8. sumaArray");
            System.out.print("9. mediaArray5");
            System.out.println("\t\t 10. mediaArray");
            System.out.println("0. Finalizar");
            System.out.print("Indique opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    continuar = false;
                    break;
                case 1:
                {
                    int[] a = {23, 43, 1, -3, 6};
                    escribeArray5(a);
                }
                break;
                case 2:
                {
                    int[] a = {23, 43, 1, -3, 6};
                    escribeArray(a);
                }
                case 3:
                {
                    int[] a;
                    a = new int[5];
                    leeArray5(a);
                    escribeArray5(a);
                }
                break;
                case 4:
                {
                    int[] a;
                    a = new int[8];
                    leeArray(a);
                    escribeArray(a);
                }
                break;
                case 5:
                {
                    int[] a = {1, 2, 3, 4, 5};
                    escribeArray(a);
                    ponCeros5(a);
                    escribeArray(a);
                }
                break;
                case 6:
                {
                    int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                    escribeArray(a);
                    ponCeros(a);
                    escribeArray(a);
                }
                break;
                case 7:
                {
                    int[] a = {5, 9, 2, -4, 3};
                    escribeArray(a);
                    System.out.println(sumaArray5(a));
                }
                break;
                case 8:
                {
                    int[] a = {5, 9, 2, -4, 3, 12, 0, 21};
                    escribeArray(a);
                    System.out.println(sumaArray(a));
                }
                break;
                case 9:
                {
                    int[] a = {5, 9, 12, 0, 21};
                    escribeArray(a);
                    System.out.println(mediaArray5(a));
                }
                break;
                case 10:
                {
                    int[] a = {5, 9, 12, 0, 21, 4, 6, 1, 0, 9};
                    escribeArray(a);
                    System.out.println(mediaArray(a));
                }
                break;
                default: {
                    // opcion no válida
                }
            }
        }
    }

    private static int mediaArray(int[] a)
    {
        int suma = 0, media = 0;
        for (int i = 0; i < a.length; i++)
        {
            suma = suma + a[i];
            media = suma / (i + 1);
        }
        return media;
    }

    private static int mediaArray5(int[] a)
    {
        int suma = 0, media = 0;
        for (int i = 0; i < 5; i++)
        {
            suma = suma + a[i];
            media = suma / (i + 1);
        }
        return media;
    }

    private static int sumaArray(int[] a)
    {
        int suma = 0;
        for (int i = 0; i < a.length; i++)
        {
            suma = suma + a[i];
        }
        return suma;
    }

    private static int sumaArray5(int[] a)
    {
        int suma = 0;
        for (int i = 0; i < 5; i++)
        {
            suma = suma + a[i];
        }
        return suma;
    }

    private static void ponCeros(int[] a)
    {
        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
        }
    }

    private static void ponCeros5(int[] a)
    {
        for (int i = 0; i < 5; i++) {
            a[i] = 0;
        }
    }

    private static void leeArray(int[] a)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        for (i = 0; i < a.length; i++)
        {
            System.out.print("Introduzca nº " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
    }

    private static void leeArray5(int[] a)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        for (i = 0; i < 5; i++)
        {
            System.out.print("Introduzca nº " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
    }

    public static void escribeArray5(int[] a)
    {
        int i;
        System.out.print("[");
        for(i = 0; i < 4; i++)
        {
            System.out.print(a[i]);
            System.out.print(", ");
        }
        System.out.print(a[5]);
        System.out.println("]");
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
}
