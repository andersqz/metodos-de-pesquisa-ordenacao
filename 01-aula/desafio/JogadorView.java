

import java.util.ArrayList;

public class JogadorView {

    public String Sucesso() {
        return "Lista carregada com sucesso!";
    }

    public String Falha() {
        return "Falha em carregar a lista!";
    }

    public void MostrarDados(ArrayList<JogadorModel> jogadores) {
        for (JogadorModel j : jogadores) {
            System.out.println(j);
        }
    }
}
