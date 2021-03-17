package classes;

import javax.swing.JOptionPane;

public class StartFuncionarios {

    public static void mostraDadosFuncionario(Funcionario objeto) throws Exception {
        System.out.println(" ---------- Dados do Funcionário ---------");
        System.out.println("Nome:                       " + objeto.getNome());
        System.out.println("Função:                     " + objeto.getFuncao());        
        System.out.println("Função a realizar           " + objeto.realizarTrabalho());
        System.out.println("Data de admissão            " + objeto.getAdmissao().getDataAdmissao());
        System.out.println("Valor da horaSalario   -->  R$ " + objeto.getHoraSalario());

    }

    public static void main(String[] args) {
        try {
            Medico clinico = new Medico();
            clinico.setNome("Rogério Tadeu dos Reis");
            clinico.setFuncao("Clínico Geral");
            clinico.setNumeroCRM("258-8");
            clinico.setSalario(50.0f);
            clinico.setAdmissao(new Data(20, 04, 2020));           
            
            Engenheiro engcivil = new Engenheiro("9876", "Fabrício de alcantara souza Bril", "Engenheiro Civil", 21, 04, 2020, 30.0f);
            Motorista motorista = new Motorista("321456987-SP", "João Ricardo de Carvalho", "Motorista", 22, 04, 2020, 20.0f);
            Medico anestesista = new Medico("Fabrício Alves", "Anestesista", new Data(05, 04, 2020), 25.0f, "258-5");

            mostraDadosFuncionario(clinico);
            System.out.println("Nùmero do CRM          -->  " + clinico.getNumeroCRM());
            System.out.println("Salário Mensal         -->  R$ " + clinico.calcularSalario(20, 8) + "\n\n");
            mostraDadosFuncionario(engcivil);
            System.out.println("Salário Mensal         -->  R$ " + engcivil.calcularSalario(20, 8) + "\n\n");
            mostraDadosFuncionario(motorista);
            System.out.println("Salário Mensal         -->  R$ " + motorista.calcularSalario(20, 8) + "\n\n");
            mostraDadosFuncionario(anestesista);
            System.out.println("Salário Mensal         -->  R$ " + anestesista.calcularSalario(20, 8) + "\n\n");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }
}
