package IteracaoWhile;

public class ExerciciosWhile {
    public void Exercicio1() {
        int vetorA[]=new int[]{3, 5, 7 , 11, 13};
        int vetorB[]= new int [vetorA.length];
        int i = 0;
        while(i<vetorA.length){
            vetorB[i] =vetorA [i];
            System.out.println("VetorB["+i+"]="+vetorB[i]);
            i++;

        }

        
    }
    public void Exercicio2() {
        int vetorA[]= new int[]{1 , 2 , 3 , 4 , 5 , 6 , 7 , 8};
        int vetorB[]= new int[vetorA.length];
        int i = 0;
        while(i<vetorA.length){
            vetorB[i] = 2*vetorA[i];
            System.out.println("o vetorB é ["+i+"]="+vetorB[i]);
            i++;
           

           
            

        }
        
    }
    public void exercicio3() {
        
        
    }
}
