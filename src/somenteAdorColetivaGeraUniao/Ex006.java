package somenteAdorColetivaGeraUniao;

//mprima os números de 1 a 10, pulando a impressão do número 5, usando continue.
public class Ex006 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            if (i != 5) {
                System.out.println(i);
                continue;
            }
        }
    }
}
