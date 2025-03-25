package abstracao;

public class Main {
    public static void main(String[] args) {
        Carro onix = new Carro("Onix", "Chevrolet",
                11111111, "Vermelho", 2024);


        System.out.println("Nome: " + onix.getNome());
        System.out.println("Marca: " + onix.getMarca());
        System.out.println("Placa: " + onix.getPlaca());
        System.out.println("Cor: " + onix.getCor());
        System.out.println("Ano: " + onix.getAno());

        onix.acelerar();
        onix.LigarRadio();
    }
}
