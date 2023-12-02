package mais;

//mostra o maior e o menor número de um array
public class Ex012 {
    public static void main(String[] args){
        int[] listaNumeros = {10, 30, 40, 38, 22};

        int maior = listaNumeros[0];
        int menor = listaNumeros[0];

        for(int i = 0; i<listaNumeros.length; i++){
            if (listaNumeros[i]> maior){
                maior = listaNumeros[i];

            } else if (listaNumeros[i]<menor){
                menor = listaNumeros[i];
            }
        }

        System.out.println("O menor número do array é "+menor);
        System.out.println("O maior número do array é "+maior);
    }
}
