import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        int A,B,C,D;
        int DIFERENCA;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        A = ler.nextInt();

        System.out.println("Digite o segundo valor");
        B = ler.nextInt();

        System.out.println("Digite o terceiro valor");
        C = ler.nextInt();

        System.out.println("Digite o quarto valor");
        D = ler.nextInt();

        DIFERENCA = ((A*B)-(C*D));
        System.out.print("DIFERENCA = " + DIFERENCA);
    }
}