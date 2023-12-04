package FACCAT;

// retire os parenteses da operação ((-12)*(-4))+(3*(-4))
public class Ex004 {
    public static void main(String[] args){
        int a = -12*-4;
        int b = 3*-4;
        int c = a+b;

        System.out.println("O valor é: "+((-12)*(-4))+(3*(-4)));
        System.out.println("O valor é"+c);
    }
}
