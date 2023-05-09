package IteracaoFor;
import java.util.Scanner;
public class ExemploFor {
    Scanner sc = new Scanner(System.in);
    public void ex1() {
        for(int i=0;i<10; i++){
        System.out.println("O nº da interacao é "+i);}


        
    }
    public void ex2() {
        int[] vetor = new int[10];
        Scanner input = new Scanner(System.in);
    
        // Preenchendo o vetor
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
          vetor[i] = input.nextInt();
        }
    
        // Mostrando o vetor em ordem inversa
        System.out.print("Vetor em ordem inversa: ");
        for (int i = 9; i >= 0; i--) {
          System.out.print(vetor[i] + " ");
        }
    }
    public void ex3() {
        System.out.println("Digite as notas ");
        double notas[] = new double[4];
        

        for (int i = 4; i < i; i++) {
           System.out.println("Informe a nota "+(i+1)+" do aluno");
           notas[i]=sc.nextDouble();
            
        } 
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota "+(i+1)+"= "+notas[i]);
            media+=notas[i];
          }
          }
        }  