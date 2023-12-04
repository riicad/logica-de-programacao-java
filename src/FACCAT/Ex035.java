package FACCAT;
import java.util.Scanner;

//Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da
//seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
//que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.
public class Ex035 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Litros que você deseja comprar: ");
        double litrosVendidos = leia.nextDouble();

        System.out.println("Qual tipo de combustivel? (G/A) ");
        String tipoCombustivel = leia.next();

        leia.close();

        if(tipoCombustivel.toLowerCase()=="g"){
            System.out.println("O valor a ser pago pelo cliente é: "+(litrosVendidos*3.30));
        }
        else if(tipoCombustivel.toLowerCase()=="a"){
            System.out.println("O valor a ser pago pelo cliente é: "+(litrosVendidos*2.90));
        }
        else {
            System.out.println("Tipo de gasolina invalido");
        }
    }
}
