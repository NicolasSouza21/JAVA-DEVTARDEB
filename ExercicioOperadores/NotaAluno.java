package ExercicioOperadores;

import java.util.Scanner;


public class NotaAluno {
    Scanner sc = new Scanner(System.in);
    
    public void Calcular(){
        System.out.println("Informa a nota 1 do aluno");
        int nota1 = sc.nextInt();
        System.out.println("Informe a nota 2 do aluno");
        int nota2 = sc.nextInt();

        double mediaAluno = (nota1+nota2)/2;
        System.out.println("A média do aluno é " +mediaAluno);
        boolean medidaAprovada = mediaAluno>= 50;
        
    System.out.println("O aluno está aprovado por nota?"+medidaAprovada);
    System.out.println("Informa a frequência do aluno");
    int frenquênciaAluno = sc.nextInt();
    boolean frequênciaAprovada = frenquênciaAluno>=75;
    System.out.println("o aluno está aprovado por frequencia?"+frequênciaAprovada);
boolean resultadoFinal = (medidaAprovada==true) && (frequênciaAprovada==true);

System.out.println("O Aluno está aprovado no Curso? "+resultadoFinal);

    }
}      