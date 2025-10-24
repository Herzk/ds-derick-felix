import java.util.Date;
public class EscolaMain {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno("Derick Santos Felix", "471.126.078-17", new Date());
        Professor professor1 = new Professor("Roberto Silva", "238.876.205-26", new Date());
        Funcionario funcionario1 = new Funcionario("Emerson Sales da Cruz", "037.306.698-23", new Date());
        System.out.print("Aluno\nNome: "+aluno1.nome+"\nCpf: "+aluno1.cpf+"\nData de Nascimento: :"+aluno1.dataNascimento.toString()+"\nValor de 100 cópias: "+aluno1.tirarCopias(100));
        System.out.print("\n\nProfessor\nNome: "+professor1.nome+"\nCpf: "+professor1.cpf+"\nData de Nascimento: :"+professor1.dataNascimento.toString()+"\nValor de 100 cópias: "+professor1.tirarCopias(100));
        System.out.print("\n\nFuncionário\nNome: "+funcionario1.nome+"\nCpf: "+funcionario1.cpf+"\nData de Nascimento: :"+funcionario1.dataNascimento.toString()+"\nValor de 100 cópias: "+funcionario1.tirarCopias(100));
    }
}
