package estudos_iniciais;
import java.util.Scanner;

// Solicitar quantas notas o usuário quer solicitar
// Função que faz o calculo da media


public class calculadoraMedia {

    public static double calculoMedia(double[] notas){
        double soma = 0;
        for(double nota : notas){
            soma += nota;
        }
        return soma / notas.length;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas que você quer: ");
        int quantidadeNotas = scanner.nextInt();
        double [] notas = new double[quantidadeNotas];

        for(int i = 0; i < quantidadeNotas; i++){
            System.out.println("Digite a nota: " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double media = calculoMedia(notas);

        if (media <= 6){
            System.out.printf("Com a média: %.2f, você foi reprovado!%n", media);;
        }else{
            System.out.printf("Com a média: %.2f, você foi aprovado!%n", media);
        }

        scanner.close();

    }



}
