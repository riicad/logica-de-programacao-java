package mais;
import java.util.Scanner;
import java.util.Random;

//crie um jogo de adivinhação simples
public class Ex013 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número entre 0 e 10 ");
        int numeroUser = leia.nextInt();

        leia.close();

        Random geraNumero = new Random();
        int numeroPC = geraNumero.nextInt(11);

        if(numeroUser==numeroPC){
            System.out.println("Você ganhou!");
        }
        else{
            System.out.println("Você perdeu, infelizmente.");
        }

    }
}
