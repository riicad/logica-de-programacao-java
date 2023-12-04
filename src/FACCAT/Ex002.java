package FACCAT;

//Analise os algoritmos abaixo e diga o que será impresso na tela ao serem executados
public class Ex002 {
        public static void main(String[] args){
            int a = 30;
            int b = 10;

            System.out.println("O valor das variaveis antes: a: "+a+" b: "+b);

            int c = b;
            b = a;
            a = c;

            System.out.println("Troca de valores: a"+a+" b: "+b);

        }

}
