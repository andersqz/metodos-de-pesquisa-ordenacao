

using System.Runtime.CompilerServices;

public class Program
{
    private static readonly ProcessoService _service = new();
    private static readonly ProcessoView _view = new();

    public static void Main(string[] args)
    {

        ProcessoController controller = new(_service, _view);
        controller.IniciarSistema();
    }
}