package FACCAT;
import java.util.Scanner;

//42) Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para
//estar em condições, um dos seguintes requisitos deve ser satisfeito:
//- Ter no mínimo 65 anos de idade.
//- Ter trabalhado no mínimo 30 anos.
//- Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
public class Ex042 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Ano de nascimento: ");
        int anoNasc = leia.nextInt();

        System.out.println("Ano de ingresso na empresa: ");
        int anoEmpresa = leia.nextInt();

        System.out.println("Código do empregado: ");
        int codigoPessoa = leia.nextInt();

        leia.close();

        if(2023-anoNasc>=65 || 2023-anoEmpresa>=30 || 2023-anoNasc>=60 && 2023-anoEmpresa>=25){
            System.out.printf("O usuário %d DEVE REQUERER APOSENTADORIA", codigoPessoa);
        }
        else{
            System.out.printf("O usuário %d NÃO DEVE REQUERER A APOSENTADORIA", codigoPessoa);
        }

    }
}
