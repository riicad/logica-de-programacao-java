package mais;

//programa que calcule a média de um array de números
public class Ex009 {
    public static void main(String[] args){
        int[] lista = {50, 25, 25, 0};

        int somaTudo = 0;
        for(int i = 0; i<lista.length; i++){
            somaTudo += lista[i];
        }

        System.out.println("A MÉDIA desse array é "+(somaTudo/ lista.length));

    }
}
