package PooInterface;

public class App{

    public static void main(String[] args) {
        Quadrado figura1 = new Quadrado(8);
        System.out.println(figura1.getNomeFigura()
                              +"n/Area"+ figura1.getA()
                               + "n/Perimetro"+ figura1.getP());
        Retangulo figura2 = new Retangulo(10, 2);
        System.out.println(figura1.getNomeFigura());

    }
}
