public class Aluno extends Pessoa {

    private String matricula;

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

    // Método pagarMensalidade (VERIFICAR)
    public void pagarMensalidade() {
        System.out.println("Este aluno: " + nome + ", pagou a mensalidade.");
    }

    /* Sobrescrita do método toString. Ele é chamado automaticamente.
    Serve para obter uma representação String  de um objeto. Aqui ele
    é usado para listar o nome dos alunos na lista de alunos criada na classe Turma*/
    @Override
    public String toString(){
        return nome;
    }
}
