package Lista8_desafio_livre;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int loop=0;
        System.out.println("Digite um numero inteiro positivo: ");
        int a = scan.nextInt();
        do {
            a =(a %2==0)?a/2:a*3+1;
            loop++;
        }while (a > 1);
        System.out.println("Teve um total de "+loop+" passos matematicos");

        scan.close();
    }
}
