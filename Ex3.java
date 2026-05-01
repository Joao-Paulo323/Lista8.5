package Lista8_desafio_livre;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota1,nota2,nota3,maior,menor,medio,media;

        System.out.println("Digite as tres notas do aluno abaixo");
        do{
            nota1 = scan.nextDouble();
            nota2 = scan.nextDouble();
            nota3 = scan.nextDouble();
            if (nota1 >= 0 & nota2 >= 0 & nota3 >= 0){
            maior = (nota1 > nota2 & nota1 > nota3) ? nota1:
                    (nota2>nota3)?nota2:nota3;
            menor = (nota1 < nota2 & nota1 < nota3) ? nota1:
                    (nota2<nota3)?nota2:nota3;
            medio = (nota1!=maior & nota1!=menor)?nota1:
                    (nota2 !=maior & nota2 != menor)?nota2:nota3;

            media = (maior*5) + (medio * 3) + (menor*2);
            media = media/10;
            if (nota1 > 4 && nota2 > 4 &nota3 > 4 & media >=7){
                System.out.println("Aprovado especial sua media foi de "+media);

            }else {
                System.out.println("Não se qualificou");
            }
            System.out.println("Digite as  tres notas do proximo aluno abaixo");}
        }while (nota1 >= 0 & nota2 >= 0 & nota3 >= 0);
        System.out.println("Progama encerrado");
        scan.close();
    }
}
