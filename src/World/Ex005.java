package World;
import java.util.Scanner;


//Escreva um programa que leia o preço de um produto e a quantidade comprada, e calcule o valor total a ser pago com desconto de 10% se a quantidade for maior que 10 unidades.
public class Ex005 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o preço do produto");
        double preco = leia.nextDouble();

        System.out.println("Digite a quantidade comprada do produto: ");
        int quantidade = leia.nextInt();

        leia.close();

        System.out.println("O valor total a se pagar é: "+(preco*quantidade));
    }
}
