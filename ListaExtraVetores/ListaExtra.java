package ListaExtraVetores;

public class ListaExtra{
    public void ex1(){
        int matriz[][] = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = i*j;

                
                
                
            }
            

            
            
        }


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+ " ");
                
            }
            System.out.println( );
            
        }
    }
}