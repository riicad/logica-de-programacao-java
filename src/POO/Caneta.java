package POO;

public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampa;
    String tipo;
    String marca;

    void rabiscar() {
        if (this.tampa==true){
            System.out.println("A caneta está tampada, não pode rabiscar!");

        }else {
            System.out.println("Pode rabiscar!!");
        }
    }

    void tampar() {
        this.tampa = true;
    }

    void destampar(){
        this.tampa = false;
    }

    void estado() {
        System.out.println("Esta caneta é deste modelo "+this.modelo);
        System.out.println("Esta caneta é da cor "+this.cor);
        System.out.println("Esta caneta é da ponta "+this.ponta);
        System.out.println("Esta caneta tem esta carga "+this.carga+"%");
        System.out.println("Esta caneta é da marca "+this.marca);
        System.out.println("Esta caneta é deste tipo "+this.tipo);
    }

}
