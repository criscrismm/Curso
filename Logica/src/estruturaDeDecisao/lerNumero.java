package estruturaDeDecisao;

import java.util.Scanner;

public class lerNumero {

    public static void main(String[] args) {
        
        int num=0;
       
        Scanner entrada = new Scanner(System.in);
        
        while (num!=10) {
            System.out.println("Escreva um numero");
            num= entrada.nextInt();
            System.out.println(num);

    }
    }
}
