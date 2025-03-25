package abstracao;

public class Carro extends veiculo implements radio{

    private String nome;

    public Carro(String nome, String marca, int placa, String cor, int ano ){
        super(marca, placa, cor, ano);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void LigarRadio() {
        if(this.getAno() >= 2000){
            System.out.println("Radio ligado via bluetooth");
        }else if(this.getAno() < 2000 && this.getAno() >= 1900){
            System.out.println("radio ligado, manual");
        }
    }
}
