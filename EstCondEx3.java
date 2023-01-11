import java.util.Scanner;

public class EstCondEx3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int A,B;
        System.out.println("Digite o primeio numero");
        A = ler.nextInt();
        System.out.println("Digite o segundo numero");
        B = ler.nextInt();

        if(A % B == 0 || B % A == 0){
            System.out.println("São múltiplos");
        }else{
            System.out.println("Não são múltiplos");
        }

        ler.close();
    }
}