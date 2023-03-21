package AulaRevisao1;

import java.util.Scanner;

public class ExemploRevisao {
    Scanner sc = new Scanner(System.in);

    public void Exemplo1() {
        System.out.println("Informe a primeira nota");
        double nota1 = sc.nextDouble();
        System.out.println("Informe a Segunda nota");
        double nota2 = sc.nextDouble();
        double mediaAluno= (nota1+nota2)/2;
        System.out.println("A média do aluno é "+mediaAluno);
        
        System.out.println("Qual é o numero total de aulas dadas? ");
        double aulasDadas = sc.nextDouble();
        System.out.println("Qual o total de faltas do aluno?"); 
        double alunoFaltas = sc.nextDouble();
        double frequenciaAluno =  (aulasDadas-alunoFaltas)*100/aulasDadas;
        System.out.println("A frequencia do aluno foi "+frequenciaAluno+"%");

        if(frequenciaAluno>=75 && mediaAluno>=5){
        System.out.println("O aluno foi aprovado");

        }
        else{
            System.out.println("O aluno está reprovado");
        }

        
         

        
    }
}
