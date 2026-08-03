

public class Program {

    public static void main(String[] args) {

        JogadorRepository repository = new JogadorRepository();
        JogadorView view = new JogadorView();

        JogadorService service = new JogadorService(repository);
        JogadorController controller = new JogadorController(service, view);

        controller.run();
    }
}
