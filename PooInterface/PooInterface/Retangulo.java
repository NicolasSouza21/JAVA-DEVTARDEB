package PooInterface;

public class Retangulo implements FigurasGeometricas{
    int base;
    int altura;
    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

        public String getNomeFigura(){
            return "retangulo";
        }
    
        int lado;
        public double getA(){
            

            return base*altura;
        }
        
    
        public double getP(){
            
            return (base+altura)*2;


    }



    
}
