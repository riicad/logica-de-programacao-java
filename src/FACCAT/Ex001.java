package FACCAT;

//1) Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em uma variável B.
//A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o
//valor que está em A passe para B e vice-versa. Ao final, escrever os valores que ficaram armazenados
//nas variáveis.
public class Ex001 {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        System.out.println("O valor das variaveis antes: a: "+a+" b: "+b);

        int c = b;
        b = a;
        a = c;

        System.out.println("Troca de valores: a"+a+" b: "+b);

    }
}
