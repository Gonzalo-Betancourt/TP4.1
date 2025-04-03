import java.time.LocalDateTime;

public class TicketSoporte {

    private static int total_tickets = 0;
    private int id;
    private Usuario usuario;
    private String descripcion;
    private EstadoTicket estado;
    private LocalDateTime fechaCreacion;
    private Tecnico tecnicoAsignado = null;

    public TicketSoporte() {
        this.id = total_tickets++;
        this.estado = EstadoTicket.ABIERTO;
        this.fechaCreacion = LocalDateTime.now();
    }

    public TicketSoporte(Usuario usuario) {
        this.id = total_tickets++;
        this.usuario = usuario;
        this.estado = EstadoTicket.ABIERTO;
        this.fechaCreacion = LocalDateTime.now();
    }

    public TicketSoporte(String descripcion, Usuario usuario) {
        this.id = total_tickets++;
        this.usuario = usuario;
        this.descripcion = descripcion;
        this.estado = EstadoTicket.ABIERTO;
        this.fechaCreacion = LocalDateTime.now();
    }

    public void cerrarTicket(){
        this.estado = EstadoTicket.CERRADO;
        System.out.println("El ticket con id: " + this.id + " cambio su estado a cerrado.");
    }

    public void asignarTecnico(Tecnico tecnicoAsignado) {
        this.tecnicoAsignado = tecnicoAsignado;
        this.estado = EstadoTicket.EN_PROCESO;
    }

    @Override
    public String toString() {
        return "Ticket id : " + id + " {\n"
                + "\t- Descripción: " + descripcion + "\n"
                + "\t- Estado: " + estado + "\n"
                + "\t- Fecha de creación: " + fechaCreacion + "\n"
                + "\t- Tecnico: " + (tecnicoAsignado != null ? tecnicoAsignado : "No asignado") + "\n}";
    }

}