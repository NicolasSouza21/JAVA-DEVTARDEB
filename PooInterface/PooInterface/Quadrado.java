package PooInterface;

public class Quadrado implements FigurasGeometricas {
    public String getNomeFigura(){
        return "quadrado";
    }

    public Quadrado(int lado) {
        this.lado = lado;
    }

    int lado;
    public double getA(){
        int area = lado*lado;
        return area;
    }
    

    public double getP(){
        int perimetro = 4*lado;
        return perimetro;



    }
}
