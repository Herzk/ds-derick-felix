import java.util.Date;
public class Professor extends Pessoa{
    public Professor(String _nome, String _cpf, Date _dataNascimento){
        super(_nome, _cpf, _dataNascimento);
    }
    public double salario;
    public String disciplina;
}
