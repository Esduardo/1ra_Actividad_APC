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
        float resutadoP = realizarOperaciones.p(caputaDatos.getA(), caputaDatos.getB(), caputaDatos.getC());
        float resultadoArea = realizarOperaciones.area(caputaDatos.getA(), caputaDatos.getB(), caputaDatos.getC(), resutadoP);

        //resultado
        Impresion imprimir = new Impresion();
        float impresion2 = imprimir.imprimirPerimetro(resutadoP);
        float impresion = imprimir.imprimirArea(resultadoArea);

    }
}