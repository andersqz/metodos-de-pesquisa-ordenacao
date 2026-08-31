
public class ProcessoController
{
    private readonly ProcessoService _service;
    private readonly ProcessoView _view;
    private readonly List<Processo> _listaDeProcessos;


    public ProcessoController(ProcessoService service, ProcessoView view) 
    {
        _service = service;
        _view = view;
        _listaDeProcessos = new();
    }

    public void IniciarSistema()
    {
        _service.Popular(_listaDeProcessos, 4);
        _view.ExibirLista("Exibindo a lista original", _listaDeProcessos);
        _service.OrdenarBolha(_listaDeProcessos);
        _view.ExibirLista("Exibindo a lista ordenada pelo id", _listaDeProcessos);
    }
}