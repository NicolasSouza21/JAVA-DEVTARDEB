package ExerciciosIfElse;

import java.util.Scanner;

public class Exercicios {

    Scanner sc = new Scanner(System.in);

    public void exercicio1() {  
        System.out.println( 
        int nota1 = sc.nextInt();
        System.out.print("Digite o valor 2");
        int nota2 = sc.nextInt();
        if (nota1 > nota2) {
            System.out.println("O valor 1 é maior ");
        } else if (nota1 < nota2) {
            System.out.println("O valor 2 é maior");
        } else {
            System.out.println("Os valores são iguais");
        }

    }

    public void exercicio2() {
        System.out.println("Digite seu ano de nascimento");
        int anoNascimento = sc.nextInt();
        int anoVotar = 2007;
        if (anoNascimento > anoVotar) {
            System.out.println("Você ainda não pode votar");
        } else if (anoNascimento < anoVotar) {
            System.out.println("Você ja pode votar");
        } else {
            System.out.println("Você ja pode votar");
        }

    }

    public void exercicio3() {
        System.out.println("Digite a senha super secreta");

        int senhaSecreta2 = 1234;
        int senhaSecreta0 = sc.nextInt();
        if (senhaSecreta2 == senhaSecreta0) {

            System.out.println("ACESSO PERMITIDO");
        } else {
            System.out.println("ACESSO NEGADO");
        }
    }

    public void exercicio4() {
        System.out.println("Quantas maçãs foram compradas?");
        double macasCompradas = sc.nextDouble();
        double macasPreco = 0.30;
        double macaDesconto = 0.25;
        double precoTotal;
        if (macasCompradas > 12) {
            precoTotal = macaDesconto * macasCompradas;
            System.out.println("O preço total foi de R$" + precoTotal);
        } else if (macasCompradas < 12) {

            precoTotal = macasPreco * macasCompradas;
            System.out.println("O preço total foi de R$" + precoTotal);
        }

    }

    public void exercicio5() {
        int maior, menor, meio;
        System.out.println("Digite o valor 1 ");
        int v1 = sc.nextInt();
        System.out.println("Digite o valor 2 ");
        int v2 = sc.nextInt();
        System.out.println("Digite o valor 3 ");
        int v3 = sc.nextInt();
        if ((v1 > v2) && (v1 > v3)) {
            maior = v1;

        }
        if (v2 < v3) {
            maior = v1;
            meio = v3;
            menor = v2;
            System.out.println("A ordem é" + maior + meio + menor);
        } else {
            maior = v1;
            meio = v2;
            menor = v3;
            System.out.println("A ordem é" + maior + meio + menor);
        }
        if ((v2 > v1) && (v2 > v3)) {
            maior = v2;

        }
        if (v1 < v3) {
            maior = v2;
            meio = v3;
            menor = v1;
            System.out.println("A ordem é" + maior + meio + menor);
        } else {
            maior = v2;
            meio = v1;
            menor = v3;
            System.out.println("A ordem é" + maior + meio + menor);

        }
        if ((v3 > v2) && (v3 > v1)) {
            maior = v3;

        }
        if (v1 > v2) {
            maior = v3;
            meio = v1;
            menor = v2;
            System.out.println("A ordem é" + maior + meio + menor);
        } else {
            maior = v3;
            meio = v2;
            menor = v1;
            System.out.println("A ordem é" + maior + meio + menor);
        }

    }

    public void exercicio6() {
        System.out.println("Você é homem digite 1 e se for Mulher digite 2");
        int sexo = sc.nextInt();
        System.out.println("Qual sua altura");
        double altura = sc.nextDouble();
        double resultado;

        if (sexo == 1) {
            resultado = 72.7 * altura - 58;
        } else if (sexo == 2)
            ;
        {
            resultado = 62.1 * altura - 44.7;

        }
        System.out.println("o seu resultado é de " + resultado);

    }

    public void exercicio7() {
        System.out.println("Qual foi a primeira nota do aluni");
        double nota1 = sc.nextDouble();
        System.out.println("Qual foi a segunda nota do aluno?");
        double nota2 = sc.nextDouble();
        System.out.println("Qual foi a frenquência do aluno?");
        double frequencia = sc.nextDouble();
        double resultado = (nota1 + nota2) / 2;
        if (resultado > 5 && frequencia > 75) {
            System.out.println("O aluno foi aprovado");
        } else {
            System.out.println("O aluno foi reprovado");
        }

    }
    // Lista extra

    public void extra1() {
        System.out.println("Digite o valor e descubra se é impar ou par");
        int valor = sc.nextInt();
        int valor1 = valor % 2;
        if (valor1 == 0) {
            System.out.println("o valor é par ");

        } else {
            System.out.println("o valor é ímpar ");

        }
    }

    public void extra2() {
        System.out.println("Qual foi a nota recebida? ");
        int nota = sc.nextInt();
        if (nota > 7) {
            System.out.println("O aluno foi aprovado");
        } else if (nota >= 5 && nota <= 7) {
            System.out.println("O aluno tem direito a fazer a recuperação");
        } else {
            System.out.println("O aluno foi reprovado direto");
        }

    }

public void extra3(){
    System.out.println("Digite uma letra");
    String letra= sc.next();

    if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")|| letra.equalsIgnoreCase("o")|| letra.equalsIgnoreCase("u")){
        System.out.println("a letra é uma vogal");
    }
    else{
        System.out.println("é uma consoante");
    }
}
public void extra4(){
    System.out.println("");

}

}
