package Lista8_desafio_livre;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int consumo, cont = 15;
        double calculadora = 35;
        System.out.println("Digite o consumo de agua mensal abaixo");
        do {
            consumo = scan.nextInt();
            if (consumo <= 15 && consumo >= 0) {
                System.out.println("O valor que vocé devera pagar por esse consumo mensal e de R$35,00");
            } else if (consumo > 15 & consumo <= 30) {

                while (cont < consumo) {
                    cont++;
                    calculadora = calculadora + 4.5;
                }
                System.out.printf("O total que vocé devera pagar esse mes é R$%.2f%n", calculadora);
            } else if (consumo > 30) {
                while (cont < 30) {
                    cont++;
                    calculadora = calculadora + 4.5;
                }
                while (cont < consumo) {
                    cont++;
                    calculadora = calculadora + 7;
                }
                System.out.printf("O total que vocé devera pagar esse mes é R$%.2f%n", calculadora);
            }
            cont = 15;
            calculadora = 35;
            System.out.println("Digite o valor do proximo consumo mensal abaixo");
        } while (consumo != 0);
        System.out.println("Calculadora de Faturas de Água encerrada ...");
        scan.close();
    }
}
