import models.Impresion;
import models.LecturaDatos;
import models.OperacionMetodos;
                        //221198 Guillen Luna Jesus Alejandro
                        //221214 Palomeque Roblero Esduardo
import java.util.Scanner;

public class RepisaTrianngular {
    public static void main (String [] srgs) {
        LecturaDatos caputaDatos = new LecturaDatos();
        caputaDatos.lecturaDatos();

//operaciones
        OperacionMetodos realizarOperaciones = new OperacionMetodos();
        float resultadArea = realizarOperaciones.p(caputaDatos.getA(), caputaDatos.getB(), caputaDatos.getC());

        //resultado
        Impresion imprimir = new Impresion();
        float impresion = imprimir.imprimirArea(resultadArea);
    }
}