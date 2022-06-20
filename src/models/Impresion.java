package models;

public class Impresion {
    LecturaDatos leerDatos = new LecturaDatos();

    public float imprimirArea(float area){
        System.out.printf("El area de la repisa triangular es: " + area);
        return area;
    }
}