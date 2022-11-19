import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        int x, y, soma;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        x = ler.nextInt();

        System.out.println("Digite outro numero inteiro");
        y = ler.nextInt();

        soma = x+y;
        System.out.println("A soma dos valores é: " + soma);
    }
}