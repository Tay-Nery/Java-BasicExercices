import java.util.Scanner;

public class ExWhile2 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        float x = ler.nextFloat(), y = ler.nextFloat();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            else {
                System.out.println("quarto");
            }
            x = ler.nextInt();
            y = ler.nextInt();
        }
    }
}
