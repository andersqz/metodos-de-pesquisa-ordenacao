import java.util.ArrayList;

public class Ordenacao {
    
    private int qtdTrocas = 0;
    private int qtdComparacao = 0;

    public ArrayList<Integer> Bolha(ArrayList<Integer> lista) {

        int temp;
        boolean houveTroca;

        do {

            houveTroca = false;
            for (int i = 0; i < lista.size() - 1; i++) {

                qtdComparacao++;
                if (lista.get(i) > lista.get(i + 1)) {
                    houveTroca = true;
                    qtdTrocas++;

                    temp = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, temp);
                }
            }
            
        } while (houveTroca);

        return lista;
    }


    public int getQtdTrocas() {
        return this.qtdTrocas;
    }

    public int getQtdComparacao() {
        return this.qtdComparacao;
    }
}
