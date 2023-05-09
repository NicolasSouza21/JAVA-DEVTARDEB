package Matrizes;
import java.util.Scanner;
import java.util.Random;

public class Matrizes {
    Scanner sc = new Scanner(System.in);
        Random rd = new Random();
    public void ex1() {
        int matriz[][] = new int[10][9];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println("matriz["+i+"]["+j+"]");
                matriz[i][j] = rd.nextInt(10);

                
            }
            
        }
        for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[0].length; j++) {
            System.out.println("matriz["+i+ "]["+j+ "]="+matriz[i][j]);
            
        }
            
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
                
            }
            System.out.println("| ");
            
        }
       int somaLinha = 0;
        for (int j = 0; j < matriz[0].length; j++) {
            somaLinha = somaLinha + matriz[4][j];


            
        }System.out.println(somaLinha);
        
       
            
            
        }
        public void ex2() {
            int matriz[][] =new int[5][5];
         
            for (int i = 0; i < 6; i++) {
                System.out.print("| ");
            for (int j = 0; j < 5; j++) {
              if (i==j) {
                matriz[i][j] = 1;
                
              }else{
                matriz[i][j] = 0;
              }
               
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.println("| ");
            }
            
            
        }
        public void ex3() {
            int matriz[][] = new int[4][4];
            

            
        }



        
    }
    
