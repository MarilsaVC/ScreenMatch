public class Desiciones {

    public static void main(String[] args) {

        int fechaLanzamiento  = 1999;
        boolean incluidoPlan = false;
        double calificacion = 8.2;
        String plan = "plus";

        if (fechaLanzamiento >= 2022){
            System.out.println("Peliculas mas populares");
        }else {
            System.out.println("Películas retro que aún valen la pena ver");
        }

        if (incluidoPlan || plan.equals("plus")){
            System.out.println("Disfrute de su pelicula!");
        }else {
            System.out.println("No incluido en el plan actual");
        }
    }
}
