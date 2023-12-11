package World;
import java.util.Scanner;

//Crie um programa que leia três números inteiros e exiba-os em ordem crescente.
public class Ex024 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leia.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = leia.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int numero3 = leia.nextInt();

        leia.close();

        int primeiro, segundo, terceiro;

        if (numero>numero2 && numero>numero3 && numero2>numero3){
            primeiro = numero;
            segundo = numero2;
            terceiro = numero3;
        }
        else if((numero>numero2 && numero>numero3 && numero3>numero2)){
            primeiro = numero;
            segundo = numero3;
            terceiro = numero2;
        }
        else if(numero2>numero && numero2>numero3 && numero>numero3){
            primeiro = numero2;
            segundo = numero;
            terceiro = numero3;
        }
        else if(numero2>numero && numero2>numero3 && numero3>numero){
            primeiro = numero2;
            segundo = numero3;
            terceiro = numero;
        }
        else if(numero3>numero && numero3>numero2 && numero>numero2){
            primeiro = numero3;
            segundo = numero;
            terceiro = numero2;
        }
        else{
            primeiro = numero3;
            segundo = numero2;
            terceiro = numero;
        }

        System.out.println(terceiro+" "+segundo+" "+primeiro);
    }
}
