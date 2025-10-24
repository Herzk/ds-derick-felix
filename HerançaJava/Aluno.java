import java.util.Date;
public class Aluno extends Pessoa{
    public Aluno(String _nome, String _cpf, Date _dataNascimento){
        super(_nome, _cpf, _dataNascimento);
    }
    public String matricula;
    public double tirarCopias(int quantidade){
        return 0.07*quantidade;
    }
}