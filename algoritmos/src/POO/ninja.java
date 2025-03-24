package POO;

public class ninja {
    // Definindo os atributos do meu objeto.
    private String nome;
    private String aldeia;
    private int idade;
    private int nivelChacara;

    // Construtor
    public ninja(String nome, String aldeia, int idade, int nivelChacara){
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.nivelChacara = nivelChacara;
    }



    // Criar Getter
    public String getNome(){
        return  nome;
    }

    public String getAldeia(){
        return  aldeia;
    }

    public int getIdade(){
        return idade;
    }

    public int getNivelChacara(){
        return nivelChacara;
    }

    // criando setter
    public void setNome(String nome){
        nome = this.nome;
    }

    public void setAldeia(String aldeia){
        aldeia = this.aldeia;
    }

    public void setIdade(int idade){
        idade = this.idade;
    }



    public void setNivelChacara(int nivelChacara){
        this.nivelChacara = nivelChacara;
    }
    public void AtaqueBasico(){
        System.out.println("Eu sou um ninja e taquei uma kunai!");
    }

}
