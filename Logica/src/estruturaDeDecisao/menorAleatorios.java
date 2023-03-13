package estruturaDeDecisao;

import java.util.Random;

public class menorAleatorios {

    public static void main(String[] args) {
        
      
        int menor=100;
        int maior =0;
        int sorteado;
        
        Random gerador = new Random();
        
        for (int cont=1; cont<11; cont=cont+1) {
            System.out.println(sorteado = gerador.nextInt(101));
            
            if (sorteado>maior){
                maior=sorteado;
            }
            if (sorteado<menor) {
                menor= sorteado;
            }
            
           
        }           
        System.out.println("Menor " +menor);
        System.out.println("Maior " +maior);
        
    }

}
