import java.util.Date;
public class Funcionario extends Pessoa{
    public Funcionario(String _nome, String _cpf, Date _dataNascimento){
        super(_nome, _cpf, _dataNascimento);
    }
    public double salario;
    public String cargo;
    public Date dataAdmissao;
}
