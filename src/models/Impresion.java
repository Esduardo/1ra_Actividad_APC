package models;

public class Impresion {
    LecturaDatos leerDatos = new LecturaDatos();

    public float imprimirArea(float area){
        System.out.printf("\nEl area de la repisa triangular es: " + area);
        return area;
    }
    public float imprimirPerimetro(float p){
        System.out.printf("\nEl perimetro de la repisa triangular es: " + p);
        return p;
    }
}