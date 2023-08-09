import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso em kg: ");
        float peso = scanner.nextFloat();

        System.out.println("Digite sua altura em metros: ");
        float altura = scanner.nextFloat();

        float imc = peso / ( altura * altura);

        System.out.println("Seu IMC é " + imc);
        
        if(imc < 18.5){
            System.out.println("Abaixo do peso.");
        } else if( imc < 25){
            System.out.println("Peso normal");
        } else if( imc < 30){
            System.out.println("Acima do peso");
        } else if( imc < 35){
            System.out.println("Obesidade grau 1");
        } else if( imc < 40){
            System.out.println("Obesidade grau 2");
        } else{
            System.out.println("Obesidade grau 3");
        }
        
        scanner.close();
    }
}
