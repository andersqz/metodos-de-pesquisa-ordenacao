using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;

using Projeto.Model;
using Projeto.View;

namespace Projeto.Controller
{
    public class ListaController
    {
        public void ExecutarProcessamento()
        {
            long tempoInicio, tempoFim;
            List<int> listaAleatoria = new();
            List<int> listaSequencial = new();


            // rotina 1
            tempoInicio = Stopwatch.GetTimestamp();
            Utilidade.PopularLista(listaAleatoria, 100000, 100, 100000, true);
            tempoFim = Stopwatch.GetTimestamp();

            double tempoMs = (tempoFim - tempoInicio) * 1000.0 / Stopwatch.Frequency;
            Exibicao.ExibirTempoExecucao(1, tempoMs);

            // rotina 2
            tempoInicio = Stopwatch.GetTimestamp();
            Utilidade.PopularLista(listaSequencial, 100000, 1, 100000, false);
            tempoFim = Stopwatch.GetTimestamp();

            double tempoMs2 = (tempoFim - tempoInicio) * 1000.0 / Stopwatch.Frequency;
            Exibicao.ExibirTempoExecucao(2, tempoMs2);

            // exibição das listas
            //Exibicao.Exibir(listaAleatoria, "Lista aleatoria: ");
        }
    }
}