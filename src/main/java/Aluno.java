public class Aluno extends Pessoa {

    private String matricula;
    public String nome;

    // Construtor
    public Aluno(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade);
        this.matricula = matricula;
    }

    // Getters e Setters para matricula

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Método pagarMensalidade
    public void pagarMensalidade() {
        System.out.println("Aluno " + nome + " pagou a mensalidade.");
    }
}
