using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Net.WebSockets;
using System.Threading.Tasks;

namespace desafio.Views
{
    public class View
    {
        public static void ExibirLista(List<int> lista)
        {
            foreach (int item in lista)
            {
                System.Console.WriteLine(item);
            }
        } 

        public static void ExibirTempo(Stopwatch sw, string frase)
        {
            System.Console.WriteLine($"{frase} (ms): {sw.ElapsedMilliseconds}");
        }

        public static void ExibeMsg(string msg)
        {
            System.Console.WriteLine(msg);
        }
    }
}