public class Pelicula {
        private String nombre;
        private int fechaLanzamiento;
        private int duracionEnMinutos;
        private boolean incluidoPlan;
        private double sumaEvaluaciones;
        private int totalEvaluaciones;

        void muestraFichaTecnica(){
            System.out.println("nombre de la película: " + nombre);
            System.out.println("Fecha de lanzamiento: " + fechaLanzamiento);
            System.out.println("Duración en minutos: " + duracionEnMinutos);
            System.out.println("Incluido en el plan: " + incluidoPlan);
        }

        void evalua(double nota){
            sumaEvaluaciones += nota;
            totalEvaluaciones++;
        }

        double calculaMedia(){
            return sumaEvaluaciones / totalEvaluaciones;
        }

    public String getNombre(String nombre) {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaLanzamiento(int fechaLanzamiento) {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getDuracionEnMinutos(int duracionEnMinutos) {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public boolean isIncluidoPlan() {
        return incluidoPlan;
    }

    public void setIncluidoPlan(boolean incluidoPlan) {
        this.incluidoPlan = incluidoPlan;
    }

    public double getSumaEvaluaciones() {
        return sumaEvaluaciones;
    }

    public void setSumaEvaluaciones(double sumaEvaluaciones) {
        this.sumaEvaluaciones = sumaEvaluaciones;
    }

    public int getTotalEvaluaciones() {
        return totalEvaluaciones;
    }

    public void setTotalEvaluaciones(int totalEvaluaciones) {
        this.totalEvaluaciones = totalEvaluaciones;
    }
}
