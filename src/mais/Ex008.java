package mais;
import java.util.Scanner;

//programa para verificar se a palavra é um palíndromo
public class Ex008 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra para saber se ela é palíndromo: ");
        String palavra = scanner.nextLine();
        scanner.close();

        boolean palindromo = verficarPalindromo(palavra);
        if(palindromo==true){
            System.out.println("Seu número é um políndromo");
        }
        else{
            System.out.println("Sua palavra NÃO é um políndromo.");
        }
    }

    static boolean verficarPalindromo(String frase){
        frase = frase.toLowerCase();
        StringBuilder palavraInvertida = new StringBuilder(frase).reverse();

        return frase.equals(palavraInvertida.toString());
    }
}