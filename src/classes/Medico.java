
package classes;

public class Medico extends Funcionario {

    private String numeroCRM;

    public Medico() throws Exception {

    }

    public Medico(String nome, String funcao, int dia, int mes, int ano, float horaSalario, String numeroCRM) throws Exception {
        super(nome, funcao, dia, mes, ano, horaSalario);
        
        this.numeroCRM = numeroCRM;
    }
    
    public Medico (String nome, String funcao, Data admissao, float horaSalario, String numeroCRM) throws Exception{
        super(nome, funcao, admissao, horaSalario);
        this.numeroCRM = numeroCRM;
    }

    public void setNumeroCRM(String numeroCRM) {
        this.numeroCRM = numeroCRM;
    }

    public String getNumeroCRM() {
        return numeroCRM;
    }

    @Override
    public float calcularSalario(int dia, int quantHoras) throws Exception {
        float salario = 0;
        salario = this.horaSalario * quantHoras * dia;
        return salario;
    }

    @Override
    public String realizarTrabalho() throws Exception {
        return "Atendimento a Pacientes";
    }
    
   

}
