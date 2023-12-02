package mais;
import java.util.Scanner;

//Implemente um programa que determine se um número é positivo, negativo ou zero
public class Ex021 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leia.nextInt();

        leia.close();

        if(numero>0){
         System.out.println("SEU NÚMERO É POSITIVO!");
        }
        else if(numero<0){
            System.out.println("SEU NÚMERO É NEGATIVO");
        }
        else{
            System.out.println("ZERO!");
        }
    }
}
