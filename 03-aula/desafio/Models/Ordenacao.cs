using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Threading.Tasks;
using desafio.Views;

namespace desafio.Models
{
    public class Ordenacao
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

            View.ExibeMsg($"Quantidades comparacoes: {qtdComparacoes}");
            View.ExibeMsg($"Quantidade trocas: {qtdTrocas}");
        }



        public static void Selecao(List<int> lista)
        {
            int posMenor;
            int tmp;
            int qtdComparacoes = 0, qtdTrocas = 0;

            for (int i = 0; i < lista.Count() - 1; i++)
            {
                posMenor = i;
                for (int j = i + 1; j < lista.Count(); j++)
                {
                    qtdComparacoes++;
                    if (lista[j] < lista[posMenor])
                    {
                        posMenor = j;
                    }
                }
                if (i != posMenor)
                {
                    qtdTrocas++;
                    tmp = lista[i];
                    lista[i] = lista[posMenor];
                    lista[posMenor] = tmp;
                }
            }
            View.ExibeMsg($"Quantidades comparacoes: {qtdComparacoes}");
            View.ExibeMsg($"Quantidade trocas: {qtdTrocas}");
        }


        public static void Insercao(List<int> lista)
        {
            int i, j;
            int tmp;
            int qtdComparacoes = 0, qtdTrocas = 0;

            for (i = 1; i < lista.Count(); i++)
            {
                tmp = lista[i];
                for (j = i - 1; j >= 0; j--)
                {
                    qtdComparacoes++;
                    if (tmp < lista[j])
                    {
                        lista[j + 1] = lista[j];
                        qtdTrocas++;
                    }
                    else break;
                }
                lista[j + 1] = tmp;
                qtdTrocas++;
            }
            View.ExibeMsg($"Quantidade comparacoes: {qtdComparacoes}");
            View.ExibeMsg($"Quantidade trocas: {qtdTrocas}");
        }
    }
}