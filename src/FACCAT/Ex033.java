package FACCAT;
import java.util.Scanner;

//Ler dois valores e imprimir uma das três mensagens a seguir:
//‘Números iguais’, caso os números sejam iguais
//‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
//‘Segundo maior’, caso o segundo seja maior que o primeiro.
public class Ex033 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = leia.nextInt();

        System.out.println("Digite outro número: ");
        int n2 = leia.nextInt();

        leia.close();

        if(n1==n2){
            System.out.println("Números iguais");
        }
        else if(n1>n2){
            System.out.println("O primeiro é maior");
        }
        else{
            System.out.println("O segundo é maior");
        }
    }
}
