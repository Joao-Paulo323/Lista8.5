package Lista8_desafio_livre;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double cresA, cidadeA = 50000, cidadeB = 150000;
        int loop = 0;
        System.out.println("Digite a porcentagem do crescimento da cidade A");
        cresA = scan.nextDouble();
        while (cresA <=0){
            System.out.println("Digite uma porcentagem valida");
            cresA = scan.nextDouble();
        }
        do {
            cidadeA = ((cresA / 100) * cidadeA) + cidadeA;
            cidadeB = (0.015 * cidadeB) + cidadeB;
            loop++;
            if (loop % 5 == 0 | cidadeA - cidadeB < 10000) {
                System.out.println("Atenção: Cidades se aproximando em tamanho!");
            }
        } while (cidadeA < cidadeB);
        System.out.println("A cidade 'A' ultrapassou a cidade 'B' em " + loop + " anos");

        scan.close();
    }
}
