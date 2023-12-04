package FACCAT;
import java.util.Scanner;

// Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
//contrário escrever NÃO É MAIOR QUE 10!
public class Ex014 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leia.nextInt();

        leia.close();

        if (numero>10){
            System.out.println("Seu número é maior que 10");
        }
        else{
            System.out.println("Seu número é menor que 10");
        }
    }
}
