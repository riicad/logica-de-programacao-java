package FACCAT;
import java.util.Scanner;

//Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
//brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
//de eleitores
public class Ex008 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a quantidade de votos nulos: ");
        int votosNulos = leia.nextInt();

        System.out.println("Digite a quantidade de votos em branco: ");
        int votosBrancos = leia.nextInt();

        System.out.println("Digite a quantidade de votos validos: ");
        int votosValidos = leia.nextInt();

        leia.close();

        int totalVotos = votosNulos+votosBrancos+votosValidos;

        System.out.println("O total de votos válidos é: "+totalVotos);
        System.out.println("A porcentagem de votos em branco é "+(votosBrancos/totalVotos) * 100);
        System.out.println("A porcentagem de votos em nulo é "+(votosNulos/totalVotos) * 100);
        System.out.println("A porcentagem de votos em validos é "+(votosValidos/totalVotos) * 100);

    }
}
