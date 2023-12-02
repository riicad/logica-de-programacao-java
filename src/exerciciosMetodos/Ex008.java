package exerciciosMetodos;

public class Ex008 {
    static int encontrarMaiorElemento(int[][] matriz){
        int maior = 0;
        for (int linhas = 0; linhas<matriz.length; linhas++){
            for(int colunas = 0; colunas<matriz[linhas].length; colunas++){

                if(matriz[linhas][colunas]>maior){
                    maior = matriz[linhas][colunas];
                }

            }
        }
        return maior;
    }

    public static void main(String[] args){
        int[][] matrizNumeros = {{1, 3}, {6, 4}, {12, 4}};
        System.out.println(encontrarMaiorElemento(matrizNumeros));
    }
}
