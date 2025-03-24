package POO;

public class Uchiha extends ninja {
    String nivelSharigan;

    public Uchiha(String nome, String aldeia, int idade, int nivelChacara, String nivelSharigan){
        super(nome, aldeia, idade, nivelChacara);
        this.nivelSharigan = nivelSharigan;
    }


    public void shariganAtivado(){
        System.out.println("Sharigan Ativado");
    }


    @Override
    public void AtaqueBasico(){
        System.out.println("Eu sou um Uchiha e taquei uma kunai de fogo!");
    }
    public void AtaqueBasico(int nivelchacara){
        if (nivelchacara >=  3){
            System.out.println("Suzano Ativado");
        }else if(nivelchacara >= 1 && nivelchacara <= 2){
            System.out.println("Só ativei o sharigan");
        }else{
            System.out.println("Chacara indisponivel");
        }
    }
}
