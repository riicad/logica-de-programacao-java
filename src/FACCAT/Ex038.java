package FACCAT;
import java.util.Scanner;

//Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja
//diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a
//mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se
//esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a
//senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’
public class Ex038 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("User: ");
        int user = leia.nextInt();

        if(user==1234){
            System.out.println("Senha: ");
            int senha = leia.nextInt();

            if(senha==9999){
                System.out.println("ACESSO PERMITIDO");
            }else{
                System.out.println("SENHA INVÁLIDA");
            }
        }
        else{
            System.out.println("USUÁRIO INVÁLIDO");
        }
    }
}
