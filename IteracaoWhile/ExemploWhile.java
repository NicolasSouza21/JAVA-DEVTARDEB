package IteracaoWhile;
import java.util.Scanner;
import java.util.Random;

public class ExemploWhile {
    Scanner sc = new Scanner(System.in);
    public void while1() {
    
   
    
    int i = 0;
    while(i<1000000000){
        System.out.println("O nº da Iteração é"+i);
        i++;
    }
    
        
    }
    public void while2() {
     int i = 0;
     int vetor[]= new int[10];
     while(i<10){
        System.out.println("Informe o valor do vertor["+i+"]= " );
        vetor[i]= sc.nextInt();
        i++;


     }
     while(i>0){
        i--;
        System.out.println("O vetor da posição["+i+"]="+vetor[i]);
     }


    
}
public void while3() {
   
    Random random = new Random();
System.out.println("============================");
// Aleatórios de 0 até 9
int numeroAleatorio = random.nextInt(10)+1;
boolean tentarNovamente = true;
System.out.println("Aperte CTRL+C, a qualquer momento, para parar.");
// Enquanto tentarNovamente igual a true, itera novamente.
while (tentarNovamente) {
System.out.print("Tente adivinhar o número: ");
int numero = sc.nextInt();
// Repare que a relação abaixo e a de diferença,
// enquanto diferente, retorna true e, por isso,
// tenta novamente.
tentarNovamente = numeroAleatorio != numero;
if (tentarNovamente) {
System.out.println("Errado!");
}
}
System.out.println("Parabéns! Você adivinhou. Era o número"
+ numeroAleatorio + " mesmo.");
System.out.println("Fim!");
System.out.println("============================");
}

    
}

