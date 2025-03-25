package abstracao;

abstract class veiculo {
    private String marca;
    private int placa;
    private String cor;
    private int ano;

    public veiculo(String marca, int placa, String cor, int ano) {
        this.marca = marca;
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public void Ligar(){
        System.out.println("Carro ligado!");
    }

    public void LigarFarois(){
        System.out.println("Farol ligados");
    }


    public void acelerar(){
        System.out.println("Acelerar!");
    }

    public void Frear(){
        System.out.println("Freio!");
    }


}
