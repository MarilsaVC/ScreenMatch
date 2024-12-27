import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu película favorita");
        String pelucula = teclado.nextLine();
        System.out.println("Escribe la fecha de lanzamiento");
        int fechaDelanzamiento = teclado.nextInt();
        System.out.println("Calificación");
        double nota = teclado.nextDouble();

        System.out.println(pelucula);
        System.out.println(fechaDelanzamiento);
        System.out.println(nota);
    }
}
