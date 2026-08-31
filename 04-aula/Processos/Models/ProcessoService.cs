

public class ProcessoService
{
    public void OrdenarBolha(List<Processo> lista)
    {
        Processo tmp;
        bool houveTroca;

        do
        {
            houveTroca = false;

            for (int i = 0; i < lista.Count - 1; i++)
            {
                if (lista[i].CompareTo(lista[i + 1]) > 0)
                {
                    tmp = lista[i];
                    lista[i] = lista[i + 1];
                    lista[i + 1] = tmp;

                    houveTroca = true;
                }
            }
        } while (houveTroca);
    }


    public void Popular(List<Processo> lista, int quantidade)
    {
        Random gerador = new Random();

        for (int i = 0; i < quantidade; i++)
        {
            lista.Add(new Processo(gerador.Next(100, 500), $"gerando uma string {gerador.Next(quantidade)}"));
        }
    }
}