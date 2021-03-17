
package classes;

public class Motorista extends Funcionario{
    
    private String numeroCNH ;  

    public Motorista() throws Exception {
        
    }

    public Motorista(String numeroCNH, String nome,String funcao, int dia, int mes, int ano, float horaSalario) throws Exception {
        super(nome,funcao, dia, mes, ano, horaSalario);
        this.numeroCNH = numeroCNH;
    }

    public String getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(String numeroCNH) {
        this.numeroCNH = numeroCNH;
    }
    
    @Override
    public float calcularSalario(int quantDia, int quantHoras) throws Exception {
        float salario = 0;
        float diarias = quantDia * 25;
        salario = (this.horaSalario * quantHoras * quantDia) + diarias;
        return salario;
    }

    @Override
    public String realizarTrabalho() throws Exception {
        return "Levar o médico ao hospital e o engenheiro para a obra";
    }
    
    
    
}
