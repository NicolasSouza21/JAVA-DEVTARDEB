package EstruturaDecisaoSwitch;
import java.util.Scanner;
public class SwitchCase {
    Scanner sc = new Scanner(System.in);
    public void Letra(){
        System.out.println("Digite a Letra");
        String letraVogal = sc.nextLine();
        switch(letraVogal){
            case "a": letraVogal = "Vogal";
            break;
            case "e": letraVogal = "Vogal";
            break;
            case "i": letraVogal = "Vogal";
            break;
            case "o": letraVogal = "Vogal";
            break;
            case "u": letraVogal = "Vogal";
            break;
            default: letraVogal = "Consoante";
            break;

        }
         System.out.println("a letra é uma "+letraVogal);
    }
    public void mes() {
        System.out.println("Digite um numero de 1 a 12 para saber o mês");
        int mesNumero = sc.nextInt();
        String mes = "";
        switch (mesNumero) {
            case 1: mes = "Janeiro";
            break;
            case 2: mes = "Fevereiro";
            break;
            case 3: mes = "Março";
            break;
            case 4: mes = "Abril";
            break;
            case 5: mes = "Maio";
            break;
            case 6: mes = "Junho";
            break;
            case 7: mes = "Julho";
            break;
            case 8: mes = "Agosto";
            break;
            case 9: mes = "Setembro";
            break;
            case 10: mes = "Outubro";
            break;
            case 11: mes = "Novembro";
            break;
            case 12: mes = "Dezembro";
            break;
            default: mes = "Mês não encontrado";
        
    } System.out.println("O mês é"+mes );

}
}