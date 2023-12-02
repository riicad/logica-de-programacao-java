package mais;
import java.util.Scanner;

//mostra a palavra escrita ao contrario
public class Ex004 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = leia.next();

        leia.close();

        int numChar = (palavra.length()) - 1;

        for(int i = numChar; i>=0; i--){
            System.out.println(palavra.charAt(i));
        }

    }
}
