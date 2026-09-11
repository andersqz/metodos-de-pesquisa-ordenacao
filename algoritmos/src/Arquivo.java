
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Arquivo {
    private String nomeArquivo;

    private ArrayList<Integer> lista;

    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        lista = new ArrayList<>();
    }

    public ArrayList<Integer> leArquivo() {
        lista.clear();

        try (BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo + ".txt"))) {

            String linha;

            while ((linha = leitor.readLine()) != null) {

                lista.add(Integer.parseInt(linha));
            }
        } 
        catch (FileNotFoundException e) {

            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
