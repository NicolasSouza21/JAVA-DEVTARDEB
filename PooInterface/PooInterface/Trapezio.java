package PooInterface;

public class Trapezio {
    int bM;
    int bMr;
    int altura;
    int l1;
    int l2;

    

    


    public Trapezio(int bM, int bMr, int altura, int l1, int l2) {
        this.bM = bM;
        this.bMr = bMr;
        this.altura = altura;
        this.l1 = l1;
        this.l2 = l2;
    }


    public double getA(){
        int area = ((bM+bMr)*altura)/2;
        return area;
    }
    

    public double getP(){
        int perimetro = (bM+bMr)*2;
        return perimetro;

    
}
}
