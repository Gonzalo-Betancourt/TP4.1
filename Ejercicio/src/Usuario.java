import java.util.ArrayList;

public class Usuario {

    private static int total_usuarios = 0;
    private int id;
    private String nombre;
    private String email;
    private ArrayList<TicketSoporte> ticketsUsuario = new ArrayList<>();

    public Usuario(String nombre, String email) {
        this.id = total_usuarios++;
        this.nombre = nombre;
        this.email = email;
    }

    public void agregarTicket(TicketSoporte ticket) {
        if (ticketsUsuario == null) {
            ticketsUsuario = new ArrayList<>();
        }
        ticketsUsuario.add(ticket);
    }

    public void mostrarTicketsUsuario() {
    if (ticketsUsuario != null && !ticketsUsuario.isEmpty()) {
        for (TicketSoporte ticket : ticketsUsuario) {
            System.out.println(ticket);
        }
    } else {
        System.out.println("El usuario no tiene tickets.");
    }
}

    @Override
     public String toString() {
        return ("Usuario id : " + id + " {\n"
                + "\t- Nombre: " + nombre + "\n"
                + "\t- Email: " + email + "\n"
                + "\t- Tickets creados: \n" + ticketsUsuario + "\n}");
    }
}
