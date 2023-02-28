package ExerciciosIfElse;
import java.util.Scanner;
public class Exercicios {

    Scanner sc = new Scanner(System.in);
    public void exercicio1() {
        System.out.println("Digite o valor 1");
        int nota1 = sc.nextInt();
        System.out.print("Digite o valor 2");
        int nota2 = sc.nextInt();
        if(nota1>nota2) {
            System.out.println("O valor 1 é maior ");
        }else if(nota1<nota2){
            System.out.println("O valor 2 é maior");
        } else { 
            System.out.println("Os valores são iguais");
        }

    }
    public void exercicio2() {
        System.out.println("Digite seu ano de nascimento");
        int anoNascimento =sc.nextInt();
        int anoVotar=2007;
        if(anoNascimento>anoVotar){
            System.out.println("Você ainda não pode votar");
        }else if(anoNascimento<anoVotar){
            System.out.println("Você ja pode votar");
        } else {
            System.out.println("Você ja pode votar");
        }
       

    }
    public void exercicio3() {
        System.out.println("Digite a senha super secreta");
        int senhaSecreta = 1234;
        if
    }
    public void exercicio4() {

        
    }
    public void exercicio5() {
        
    }
    public void exercicio6() {
        
    }
}
