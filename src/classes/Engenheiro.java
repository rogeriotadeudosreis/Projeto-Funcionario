
package classes;

public class Engenheiro extends Funcionario{
    
    private String numeroCREA;

    public Engenheiro() throws Exception {
       
    }

    public Engenheiro(String numeroCREA, String nome,String funcao, int dia, int mes, int ano, float horaSalario) throws Exception {
        super(nome,funcao, dia, mes, ano, horaSalario);
        this.numeroCREA = numeroCREA;
    }

    public String getNumeroCREA() {
        return numeroCREA;
    }

    public void setNumeroCREA(String numeroCREA) {
        this.numeroCREA = numeroCREA;
    }  

    @Override
    public float calcularSalario(int dia, int quantHoras) throws Exception {
        float salario = 0;
        salario = this.horaSalario * quantHoras * dia;
        return salario;
    }

    @Override
    public String realizarTrabalho() throws Exception {
        return "Administrar as obras dos apartamentos na Avenida Paulista";
    }
    
    
}
