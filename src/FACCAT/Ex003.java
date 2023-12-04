package FACCAT;

// Os pares de instruções abaixo produzem o mesmo resultado?
public class Ex003 {
    public static void main(String[] args){
        double a = (4/2)+(2/4);
        double b = 4*(2/2)*4;

        System.out.println("O valor das variaveis antes: a: "+a+" b: "+b);

        double c = b;
        b = a;
        a = c;

        System.out.println("Troca de valores: a"+a+" b: "+b);
    // não possuem.
    }
}
