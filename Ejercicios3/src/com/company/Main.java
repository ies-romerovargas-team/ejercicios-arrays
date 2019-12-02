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
            System.out.println("MENÚ EJERCICIOS DE ARRAYS (III)");
            System.out.print("21. copiaArray");
            System.out.print("\t\t 22. copiaArrayInvertido");
            System.out.print("\t 23. sumaArrays");
            System.out.println("\t\t 24. restaArrays/mul/div");
            System.out.print("25. invierteArray");
            System.out.print("\t 26. comparaArrays");
            System.out.print("\t\t\t 27. ponNotasArray");
            System.out.println("\t 28. concatenaArrays55");
            System.out.print("29. concatenaArrays");
            System.out.println("\t 30. contiene");
            System.out.println("0. Finalizar");
            System.out.print("Indique opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    continuar = false;
                    break;
                case 21:
                {
                    int[] a;
                    a = new int[5];
                    int[] b;
                    b = new int[5];
                    rellenaAleatorio2(a,5, 15);
                    rellenaAleatorio2(b,5, 15);
                    System.out.print("a: ");
                    escribeArray(a);
                    System.out.print("b: ");
                    escribeArray(b);
                    copiaArray(a,b);
                    System.out.println("Copiados: ");
                    System.out.print("a: ");
                    escribeArray(a);
                    System.out.print("b: ");
                    escribeArray(b);
                }
                break;
                case 22:
                {
                    int[] a;
                    a = new int[5];
                    int[] b;
                    b = new int[5];
                    rellenaAleatorio2(a,5, 15);
                    rellenaAleatorio2(b,5, 15);
                    System.out.print("a: ");
                    escribeArray(a);
                    System.out.print("b: ");
                    escribeArray(b);
                    copiaArrayInvertido(a,b);
                    System.out.println("Copiados: ");
                    System.out.print("a: ");
                    escribeArray(a);
                    System.out.print("b: ");
                    escribeArray(b);
                }
                break;
                case 23:
                {
                    int[] a;
                    a = new int[5];
                    int[] b;
                    b = new int[5];
                    int[] c;
                    c = new int[5];
                    rellenaAleatorio2(a,5, 15);
                    rellenaAleatorio2(b,5, 15);
                    System.out.print("a: ");
                    escribeArray(a);
                    System.out.print("b: ");
                    escribeArray(b);
                    System.out.print("c: ");
                    escribeArray(c);
                    sumaArrays(a, b, c);
                    System.out.println("Sumamos en c: ");
                    System.out.print("a: ");
                    escribeArray(a);
                    System.out.print("b: ");
                    escribeArray(b);
                    System.out.print("c: ");
                    escribeArray(c);
                }
                break;
                case 24:
                {
                    int[] a;
                    a = new int[5];
                    int[] b;
                    b = new int[5];
                    int[] c;
                    c = new int[5];
                    rellenaAleatorio2(a,5, 15);
                    rellenaAleatorio2(b,5, 15);
                    System.out.print("a: ");
                    escribeArray(a);
                    System.out.print("b: ");
                    escribeArray(b);
                    System.out.print("c: ");
                    escribeArray(c);
                    restaArrays(a, b, c);
                    System.out.print("Resta: ");
                    escribeArray(c);
                    multiplicaArrays(a, b, c);
                    System.out.print("Multiplica: ");
                    escribeArray(c);
                    divideArrays(a, b, c);
                    System.out.print("Divide: ");
                    escribeArray(c);
                }
                break;
                case 25:
                {
                    int[] a;
                    a = new int[8];
                    rellenaAleatorio2(a, 5, 15);
                    escribeArray(a);
                    System.out.print("Array invertido: ");
                    invierteArray(a);
                    escribeArray(a);
                }
                break;
                case 26:
                {
                    int[] a;
                    a = new int[8];
                    rellenaAleatorio2(a,5,10);
                    escribeArray(a);
                    int[] b;
                    b = new int[8];
                    rellenaAleatorio2(b,5,10);
                    escribeArray(b);
                    if(comparaArrays(a, b))
                    {
                        System.out.println("Son iguales");
                    }
                    else
                    {
                        System.out.println("Son distintos");
                    }
                    b = a;
                    escribeArray(a);
                    escribeArray(b);
                    if(comparaArrays(a, b))
                    {
                        System.out.println("Son iguales");
                    }
                    else
                    {
                        System.out.println("Son distintos");
                    }
                }
                break;
                case 27:
                {
                    double[] a;
                    boolean[] b;
                    a = new double[8];
                    b = new boolean[8];
                    rellenaAleatorio3(a,0,10);
                    escribeArray2(a);
                    ponNotasArray(a, b);
                    escribeArray3(b);
                }
                break;
                case 28:
                {
                    int[] a;
                    a = new int[5];
                    int[] b;
                    b = new int[5];
                    int[] c;
                    c = new int[10];
                    rellenaAleatorio2(a, 20,30);
                    System.out.print("a: ");
                    escribeArray(a);
                    rellenaAleatorio2(b, 20,30);
                    System.out.print("b: ");
                    escribeArray(b);
                    concatenaArrays55(a,b,c);
                    System.out.print("c: ");
                    escribeArray(c);
                }
                break;
                case 29:
                {
                    int[] a;
                    a = new int[8];
                    int[] b;
                    b = new int[3];
                    int[] c;
                    c = new int[11];
                    rellenaAleatorio2(a, 20,30);
                    System.out.print("a: ");
                    escribeArray(a);
                    rellenaAleatorio2(b, 20,30);
                    System.out.print("b: ");
                    escribeArray(b);
                    concatenaArrays(a,b,c);
                    System.out.print("c: ");
                    escribeArray(c);
                }
                break;
                case 30:
                {
                    int[] a;
                    a = new int[8];
                    rellenaAleatorio2(a, 0, 15);
                    escribeArray(a);
                    if(contiene(a,5))
                    {
                        System.out.println("El array contiene el entero '5'");
                    }
                    else
                    {
                        System.out.println("El array no contiene el entero '5'");
                    }

                }
                break;
                default: {
                    // opcion no válida
                }
            }
        }
    }

    public static boolean contiene(int[] a, int b)
    {
        boolean devuelve = false;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == b) devuelve = true;
        }
        return devuelve;
    }

    public static void concatenaArrays(int[] a, int[] b, int[] c)
    {
        int i, j;
        for (i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (j = 0; j < b.length; j++) {
            c[i+j] = b[j];
        }
    }

    public static void concatenaArrays55(int[] a, int[] b, int[] c)
    {
        for (int i = 0; i < 5; i++) {
            c[i] = a[i];
            c[i+5] = b[i];
        }
    }

    public static void ponNotasArray(double[] a, boolean[] b)
    {
        // asumimos que tienen el mismo tamaño
        for (int i = 0; i < a.length ; i++) {
            if(a[i] >= 5)
            {
                b[i] = true;
            }
            else
            {
                b[i] = false;
            }
        }

    }

    public static boolean comparaArrays(int[] a, int[] b)
    {
        boolean comp = true;
        if(a.length == b.length)
        {
            for (int i = 0; i < a.length; i++) {
                if(a[i] != b[i])
                {
                    comp = false;
                    break;
                }
            }
        }
        else
        {
            comp = false;
        }
        return  comp;
    }

    public static void  invierteArray(int[] a)
    {
        int x = a.length;
        int aux;
        for (int i = 0; i < x / 2; i++) {
            aux = a[x - (i + 1)];
            a[x - (i + 1)] = a[i];
            a[i] = aux;
        }
    }

    public static void restaArrays(int[] a, int[] b, int[] c)
    {
        //asumimos que tienen el mismo tamaño
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] - b[i];
        }
    }

    public static void multiplicaArrays(int[] a, int[] b, int[] c)
    {
        //asumimos que tienen el mismo tamaño
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] * b[i];
        }
    }

    public static void divideArrays(int[] a, int[] b, int[] c)
    {
        //asumimos que tienen el mismo tamaño
        for (int i = 0; i < a.length; i++) {
            if(b[i] != 0) {
                c[i] = a[i] / b[i];
            }
        }
    }

    public static void sumaArrays(int[] a, int[] b, int[] c)
    {
        //asumimos que tienen el mismo tamaño
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
    }
    public static void copiaArrayInvertido(int[] a, int[] b)
    {
        int t = a.length;
        if(t != b.length)
        {
//            System.out.println("Error: Arrays de diferentes tamaños");
            throw new IllegalArgumentException("Error: Arrays de diferentes tamaños");
        }
        else
        {
            for (int i = 0; i < t; i++) {
                b[i] = a[t-i-1];
            }
        }
    }

    public static void copiaArray(int[] a, int[] b)
    {
        if(a.length!=b.length)
        {
            System.out.println("Error: Arrays de diferentes tamaños");
        }
        else
        {
            for (int i = 0; i < a.length; i++) {
                b[i] = a[i];
            }
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
            a[i] = r.nextInt(max - min + 1) + min;
        }
    }

    public static void rellenaAleatorio3(double[] a, int min, int max)
    {
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            double randomValue = min + (max - min) * r.nextDouble();
            a[i] = randomValue;
        }
    }

    public static void escribeArray2(double[] a)
    {
        int i;
        System.out.print("[");
        for(i = 0; i < a.length - 1; i++)
        {
            System.out.printf("%.2f", a[i] );
            System.out.print(", ");
        }
        System.out.printf("%.2f", a[a.length-1]);
        System.out.println("]");
    }

    public static void escribeArray3(boolean[] a)
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
