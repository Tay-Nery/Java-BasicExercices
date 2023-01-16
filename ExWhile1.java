import java.util.Scanner;

public class ExWhile1 {
    public static void main(String[] args){
       Scanner ler = new Scanner(System.in);
       int senha = ler.nextInt();


       while(senha != 2023){
           System.out.println("Senha inválida");
           senha = ler.nextInt();
       }
       System.out.println("Acesso permitido");
       ler.close();
    }
}
