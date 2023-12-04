package FACCAT;


import java.util.Scanner;

// A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
//de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
//Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
//o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
//(considere que o mês possua 4 semanas exatas)
public class Ex022 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Horas trabalhadas no mes: ");
        int horaTrabalhada = leia.nextInt();

        System.out.println("Salario por hora: R$");
        double salarioPorhora = leia.nextDouble();

        leia.close();

        double salarioTotal;

        if(horaTrabalhada>40){
            //salario total é as 40 horas trablahas mais as horas trabalhas com acréscimo de 50%
            salarioTotal = (salarioPorhora*40)+(salarioPorhora+((50/salarioPorhora)*100)*(horaTrabalhada-40));
        }else{
            salarioTotal = (salarioPorhora*horaTrabalhada);
        }

        System.out.println("Seu salário total é: R$"+salarioTotal);
    }
}
