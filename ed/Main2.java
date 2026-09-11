public class Main2 {
    public static void main(String[] args) {
        
        int vetor[] = {3,6,2,1,8,4};
        
        boolean houveTroca;
        int aux;
        int qtdComparacoes = 0, qtdTrocas = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        do {

            houveTroca = false;
            for (int i = 0; i < vetor.length - 1; i++) {

                qtdComparacoes++;
                if (vetor[i] > vetor[i + 1]) {

                    qtdTrocas++;
                    houveTroca = true;
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                }
            }
        } while (houveTroca);
        System.out.println("Quantidade comparações: " + qtdComparacoes);
        System.out.println("Quantidade trocas: " + qtdTrocas);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
