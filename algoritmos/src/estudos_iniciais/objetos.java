package estudos_iniciais;

class Carros{

    String marca;
    String modelo;

    public Carros(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibiInfo(){
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ".");
    }
}

public class objetos {
    public  static  void main(String[] args){
        Carros meuCarro = new Carros("Ferrari", "F40");
        meuCarro.exibiInfo();
    }
}
