using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Projeto.View
{
    public class Exibicao
    {
        public static void Exibir(List<int> lista, string frase)
        {
            Console.WriteLine(frase);

            foreach (Object item in lista)
            {
                Console.WriteLine(item);
            }

            Console.WriteLine("-------------------------------");
            Console.WriteLine("Total de registros: " + lista.Count);
        }

        public static void ExibirTempoExecucao(int rotina, double tempoMs)
        {
            Console.WriteLine($"Tempo (ms) rotina {rotina}: {tempoMs}");
        }
    }
}