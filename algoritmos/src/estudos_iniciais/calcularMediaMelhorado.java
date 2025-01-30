package estudos_iniciais;
import java.util.Scanner;

public class calcularMediaMelhorado {

    public static double calcularMedia(double []notas){
        double soma = 0;

        for (double nota : notas){
            soma += nota;
        }
        return  soma / notas.length;
    }

    public static void verificarAprovacao(double media){
        if(media <= 6){
            System.out.println("Reprovado");
        }else{
            System.out.println("Aprovado");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de Notas: ");
        int quantidadesNotas = scanner.nextInt();

        double[] notas = new double[quantidadesNotas];

        for(int i = 0; i < quantidadesNotas; i++){
            while(true){
                System.out.println("Digite a Nota " + (i + 1) + ":");
                double nota = scanner.nextDouble();

                 if(nota >= 0 && nota <= 10){
                     notas[i] = nota;
                     break;
                 }else{
                     System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                 }
            }
        }

        double media = calcularMedia(notas);

        verificarAprovacao(media);

        scanner.close();
    }
}
