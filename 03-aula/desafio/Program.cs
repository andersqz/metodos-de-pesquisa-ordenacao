

using System.Diagnostics;
using desafio.Models;
using desafio.Repositories;
using desafio.Views;

public class Program
{
    static void Main(string[] args)
    {
        List<int> listaBolha = new();
        List<int> listaSelecao = new();
        List<int> listaInsercao = new();

        Stopwatch sw = new();
        int quantidade;

        try
        {
            View.ExibeMsg("Quantos numeros deseja trabalhar? ");
            quantidade = int.Parse(Console.ReadLine()!);

            Repository.PopularLista(listaBolha, quantidade);
            Repository.PopularLista(listaSelecao, quantidade);
            Repository.PopularLista(listaInsercao, quantidade);

            sw.Start();
            Ordenacao.Bolha(listaBolha);
            sw.Stop();
            View.ExibirTempo(sw, "Ordenado por bolha");
            sw.Reset();

            sw.Start();
            Ordenacao.Selecao(listaSelecao);
            sw.Stop();
            View.ExibirTempo(sw, "Ordenado por selecao");
            sw.Reset();

            sw.Start();
            Ordenacao.Insercao(listaInsercao);
            sw.Stop();
            View.ExibirTempo(sw, "Ordenado por insercao");
            sw.Reset();
        } 
        catch (Exception e)
        {
            System.Console.WriteLine(e.Message);
        }
    }
}