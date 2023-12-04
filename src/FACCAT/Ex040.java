package FACCAT;

import java.util.Scanner;

//Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço
//unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total
//a pagar (total a pagar = total - desconto), sabendo-se que:
//- Se quantidade <= 5 o desconto será de 2%
//- Se quantidade > 5 e quantidade <=10 o desconto será de 3%
//- Se quantidade > 10 o desconto será de 5%
public class Ex040 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String produto = leia.nextLine();

        System.out.println("Quantidade adquirida: ");
        int quantidadeProduto = leia.nextInt();

        System.out.println("Preço Unítario: ");
        double preco = leia.nextDouble();

        leia.close();

        int desconto = 0;
        if (quantidadeProduto<=5){
            desconto =2;
        }
        else if(quantidadeProduto>5 && quantidadeProduto<=10){
            desconto =3;
        }
        else{
            desconto = 5;
        }

        double total = (quantidadeProduto*preco);
        System.out.println("O total com desconto é: "+((total-(desconto/total)*100)));
    }
}
