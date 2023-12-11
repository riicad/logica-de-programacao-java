package AWT;
import java.awt.*;

public class ExemploJanela extends Frame {

    public ExemploJanela(){
        Button novoBotao = new Button("Clique Aqui");
        novoBotao.setBounds(30, 100, 80, 30);
        add(novoBotao);
        setSize(500, 500);
        setTitle("Primeiro Exemplo AWT");
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args){
        ExemploJanela frame = new ExemploJanela();
    }

}
