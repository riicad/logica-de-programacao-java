package FACCAT;
import java.util.Scanner;

//faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
//quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
//média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
//a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
//compra'.
public class Ex026 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Quantidade atual do produto: ");
        int atual = leia.nextInt();

        System.out.println("Quantidade maxima: ");
        int max = leia.nextInt();

        System.out.println("Quantidade minima: ");
        int min = leia.nextInt();

        leia.close();

        if(atual<min){
            System.out.println("PRECISA COMPRAR O PRODUTO");
        }
        else if(atual>=max){
            System.out.println("NÃO PRECISA COMPRAR O PRODUTO");
        }

    }
}
