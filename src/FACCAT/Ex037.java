package FACCAT;
import java.util.Scanner;

//Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá
//ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de
//morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente
public class Ex037 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor das maças: (Kg)");
        double kqMaca = leia.nextDouble();

        System.out.println("Digite o valor dos morangos: (Kg)");
        double kgMorango = leia.nextDouble();

        leia.close();

        double totalMaca = 0;
        double totalMorango = 0;

        if(kqMaca>5){
            totalMaca = kqMaca*1.50;
        }
        else{
            totalMaca = kqMaca*1.80;
        }

        if(kgMorango>5){
            totalMorango = kgMorango*2.20;
        }
        else{
            totalMorango = kgMorango*2.50;
        }

        if(totalMaca>25 || kqMaca>8){
            System.out.println("O valor da maça será "+(totalMaca-(25/totalMaca)*100));
        }else{
            System.out.println("O valor da maça será "+(totalMaca));
        }

        if(totalMorango>25 || totalMorango>8){
            System.out.println("O valor do morango será "+(totalMorango-(25/totalMorango)*100));
        }else{
            System.out.println("O valor do morango será "+(totalMorango));
        }
    }
}
