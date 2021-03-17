package classes;

public abstract class Funcionario {

    protected String nome = "";
    protected String funcao = "";
    protected Data admissao = null;
    protected float horaSalario = 0;

    public Funcionario() throws Exception {
        if (this.equals("")) {
            throw new Exception("O campo nome não pode ser vazio");
        }

    }

    public Funcionario(String nome,String funcao, int dia, int mes, int ano, float horaSalario) throws Exception {
        if (this.equals("")) {
            throw new Exception("O campo nome não pode ser vazio");
        }
        this.nome = nome;
        this.funcao = funcao;
        this.admissao = new Data(dia, mes, ano);
        this.horaSalario = horaSalario;
        if (horaSalario <= 0) {
            throw new Exception("O salário informado é inválido - Digite novamente");
        }

    }
    
    public Funcionario(String nome, String funcao, Data admissao, float horaSalario)throws Exception{
        if (this.equals("")) {
            throw new Exception("O campo nome não pode ser vazio");
        }
        this.nome = nome;
        this.funcao = funcao;        
        this.admissao = new Data(admissao.getDia(), admissao.getMes(), admissao.getAno());
        this.horaSalario = horaSalario;
        if (horaSalario <= 0) {
            throw new Exception("A horaSalário informada é inválido - Digite novamente");
        }
    }

    public abstract float calcularSalario(int dia, int quantHoras) throws Exception;

    public abstract String realizarTrabalho() throws Exception;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome)throws Exception {
        if (nome.equals("")) {
            throw new Exception("O campo nome não pode ser vazio");
        }
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }   

    public Data getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Data admissao) {
        this.admissao = admissao;
    }

    public float getHoraSalario() {
        return horaSalario;
    }

    public void setSalario(float horaSalario)throws Exception {
        if (horaSalario <= 0) {
            throw new Exception("O salário informado é inválido - Digite novamente");
        }
        this.horaSalario = horaSalario;
    }

}
