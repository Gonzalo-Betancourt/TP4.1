import java.util.ArrayList;

public class SistemaSoporte {

    private static ArrayList<TicketSoporte> tickets = new ArrayList<>();

    public static void crearTicket(Usuario usuario){
        TicketSoporte ticket = new TicketSoporte(usuario);
        tickets.add(ticket);
        usuario.agregarTicket(ticket);
    }

    public static void crearTicket(String descripcion, Usuario usuario){
        TicketSoporte ticket = new TicketSoporte(descripcion, usuario);
        tickets.add(ticket);
        usuario.agregarTicket(ticket);
    }

    public static void asignarTecnico(int id_ticket, Tecnico tecnico) {
        if (id_ticket >= 0 && id_ticket < tickets.size()) {
            TicketSoporte ticket = tickets.get(id_ticket);
            ticket.asignarTecnico(tecnico);
        } else {
            System.out.println("ID de ticket inválido.");
        }
    }

    public static void cerrarTicket(int id_ticket) {
        if (id_ticket >= 0 && id_ticket < tickets.size()) {
            TicketSoporte ticket = tickets.get(id_ticket);
            ticket.cerrarTicket();
        } else {
            System.out.println("ID de ticket inválido.");
        }
    }


    public static String listarTickets() {
        return tickets.isEmpty() ? "No hay tickets registrados." : "Tickets: " + tickets;
    }

}
