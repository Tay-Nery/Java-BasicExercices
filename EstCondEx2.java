import java.util.Scanner;

public class EstCondEx2 {
    public static void main(String[] args) {
        int num;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        num = ler.nextInt();

        if(num %2 == 0){
            System.out.println("O numero é par!");
        }else{
            System.out.println("O numero é impar!");
        }
        ler.close();
    }
}