package FACCAT;
import java.util.Scanner;

//Ler um valor e escrever se é positivo, negativo ou zero.
public class Ex027 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = leia.nextInt();

        leia.close();

        if(numero>0){
            System.out.println("POSITIVO");
        }
        else if(numero==0){
            System.out.println("ZERO");
        }
        else{
            System.out.println("NEGATIVO");
        }
    }
}
