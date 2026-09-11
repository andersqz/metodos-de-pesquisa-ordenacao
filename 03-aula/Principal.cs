using System;
using System.Diagnostics;


class Ordenacao
{
    public static void Bolha(List<int> lista)
    {        
        bool houveTroca;
        int tmp;
        int qtdComparacoes = 0, qtdTrocas = 0;

        do
        {
            houveTroca = false;
            for (int i = 0; i < lista.Count() - 1; i++)
            {
                qtdComparacoes++;
                if (lista[i] > lista[i + 1])
                {
                    qtdTrocas++;
                    houveTroca = true;
                    tmp = lista[i];
                    lista[i] = lista[i + 1];
                    lista[i + 1] = tmp;
                }
            }
        } while (houveTroca);
        Console.WriteLine("Quantidades comparações: " + qtdComparacoes);
        Console.WriteLine("Quantidade trocas: " + qtdTrocas);
    }





}

class Util
{

    public static void PopularLista(List<int> lista, int quantidade)
    {
        Random gerador = new Random();
        for (int i = 0; i < quantidade; i++)
        {
            lista.Add(gerador.Next(100000));
        }
    }

    public static void ExibirLista(List<int> lista)
    {
        foreach (int item in lista)
        {
            Console.WriteLine(item);
        }
    }

    public static void ExibirTempo(Stopwatch sw, string frase)
    {
        Console.WriteLine(frase + " (ms): " + sw.ElapsedMilliseconds);
    }
}

public class Principal
{
    public static void Main(string[] args)
    {
        List<int> listaBolha = new List<int>();
        List<int> listaSelecao = new List<int>();
        List<int> listaInsercao = new List<int>();
        List<int> listaSort = new();

        Stopwatch sw = new Stopwatch();
        int quantidade;

        try
        {
            Console.Write("Quantos números deseja trabalhar? ");
            quantidade = int.Parse(Console.ReadLine()!);

            Util.PopularLista(listaBolha, quantidade);
            Util.PopularLista(listaSelecao, quantidade);
            Util.PopularLista(listaInsercao, quantidade);
            Util.PopularLista(listaSort, quantidade);

            sw.Start();
            Ordenacao.Bolha(listaBolha);
            sw.Stop();
            Util.ExibirTempo(sw, "Ordenando por bolha");
            sw.Reset();

            sw.Start();
            Ordenacao.Selecao(listaSelecao);
            sw.Stop();
            Util.ExibirTempo(sw, "Ordenando por seleção");
            sw.Reset();

            sw.Start();
            Ordenacao.Insercao(listaInsercao);
            sw.Stop();
            Util.ExibirTempo(sw, "Exibindo por inserção");
            sw.Reset();


            Util.ExibirLista(listaBolha);
            Util.ExibirTempo(sw, "sei la");
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
    }
}
