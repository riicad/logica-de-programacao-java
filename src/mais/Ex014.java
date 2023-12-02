package mais;
import java.util.Scanner;

//conta a quantidade de vogais em uma palavra
public class Ex014 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite uma palavra para saber quantas vogais tem: ");
        String palavra = leia.next();

        leia.close();

        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        int numeroVogais = 0;

        for(int i=0; i<palavra.length(); i++){
            char letraPalavra = palavra.charAt(i);
            for (char letra : vogais){
                if(letra==letraPalavra){
                    numeroVogais +=1;
                }
            }
        }

        System.out.println("A quantiade de vogais nessa palavra é: "+numeroVogais);
    }
}
