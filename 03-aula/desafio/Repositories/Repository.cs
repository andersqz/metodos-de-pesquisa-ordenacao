using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace desafio.Repositories
{
    public class Repository
    {
        public static void PopularLista(List<int> lista, int quantidade)
        {
            Random gerador = new Random();

            for (int i = 0; i < quantidade; i++)
            {
                lista.Add(gerador.Next(100000));
            }
        }
    }
}