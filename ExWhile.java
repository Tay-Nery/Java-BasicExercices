import java.util.Scanner;

public class ExWhile {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        int soma = 0;

        System.out.print("Digite um numero inteiro");
        num = ler.nextInt();

        while (num != 0){
            soma = soma +num; // outra forma -> soma = +=x;
            num = ler.nextInt();
        }
        System.out.println("A soma é:" + soma);

        ler.close();
    }
}
