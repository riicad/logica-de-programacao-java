package FACCAT;
import java.util.Scanner;

//O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
//distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
//seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
//calcular e escrever o custo final ao consumidor.
public class Ex010 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor do custo de fábrica de um carro: R$");
        double custoFabrica = leia.nextDouble();

        leia.close();

        double distribuidor = (28/custoFabrica)*100;
        double imposto = (45/custoFabrica)*100;

        System.out.println("O valor total do seu carro é: R$"+custoFabrica+distribuidor+imposto);
    }
}
