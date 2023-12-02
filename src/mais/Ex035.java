package mais;
import java.util.Scanner;

//Crie um programa que calcule a soma dos dígitos de um número.
public class Ex035 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = leia.nextInt();

        leia.close();

        int contaDigito = 0;

        for(int i = num; i!=0; i/=10){
            contaDigito += (i%10);
        }

        System.out.println(contaDigito);
    }
}
