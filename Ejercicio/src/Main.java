public class Main {

    public static void main(String[] args) {

        // Creo los usarios y tres tickets usando los distintos constructores
        Usuario usuario1 = new Usuario("Martin", "martin111@gmail.com");
        SistemaSoporte.crearTicket(usuario1);
        SistemaSoporte.crearTicket("Error 201", usuario1);

        Usuario usuario2 = new Usuario("Pedro", "pedro112@gmail.com");
        SistemaSoporte.crearTicket(usuario2);

        // Se imprime el usuario 1 y 2, luego se utiliza el metodo listar tickets de la clase Sistema
        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(SistemaSoporte.listarTickets());

        // Se agrega un tecnico a traves de el id del ticket y el ticket asignado pasa a estar en proceso
        Tecnico tecnico1 = new Tecnico("Pablo", "Programador");
        SistemaSoporte.asignarTecnico(0, tecnico1);
        System.out.println(usuario1);

        // Se cierra el ticket
        SistemaSoporte.cerrarTicket(0);
        System.out.println(usuario1);

    }
}