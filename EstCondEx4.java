import java.util.Scanner;

public class EstCondEx4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int horaInicial, horaFinal;
        int duracao;

        horaInicial = ler.nextInt();
        horaFinal = ler.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou " + duracao + " hora(s)");

        ler.close();
    }
}