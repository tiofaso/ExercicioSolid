abstract class Funcionarios implements AdminFunc {
    private double salario;
    private String nome;
    private String cpf;
    private int numRegistro;
    private String lotacao;

    public Funcionarios(double salario, String nome, String cpf, int numRegistro, String lotacao) {
        this.salario = salario;
        this.nome = nome;
        this.cpf = cpf;
        this.numRegistro = numRegistro;
        this.lotacao = lotacao;
    }

    //Salário - início
    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    //Salario -fim

    //Nome - início

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //Nome - fim

    //CPF - início

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    //CPF - fim

    //Número de registro - início

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }
    //Número de registro - fim

    //Lotação - início
    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }

    @Override
    public void aumentaSalario(String cargo, double salario) {

    }
}
