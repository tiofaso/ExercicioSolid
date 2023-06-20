public class Professores extends Funcionarios implements AdminFunc {
    private String turma;
    public Professores(double salario, String nome, String cpf, int numRegistro, String lotacao) {
        super(salario, nome, cpf, numRegistro, lotacao);
    }


    public void adicionaTurma() {
    }

}
