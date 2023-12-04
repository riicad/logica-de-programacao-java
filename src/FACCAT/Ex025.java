package FACCAT;
import java.util.Scanner;

//Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
//escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
//ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
public class Ex025 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Numero da conta: ");
        int conta = leia.nextInt();

        System.out.println("Saldo da saldo: R$");
        double saldo = leia.nextDouble();

        System.out.println("debito da conta: ");
        double debito = leia.nextDouble();

        System.out.println("credito da conta: ");
        int credito = leia.nextInt();

        leia.close();

        double saldoAtual =  saldo - debito + credito;

        if(saldoAtual>0){
            System.out.println("SALDO POSITIVO");
        }
        else{
            System.out.println("SALDO NEGATIVO");
        }
    }
}
