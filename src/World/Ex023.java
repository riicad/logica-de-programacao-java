package World;
import java.util.Scanner;

//Escreva um programa que leia o nome de um mês e exiba a quantidade de dias que ele possui. Considere apenas meses válidos.
public class Ex023 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome de um mês: ");
        String mes = leia.next();

        leia.close();
        //(janeiro, março, maio, julho, agosto, outubro e dezembro) 31 dias
        //fevereiro 29 dias
        System.out.println(mes.equals("janeiro") || mes.equals("março") ||
                mes.equals("maio") || mes.equals("julho") || mes.equals("agosto") ||
                mes.equals("outubro") || mes.equals("dezembro") ? "seu mês tem 31 dias" :
                mes.equals("fevereiro") ? "seu mês tem 29 dias" : "seu mês tem 30 dias");
    }
}
