package models;

import java.util.Scanner;

public class LecturaDatos {
    private float a, b, c;

    public void lecturaDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Calcular el are de una repisa triangular");
        System.out.printf("\nen funcion de sus longitudes");
        System.out.printf("\nDame el dato A: ");
        a = entrada.nextFloat();
        System.out.printf("Dame el dato B: ");
        b = entrada.nextFloat();
        System.out.printf("Dame el dato C: ");
        c = entrada.nextFloat();
    }
    public float getA(){
        return a;
    }
    public float getB(){
        return b;
    }
    public float getC(){
        return c;
    }
}