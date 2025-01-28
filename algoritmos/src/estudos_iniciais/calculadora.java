package estudos_iniciais;

public class calculadora {
    public static int somar(int a, int b){
        return a +b;
    }

    public static void main(String[] args){
        int resultado = somar(3, 2);
        System.out.println("O resultado da soma é: " + resultado);
    }
}
