import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double media = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota que le das a la película Matrix");
            nota = teclado.nextDouble();
            media = media + nota;
        }

        System.out.println("Calificación de la película: " + media / 3);
    }
}
