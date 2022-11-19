import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args){
        double raio, area;
        double pi = 3.14159;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor do raio");
        raio = ler.nextDouble();

        area = pi*(raio*raio);

        System.out.printf("A= %.4f%n" , area);

        ler.close();
    }
}