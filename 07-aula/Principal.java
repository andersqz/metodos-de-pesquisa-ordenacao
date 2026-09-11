import java.util.ArrayList;

public class Principal {
 


    public static void exibeLista(ArrayList<Integer> lista) {

        for (int i : lista) {
            System.out.println(i + "");
        }
    }



    public static void main(String[] args) {
        
        Ordenacao ordenacao = new Ordenacao();
        Arquivo arquivo = new Arquivo("c:/anderson/numeros");
        ArrayList<Integer> lista = arquivo.leArquivo();
        int qtdNumeros = lista.size();

        long tempoInicial = System.nanoTime();
        lista = ordenacao.Bolha(lista);
        long tempoFinal = System.nanoTime();

        double tempoExecucaoMs = (tempoFinal - tempoInicial) / 1_000_000.0;

        System.out.println("qtd numeros: " + qtdNumeros);
        System.out.println("qtd trocas: " + ordenacao.getQtdTrocas());
        System.out.println("qtd comparacoeS: " + ordenacao.getQtdComparacao());
        System.out.println("Tempo de execucao: " + tempoExecucaoMs + "ms");
    }
}
