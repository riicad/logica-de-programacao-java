package exerciciosProgramacaoOrientadaObjetos;

public class Ex007 {
    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();

        minhaAgenda.adicionarContato("Rian", "33887623");
        minhaAgenda.adicionarContato("Clovis", "7773332");
        minhaAgenda.adicionarContato("Bruna", "1193232323");

        minhaAgenda.exibirContatos();

        minhaAgenda.removerContato("Clovis");

        minhaAgenda.exibirContatos();
    }

}
