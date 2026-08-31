
public class ProcessoView
{
    public void ExibirLista(string msg, List<Processo> lista)
    {
        Console.WriteLine($"\n --- {msg} ---");
        foreach (Processo item in lista)
        {
            Console.WriteLine(item);
        }
    }
}