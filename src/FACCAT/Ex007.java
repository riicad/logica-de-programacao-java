package FACCAT;
import java.util.Scanner;

//Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
//dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
public class Ex007 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Quantos anos de idade você tem? ");
        int anos = leia.nextInt();

        System.out.println(anos+" anos mais quantos meses de idade você tem? ");
        int meses = leia.nextInt();

        System.out.println(+anos+" anos, "+meses+" meses e quantos dias de você tem? ");
        int dias = leia.nextInt();

        leia.close();
        int totalDias = anos*365+meses*30+dias;


        System.out.println("A quantidade de dias que você tem com o total da sua idade é: "+totalDias);
    }
}
