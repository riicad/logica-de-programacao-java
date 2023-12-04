package FACCAT;
import java.util.Scanner;
//Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo)
public class Ex015 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leia.nextInt();

        leia.close();

        if (numero>0){
            System.out.println("Seu número é positivo!");
        }
        else if (numero==0){
            System.out.println("Seu número é ZERO");
        }else{
            System.out.println("Seu número é negativo");
        }

    }
}
