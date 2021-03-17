package classes;

public class Data {

    protected int dia;
    private int mes;
    private int ano;

    public Data() throws Exception {
    }

    public Data(int dia, int mes, int ano) throws Exception {
        this.dia = dia;
        if (dia <= 0 || dia > 31) {
            throw new Exception("Dia Inválido - Digite Novamente");
        }
        this.mes = mes;
        if (mes <= 0 || mes > 12) {
            throw new Exception("Mês inválido - Digite Novamente");
        }
        this.ano = ano;
        if (ano <= 1900) {
            throw new Exception("Ano inválido - Digite Novamente");
        }
    }

    public String getDataAdmissao() {
        return dia + " / " + mes + " / " + ano;
    }

    public void setDataAdmissão(int dia, int mes, int ano) throws Exception {

        this.dia = dia;
        if (dia <= 0 || dia > 31) {
            throw new Exception("Dia Inválido - Digite Novamente");
        }
        this.mes = mes;
        if (mes <= 0 || mes > 12) {
            throw new Exception("Mês inválido - Digite Novamente");
        }
        this.ano = ano;
        if (ano <= 1900) {
            throw new Exception("Ano inválido - Digite Novamente");
        }
    }

    public int getDia() {

        return dia;
    }

    public void setDia(int dia) throws Exception {
        if (dia <= 0 || dia > 31) {
            throw new Exception("Dia Inválido - Digite Novamente");
        }
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) throws Exception {

        if (mes <= 0 || mes > 12) {
            throw new Exception("Mês inválido - Digite Novamente");
        }
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) throws Exception {
        if (ano <= 1900) {
            throw new Exception("Ano inválido - Digite Novamente");
        }
        this.ano = ano;
    }

}
