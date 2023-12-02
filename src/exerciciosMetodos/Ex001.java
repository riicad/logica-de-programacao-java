package exerciciosMetodos;
import java.util.Scanner;

//Crie um método chamado soma que recebe dois números como parâmetros e retorna a soma deles.
public class Ex001 {
    static int soma(int numero1, int numero2){
        return numero1 + numero2;
    }
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = leia.nextInt();

        System.out.println("Digite outro número: ");
        int n2 = leia.nextInt();

        leia.close();

        System.out.println("A soma dos números é: "+(soma(n1,n2)));

    }
}
