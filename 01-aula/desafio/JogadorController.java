
import java.util.ArrayList;
import java.util.Scanner;

public class JogadorController {

    private final JogadorService service;
    private final JogadorView view;

    public JogadorController(JogadorService _service, JogadorView _view) {
        service = _service;
        view = _view;
    }

    public void run() {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {

            menu();
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:

                    Boolean retorno = service.validarLista();
                    
                    if (retorno)
                        System.out.println(view.Sucesso());
                    else 
                        System.out.println(view.Falha());
                    break;

                case 2:

                    ArrayList<JogadorModel> jogadores = service.retornaLista();
                    
                    view.MostrarDados(jogadores);
                    break;

                case 3:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Entrada invalida!");
                    break;
            }

        } while (opcao != 3);
        sc.close();
    }


    public void menu() {
        System.out.println("[1] Carregar arquivo");
        System.out.println("[2] Mostrar dados carregador");
        System.out.println("[3] Sair");
        System.out.print("Opção: ");
    }
}
