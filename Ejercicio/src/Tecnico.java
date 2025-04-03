public class Tecnico {

    private static int total_tecnicos = 0;
    private int id;
    private String nombre;
    private String especialidad;

    public Tecnico() {}

    public Tecnico(String nombre, String especialidad) {
        this.id = total_tecnicos++;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
