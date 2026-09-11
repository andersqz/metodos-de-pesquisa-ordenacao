

public class Main {
    public static void main(String[] args) {

        int[] vetor =  new int[] { 5, 2, 3 ,1, 8};

        boolean houveTroca;
        int auxiliar;

            do {
                houveTroca = false;

                for (int j = 0; j < 4; j++) {

                    if (vetor[j] > vetor[j+1]) {
                        auxiliar = vetor[j];
                        vetor[j] = vetor[j+1];
                        vetor[j+1] = auxiliar;
                        houveTroca = true;
                    }
                }
                
            } while (houveTroca);
        }
    
            System.out.println("\nvetor ordenado:\n");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "");
        }
    }
}