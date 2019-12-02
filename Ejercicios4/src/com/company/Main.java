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
            System.out.println("MENÚ EJERCICIOS DE ARRAYS (IV)");
            System.out.print("31. concatenaArraysPro");
            System.out.print("\t\t 32. copiaArrayPro");
            System.out.print("\t\t\t 33. insertaEnArray");
            System.out.println("\t\t\t 34. borraDeArray");
            System.out.print("35. elimina1ElementoArray");
            System.out.print("\t 36. eliminaElementosArray");
            System.out.print("\t 37. insertaArrayEnArray");
            System.out.println("\t 38. subArray");
            System.out.print("39. recortaArray");
            System.out.println("\t\t\t 40. ordenaBurbuja");
            System.out.println("0. Finalizar");
            System.out.print("Indique opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    continuar = false;
                    break;
                case 31:
                {
                    int[] a;
                    a = new int[8];
                    int[] b;
                    b = new int[5];
                    rellenaAleatorio2(a,5, 15);
                    rellenaAleatorio2(b,5, 15);
                    System.out.print("a: ");
                    escribeArray(a);
                    System.out.print("b: ");
                    escribeArray(b);
                    System.out.print("c: ");
                    escribeArray(concatenaArraysPro(a, b));
                }
                break;
                case 32:
                {
                    int[] a;
                    a = new int[8];
                    rellenaAleatorio2(a,5, 15);
                    System.out.print("a: ");
                    escribeArray(a);
                    int[] b;
                    b = copiarArrayPro(a);
                    System.out.print("b: ");
                    escribeArray(b);
                }
                break;
                case 33:
                {
                    int[] a;
                    a = new int[8];
                    rellenaAleatorio2(a,5, 15);
                    System.out.print("a: ");
                    escribeArray(a);
                    int[] b;
                    Random r = new Random();
                    int r1 = r.nextInt(100 + 1) + 1;
                    int r2 = r.nextInt(8 + 1);
                    b = insertaEnArray(a,r1, r2);
                    System.out.println("Insertar el valor "+ r1 +" en la posición " + r2);
                    System.out.print("b: ");
                    escribeArray(b);
                }
                break;
                case 34:
                {
                    int[] a;
                    a = new int[8];
                    rellenaAleatorio2(a,5, 15);
                    System.out.print("a: ");
                    escribeArray(a);
                    int[] b;
                    Random r = new Random();
                    int r2 = r.nextInt(8);
                    b = borraDeArray(a, r2);
                    System.out.println("Borra el valor de la posición " + r2);
                    System.out.print("b: ");
                    escribeArray(b);
                }
                break;
                case 35:
                {
                    int[] a;
                    a = new int[8];
                    rellenaAleatorio2(a,5, 15);
                    System.out.print("a: ");
                    escribeArray(a);
                    int[] b;
                    Random r = new Random();
                    int r2 = r.nextInt(15 - 5 + 1) + 5;
                    b = elimina1ElementoArray(a, r2);
                    System.out.println("Borrando el valor "+ r2);
                    System.out.print("b: ");
                    escribeArray(b);

                }
                break;
                case 36:
                {
                    //int[] a;
                    //a = new int[8];
                    //rellenaAleatorio2(a,5, 15);
                    int[] a = {1,5,5,5,5,5,5,78};
                    System.out.print("a: ");
                    escribeArray(a);
                    int[] b;
                    Random r = new Random();
                    int r2 = r.nextInt(15 - 5 + 1) + 5;
                    r2 = 5;
                    b = eliminaElementosArray(a, r2);
                    System.out.println("Borrando el valor "+ r2);
                    System.out.print("b: ");
                    escribeArray(b);
                }
                break;
                case 37:
                {
                    int[] a;
                    a = new int[8];
                    rellenaAleatorio2(a,5, 15);
                    int[] b;
                    b = new int[4];
                    rellenaAleatorio2(b,5, 15);
                    escribeArray(a);
                    escribeArray(b);
                    escribeArray(insertaArrayEnArray(a,3,b));
                }
                break;
                case 38:
                {
                    int[] a;
                    a = new int[8];
                    rellenaAleatorio2(a,5, 15);
                    escribeArray(a);
                    System.out.println("SubArray(a, 3, 6)");
                    escribeArray(subArray(a, 3, 6));
                }
                break;
                case 39:
                {
                    int[] a;
                    a = new int[8];
                    rellenaAleatorio2(a,5, 15);
                    escribeArray(a);
                    System.out.println("recortaArray(a, 2, 5)");
                    escribeArray(recortaArray(a, 2, 5));
                }
                break;
                case 40:
                {
                    int[] a;
                    a = new int[8];
                    rellenaAleatorio2(a,5, 15);
                    escribeArray(a);
                    System.out.print("Array ordenado: ");
                    escribeArray(ordenaBurbuja(a));
                }
                break;
                default: {
                    // opcion no válida
                }
            }
        }
    }

    public static int[] ordenaBurbuja(int[] a)
    {
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int b = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = b;
                }
            }
        }
        return  a;
    }

    public static int[] recortaArray(int[] a, int p1, int p2)
    {
        int[] c;
        c = new int[a.length - p2 + p1 - 1];
        // desde 0 hasta p1
        int i;
        for (i = 0; i < p1; i++) {
            c[i] = a[i];
        }
        // desde p2 hasta final
        for (int j = p2+1; j < a.length; j++) {
            c[i] = a[j];
            i++;
        }
        return c;
    }

    public static int[] subArray(int[] a, int p1, int p2)
    {
        int[] c;
        c = new int[p2 - p1];
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i+p1];
        }
        return c;
    }

    public static int[] insertaArrayEnArray(int[] a, int pos, int[] b)
    {
        int[] c;
        int i,j;
        c = new int[a.length + b.length];
        // insertar elementos de a desde 0 a pos
        for (i = 0; i < pos; i++) {
            c[i] = a[i];
        }
        // insertar elementos de b
        for (j = 0; j < b.length; j++) {
            c[i] = b[j];
            i++;
        }
        //insertar resto elementos de a
        j = 0;
        for (; i < c.length; i++) {
            c[i] = a[j + pos];
            j++;
        }
        return c;
    }

    public static int[] eliminaElementosArray(int[] a, int b)
    {
        int[] d;
        d = a;
        for (int i = 0; i < a.length; i++)
        {
            if(b == a[i])
            {
                d = elimina1ElementoArray(d, b);
            }
        }
        return d;
    }

    public static int[] elimina1ElementoArray(int[] a, int b)
    {
        int[] c;
        if(!contiene(a, b))
        {
            c = new int[a.length];
            c = a;
        }
        else {
            c = new int[a.length - 1];
            for (int i = 0; i < a.length; i++) {
                if(a[i] == b)
                {
                    c = borraDeArray(a, i);
                    return c;
                }
            }
        }
        return c;
    }

    public static int[] borraDeArray(int[] a, int pos)
    {
        int[] b;
        b = new int[a.length - 1];
        for (int i = 0; i < a.length - 1; i++) {
            if(i < pos) {
                b[i] = a[i];
            }
            else
            {
                b[i] = a[i + 1];
            }
        }
        return b;
    }

    public static int[] insertaEnArray(int[] a, int valor, int pos)
    {
        int[] b;
        b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            if(i < pos) {
                b[i] = a[i];
            }
            else
            {
                b[i+1] = a[i];
            }
        }
        b[pos] = valor;
        return b;
    }

    public static int[] copiarArrayPro(int[] a)
    {
        int[] b;
        b = new int[a.length];
        b = a;
        return b;
    }

    public static int[] concatenaArraysPro(int[] a, int[] b)
    {
        int l, i, j;
        l = a.length + b.length;
        int[] c;
        c = new int[l];
        for (i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (j = 0; j < b.length; j++) {
            c[i+j] = b[j];
        }
        return c;
    }
    // Anteriores
    public static boolean contiene(int[] a, int b)
    {
        boolean devuelve = false;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == b) devuelve = true;
        }
        return devuelve;
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
            a[i] = r.nextInt(max - min + 1) + min;
        }
    }
}
