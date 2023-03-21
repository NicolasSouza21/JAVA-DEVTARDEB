package ExemploVetores;
import java.util.Scanner;
public class Vetores {
    public void exemplo1() {
Scanner sc = new Scanner(System.in);
        double[] valores = new double[]{10.5,20.7,30.6,40.4};
        System.out.println("1º Posição- Índice[0]"+valores[0]);
        System.out.println("2º Posição- Índice[0]"+valores[1]);
        System.out.println("3º Posição- Índice[0]"+valores[2]);
        System.out.println("4º Posição- Índice[0]"+valores[3]);
        valores[0] = 15.6;
        System.out.println("1º posição- Índice[0]"+valores[0]); 
    }
 
    public void exemplo2() {
        int[] novosValores = new int[5];
        novosValores[0] = 10;
        novosValores[1] = 20;
        novosValores[2] = 35;
        novosValores[3] = 67;
        novosValores[4] = 98;   

        
        System.out.println("O vetor é : posição[0] "+novosValores[0]);
        System.out.println("O vetor é : posição[1] "+novosValores[1]);
        System.out.println("O vetor é : posição[2] "+novosValores[2]);
        System.out.println("O vetor é : posição[3] "+novosValores[3]);
        System.out.println("O vetor é : posição[4] "+novosValores[4]);
        

        
    }
    public void exemplo3() {
        double[] valorNovo = new double[10];
        valorNovo[0] =10.1 ;
        valorNovo[1] =10.2 ;
        valorNovo[2] =10.3 ;
        valorNovo[3] =10.4 ;
        valorNovo[4] =10.5 ;
        valorNovo[5] =10.6 ;
        valorNovo[6] =10.7 ;
        valorNovo[7] =10.8 ;
        valorNovo[8] =10.9 ;
        valorNovo[9] =10.10 ;
        System.out.println("A posição do vetor é : posição[9] "+valorNovo[9]);
        System.out.println("a posição do vetor é : posição[8] "+valorNovo[8]);
        System.out.println("a posição do vetor é : posição[7] "+valorNovo[7]);
        System.out.println("a posição do vetor é : posição[6] "+valorNovo[6]);
        System.out.println("a posição do vetor é : posição[5] "+valorNovo[5]);
        System.out.println("a posição do vetor é : posição[4] "+valorNovo[4]);
        System.out.println("a posição do vetor é : posição[3] "+valorNovo[3]);
        System.out.println("a posição do vetor é : posição[2] "+valorNovo[2]);
        System.out.println("a posição do vetor é : posição[1] "+valorNovo[1]);
        System.out.println("a posição do vetor é : posição[0] "+valorNovo[0]);
        
    }
    public void exemplo4() {
    double[] notas = new double[4];

        
    }
    
}
