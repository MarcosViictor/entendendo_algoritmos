package POO;

public class Uzumaki extends ninja{
    String nivelChacara;

    public Uzumaki(String nome, String aldeia, int idade, int nivelChacara){
        super(nome, aldeia, idade, nivelChacara);

    }

    public void ChacaraIfnito(){
        System.out.println("Chacara infinito");
    }


    @Override
    public void AtaqueBasico(){
        System.out.println("Eu sou um Uzumaki e taquei uma kunai de Ar!");
    }
}
