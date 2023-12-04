package FACCAT;

import java.util.Scanner;

//Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos
//exercícios que fazem parte da avaliação. Calcular a média de aproveitamento, usando a fórmula abaixo
//e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo:
public class Ex041 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Nota 1: ");
        double nota1 = leia.nextDouble();

        System.out.println("Nota 2: ");
        double nota2 = leia.nextDouble();

        System.out.println("Nota 3: ");
        double nota3 = leia.nextDouble();

        System.out.println("Media dos exercicios: ");
        double mediaExercico = leia.nextDouble();

        leia.close();

        double mediaTotal = ((nota1+nota2)*2 + nota3 *3 +mediaExercico)/7;

        String notaFinal = "";
        if(mediaTotal<= 9){
            notaFinal = "A";
        }
        else if(mediaTotal>=7 && mediaTotal<9){
            notaFinal = "B";
        }
        else if(mediaTotal>=6 && mediaTotal<7.5){
            notaFinal = "C";
        }
        else{
            notaFinal = "D";
        }

        System.out.println("Nota aluno: "+notaFinal);
    }
}
