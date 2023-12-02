package mais;

public class Ex040 {
    public static void main(String[] args){
        int[] lista = {1, 2, 3, 4, 5, 6};

        int maior = lista[1];
        int segundoMaior = lista[0];
        for (int i : lista){
            if (maior<i){
                segundoMaior = maior;
                maior = i;
            }
        }
        System.out.println(segundoMaior);

    }
}
