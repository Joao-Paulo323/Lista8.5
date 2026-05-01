package Lista8_desafio_livre;

public class Ex2 {
    public static void main(String[] args) {
        int a=0,b=1,cont=0,soma;
        System.out.println("");
        do {
            soma =a + b;
            a = b;
            b = soma;
            cont = (soma %2 !=0 & soma%3==0)?cont + soma:cont;
        }while (cont<50000);
        System.out.println("A soma final foi "+cont);



    }
}
