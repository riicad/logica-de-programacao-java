package FACCAT;
import java.util.Scanner;

//Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
//do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE
public class Ex032 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("NOME Time 1: ");
        String time1 = leia.nextLine();
        System.out.println("Quantos gols ele fez? ");
        int golTime1 = leia.nextInt();

        System.out.println("NOME Time 2: ");
        String time2 = leia.nextLine();
        System.out.println("Quantos gols ele fez? ");
        int golTime2 = leia.nextInt();

        leia.close();

        if(golTime1>golTime2){
            System.out.printf("O TIME VENCEDOR É %s", time1);
        }
        else if(golTime1==golTime2){
            System.out.println("EMPATE");
        }
        else{
            System.out.printf("O TIME VENCEDOR É %s", time2);
        }


    }
}
