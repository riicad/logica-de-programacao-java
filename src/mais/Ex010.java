package mais;

// cria algoritmo de pesquisa binário
public class Ex010 {

    public static void main(String[] args){
        int lista[] = { 2, 3, 4, 10, 40 };
        int n = lista.length;
        int x = 10;

        int result = Binario(lista, 0, n - 1, x);

        if (result == - 1){
            System.out.println("Elemento não está presente no array.");
        } else {
            System.out.println("Elemento encontrado no índice: " + result);
        }

    }

    static int Binario(int lista[], int left, int right, int x){
        if (right >= left){
            int mid = left + (right - left) / 2;

            if (lista[mid] == x){
                return mid;
            }

            if (lista[mid] > x){
                return Binario(lista, left, mid - 1, x);
            }

            return Binario(lista, mid + 1, right, x);
        }

        return - 1;
    }

}