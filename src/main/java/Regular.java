public class Regular extends Aluno {

    // Construtor
    public Regular(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade, matricula);
    }

    // Sobreposição do método pagarMensalidade
    @Override
    public void pagarMensalidade() {
        super.pagarMensalidade(); // Chamada do método da classe base
    }
}