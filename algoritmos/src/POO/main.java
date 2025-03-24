package POO;

public class main {
    public static void main(String[] args) {
        // Objeto 1
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Folha", 16, 500);
        naruto.AtaqueBasico();
        naruto.ChacaraIfnito();


        // Objeto 2
       Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Folha", 16, 4,"sharigan nivel 2");
       sasuke.AtaqueBasico();
       sasuke.AtaqueBasico(sasuke.getNivelChacara());
    }
}
