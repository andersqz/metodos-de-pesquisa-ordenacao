using Projeto.Model;
using Projeto.Controller;
using Projeto.View;


namespace Projeto
{
    public class Program
    {
        static void Main(string[] args)
        {
            ListaController controller = new();

            controller.ExecutarProcessamento();
        }
    }
}