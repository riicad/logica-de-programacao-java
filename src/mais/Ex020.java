package mais;
import java.util.Scanner;

//verifica quantas palavras tem na frase
public class Ex020 {
    public static void main(String[] args){
    Scanner leia = new Scanner(System.in);

    System.out.println("Digite a palavra que deseja verificar: ");
    String palavra = leia.next();

    System.out.println("Digite a frase: ");
    String frase = leia.next();

    leia.close();

    String[] fraseLista = frase.split(" ");
    int contador = 0;

    for (String palavraFrase : fraseLista){
        if (palavra.equalsIgnoreCase(palavraFrase)){
            contador++;
        }
    }

    System.out.printf("A palavra %s apareceu %d vezes na sua frase", palavra.toLowerCase(), contador);
    }
}
