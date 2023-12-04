package FACCAT;
import java.util.Scanner;

//Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
//uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
//aluno é aprovado). Escrever também a média calculada.
public class Ex017 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Sua nota 1");
        double n1 = leia.nextDouble();

        System.out.println("Sua nota 2");
        double n2 = leia.nextDouble();

        leia.close();

        double media = (n1+n2)/2;

        if(media>=6){
            System.out.println("O aluno foi aprovado");
        }
        else {
            System.out.println("O aluno foi reprovado");
        }
    }
}
