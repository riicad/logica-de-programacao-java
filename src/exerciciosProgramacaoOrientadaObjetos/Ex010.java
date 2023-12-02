package exerciciosProgramacaoOrientadaObjetos;

public class Ex010 {
    public static void main(String[] args) {
        Empresa minhaEmpresa = new Empresa("Rianzebas", "1337"); // Exemplo de uma empresa

        minhaEmpresa.contratarFuncionario("Rubblez");
        minhaEmpresa.contratarFuncionario("Rian");

        minhaEmpresa.exibirInformacoesFuncionarios();

    }
}
