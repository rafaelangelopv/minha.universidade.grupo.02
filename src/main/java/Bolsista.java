public class Bolsista extends Aluno {

    // Construtor
    public Bolsista(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade, matricula);
    }

    // Sobreposição do método pagarMensalidade
    public void pagarMensalidade() {
        System.out.println("O Aluno " + nome + " é Bolsista. Tem bolsa e não paga mensalidade.");
    }
}