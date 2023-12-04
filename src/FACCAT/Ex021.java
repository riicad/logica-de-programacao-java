package FACCAT;
import java.util.Scanner;

//Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os
//minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
//de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
public class Ex021 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Hora de inicio: ");
        int inicio = leia.nextInt();

        System.out.println("Hora do fim: ");
        int fim = leia.nextInt();

        leia.close();

        int tempoJogo;

        if (fim> inicio) {
            tempoJogo = fim - inicio;
        } else {
            tempoJogo = 24 - inicio + fim;
        }

        System.out.println("O jogo durou: "+tempoJogo+"horas");

    }
}
