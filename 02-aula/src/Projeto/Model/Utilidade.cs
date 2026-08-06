using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Projeto.Model
{
    public class Utilidade
    {
        public static void PopularLista(List<int> lista, long quantidadesNumeros, int inicio, int fim, bool aleatorio)
        {
            Random gerador = new();

            if (aleatorio)
            {
                for (long i = 0; i < quantidadesNumeros; i++)
                {
                    lista.Add(gerador.Next(inicio, fim));
                }
            }
            else
            {
                for (long i = 0; i < quantidadesNumeros; i++)
                {
                    lista.Add((int) (inicio + i));
                }
            }
        }
    }
}