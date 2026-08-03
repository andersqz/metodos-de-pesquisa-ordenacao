

public class JogadorModel {
    
    private String nome;
    private String time;
    private String nacionalidade;

    public JogadorModel() {}

    public JogadorModel(String nome, String time, String nacionalidade) {
        this.nome = nome;
        this.time = time;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "Nome: [" + nome + "] Time: [" + time + "] Nacionalidade: [" + nacionalidade + "].";
    }
    
}
