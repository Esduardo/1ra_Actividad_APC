package models;

public class OperacionMetodos {


    public float p(float a, float b, float c){
        float p = (a + b + c) / 2;
        return p;
    }
    public float area(float a, float b, float c, float p){
        float area = (float) Math.sqrt(p * (p-a) * (p-b) * (p-c));
        return area;
    }
}

