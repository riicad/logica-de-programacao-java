package somenteAdorColetivaGeraUniao;
import java.util.Scanner;

//Crie um loop infinito que solicita ao usuário um número. Pare o loop quando o número 0 for inserido.
public class Ex009 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);


        while (true){
            System.out.println("Digite um número (0 desliga o programa): ");
            int respostaUSer = leia.nextInt();

            if (respostaUSer==0){
                break;
            } else{
                continue;
            }
        }

        leia.close();
    }
}
