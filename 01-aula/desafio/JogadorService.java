

import java.util.ArrayList;

public class JogadorService {

    private final JogadorRepository repository;

    public JogadorService(JogadorRepository _repository) {
        repository = _repository;
    }

    public Boolean validarLista() {
        ArrayList<JogadorModel> jogadores = repository.popularLista("jogadores.txt");

        if (jogadores.isEmpty())
            return false;
        return true;
    }

    public ArrayList<JogadorModel> retornaLista() {
        return repository.popularLista("jogadores.txt");
    }
}
