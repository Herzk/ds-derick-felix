import java.util.Date;
public class Pessoa {
    public String nome;
    public String cpf;
    public Date dataNascimento;
    public Pessoa(String _nome, String _cpf, Date _dataNascimento){
        this.nome = _nome;
        this.cpf = _cpf;
        this.dataNascimento = _dataNascimento;
    }
    public double tirarCopias(int quantidade){
        return 0.1*quantidade;
    }
}