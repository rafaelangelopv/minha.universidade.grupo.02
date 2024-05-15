public class Bolsista extends Aluno {

    // Construtor
    public Bolsista(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade, matricula);
    }

    // Sobreposição do método pagarMensalidade
    @Override
    public void pagarMensalidade() {
        System.out.println("Bolsista " + nome + " tem bolsa e não paga mensalidade.");
    }
}