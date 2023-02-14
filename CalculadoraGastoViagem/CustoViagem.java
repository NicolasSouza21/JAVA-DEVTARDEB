package CalculadoraGastoViagem;

/**
 * CustoViagem
 */
public class CustoViagem {
public static void main(String[] args) {
    System.out.println("Calcular o custo da viagem");
    double distânciaPercorrida = 5711;
    System.out.println("A distancia percorrida é "+distânciaPercorrida+"Km");
    double valorCombustível = 5;
    System.out.println("O valor do combustível é "+valorCombustível);
    double consumoDoCarro = 12;
    System.out.println("O consumo do carro é "+consumoDoCarro+"Km/L");
    double quilometroPorLitro = distânciaPercorrida/consumoDoCarro;
    System.out.println("O carro gasta de gasolina no total "+quilometroPorLitro+" Km/L");
    double totalGasto = quilometroPorLitro*valorCombustível;
    System.out.println("O total gasto foi de "+totalGasto+"reais");


   


    
}
}