

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class JogadorRepository {

    public ArrayList<JogadorModel> popularLista(String path) {

        ArrayList<JogadorModel> jogadores = new ArrayList<JogadorModel>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            String linha;
            while ((linha = br.readLine()) != null) {

                String[] dados = linha.split(";");

                String nome = dados[0].trim();
                String time = dados[1].trim();
                String nacionalidade = dados[2].trim();

                jogadores.add(new JogadorModel(nome, time, nacionalidade));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return jogadores;
    }
}
