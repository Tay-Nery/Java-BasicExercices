import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {

        int numFuncionario;
        double valorPorHora, horasTrabalhadas, salarioFuncionario;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o seu numero de funcionário");
        numFuncionario = ler.nextInt();

        System.out.println("Digite o seu numero de horas trabalhadas");
        horasTrabalhadas = ler.nextDouble();

        System.out.println("Digite o valor da sua hora trabalhada");
        valorPorHora = ler.nextDouble();

        salarioFuncionario = valorPorHora*horasTrabalhadas;

        System.out.println("Numero: " + numFuncionario);
        System.out.printf("Salário: R$ %.2f%n" , salarioFuncionario);

        ler.close();
    }
}
