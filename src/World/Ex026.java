package World;
import java.util.Scanner;

//26) Escreva um programa que leia o código de um produto e a quantidade comprada, e exiba o valor total a ser pago. Considere que cada produto tem um preço diferente.
public class Ex026 {
    public static void main(String[] args){
            Scanner leia = new Scanner(System.in);

            System.out.println("Digite o preço do produto");
            double preco = leia.nextDouble();

            System.out.println("Digite a quantidade comprada do produto: ");
            int quantidade = leia.nextInt();

            System.out.println("Código do produto: ");
            int codigoP = leia.nextInt();

            leia.close();

            System.out.printf("Código: %d se pagar é: R$%f", codigoP, (preco*quantidade));
        }
    }

