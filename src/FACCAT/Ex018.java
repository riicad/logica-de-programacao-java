package FACCAT;
import java.util.Scanner;

//Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
//poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).
public class Ex018 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Ano atual: ");
        int anoAtual = leia.nextInt();

        System.out.println("Ano de nascimento: ");
        int anoNascimento = leia.nextInt();

        leia.close();

        if (anoAtual-anoNascimento>=18){
            System.out.println("VOTO OBRIGATÓRIO");
        }
        else if(anoAtual-anoNascimento<18&&anoAtual-anoNascimento>15){
            System.out.println("VOTO OPCIONAL");
        }
        else{
            System.out.println("NÃO PODE VOTAR");
        }
    }
}
