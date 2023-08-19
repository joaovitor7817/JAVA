package triangulo;

import java.util.*;

public class calc {
    public static void main(String args[]) {
        Scanner robo = new Scanner(System.in);
        
        System.out.println("Escreva três valores para saber se com os três é possível formar um triângulo. Lembrando que nenhum dos lados pode ser igual a zero");
        
        System.out.println("Digite o primeiro valor: ");
        float v1 = robo.nextFloat();
        
        System.out.println("Digite o segundo valor: ");
        float v2 = robo.nextFloat();
        
        System.out.println("Digite o terceiro valor: ");
        float v3 = robo.nextFloat();
        
        if(v1 > 0 && v2 > 0 && v3 > 0){
            if(v1 + v2 < v3 || v1 + v3 < v2 || v2 + v3 < v1){
                System.out.println("Não da pra formar um triângulo.");
            } else{
                if(v1 == v2 && v2 == v3){
                    System.out.println("É um triângulo equilátero.");    
                }else if(v1 == v2 || v1 == v3 || v2 == v3){
                    System.out.println("É um triângulo isósceles.");    
                }else{
                    System.out.println("É um triângulo escaleno.");
                }
            }
        }else{
            System.out.println("Você digitou o zero né cabeção.");
        }
        
        }
}
