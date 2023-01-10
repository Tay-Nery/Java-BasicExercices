import java.util.Scanner;

public class EstCondEx1 {
    public static void main(String[] args) {
        int num;

        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva um numero");

        num = ler.nextInt();

        if (num >= 0) {
            System.out.println("O numero é inteiro");
        } else {
                System.out.println("O numero é negativo");
        }
        ler.close();
    }
}
