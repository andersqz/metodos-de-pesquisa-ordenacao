

public class Processo : IComparable<Processo>
{
    public int Id { get; set; }
    public string Descricao { get; set; }


    public Processo(int id, string descricao)
    {
        Id = id;
        Descricao = descricao;
    }

    public override string ToString()
    {
        return $"Processo: Id =  {Id} | Descricao = {Descricao}";
    }

    public override int GetHashCode()
    {
        return Id.GetHashCode();
    }

    public override bool Equals(object obj)
    {
        if (ReferenceEquals(this, obj)) return true;
        if (obj is null) return false;
        if (GetType() != obj.GetType()) return false;

        Processo other = (Processo)obj;
        return Id == other.Id;
    }

    public int CompareTo(Processo? outro)
    {
        if (outro is null)
            return 1;

        return Id.CompareTo(outro.Id);
    }
}