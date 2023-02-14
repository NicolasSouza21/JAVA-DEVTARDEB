package CalculadoraVelocidade2;

import java.util.Scanner;

public class CalculadoraVelocidade {
    Scanner sc = new Scanner(System.in);
    public void calcular(){
    System.out.println("Informe a distância Percorrida");
double distanciaPercorrida = sc.nextDouble();
System.out.println("Informe o tempo gasto");
double tempoGasto = sc.nextDouble();
double velocidadeMedia = distanciaPercorrida/tempoGasto;
System.out.println("A distância percorrida é"+velocidadeMedia+"km/h");
}
public void destino(){
    System.out.println("Informe o ponto de partida");
    String origem = sc.nextLine();
    System.out.println("Informe o ponto de destino");
    String destino = sc.nextLine();
    System.out.println("Sua viagem foi de " +origem+ " a " +destino);





}
}

