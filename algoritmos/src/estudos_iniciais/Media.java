package estudos_iniciais;

import  java.util.Scanner;

public class Media {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua Avp1: ");
        double avp1 = scanner.nextDouble();

        System.out.println("Digite sua Avp2");
        double avp2 = scanner.nextDouble();

        double media = (avp1 + avp2) / 2;

        if (media >= 7){
            System.out.println("Media = " + media + " , Aprovado!");
        } else if (media >= 4 && media < 7){
            System.out.println("Media = " + media + " , AVF!");
        } else if (media < 4) {
            System.out.println("Media = " + media + " , Reprovado!");
        }


        scanner.close();
    }
}