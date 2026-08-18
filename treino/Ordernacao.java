public class Ordernacao {

    public static void main(String[] args) {
        selecao();
    }


    public static void selecao() {
        
        int[] numeros = new int[] {5, 8, 2, 3, 1, 25, 20, 19};
        int menor, x, i, j;

        for (i = 0; i < numeros.length - 1; i++) {
            
            menor = i;
            x = numeros[i];

            for (j = i + 1; j < numeros.length; j++) {
                
                if (numeros[j] < x) {
                    menor = j;
                    x = numeros[menor];
                }
            }
            numeros[menor] = numeros[i];
            numeros[i] = x;
        }

        for (int a = 0; a < numeros.length; a++) {
            System.out.printf("%5d", numeros[a]);
        }
    }
}
