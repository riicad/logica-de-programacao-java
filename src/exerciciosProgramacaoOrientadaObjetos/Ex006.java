package exerciciosProgramacaoOrientadaObjetos;

public class Ex006 {
    public static void main(String[] args){
        Triangulo novoEquilatero = new Triangulo();

        novoEquilatero.setLadoA(5);
        novoEquilatero.setLadoB(5);
        novoEquilatero.setLadoC(5);

        novoEquilatero.verificarTriangulo();
        System.out.println(novoEquilatero.areaTriangulo());
    }
}
