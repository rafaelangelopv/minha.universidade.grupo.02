public class Professor extends Pessoa {

    private String centro;
    public String nome;

    // Construtor
    public Professor(String cpf, String nome, int idade, String centro) {
        super(cpf, nome, idade);
        this.centro = centro;
    }

    // Getters e Setters para centro

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    // Método darAula
    public void darAula() {
        System.out.println("Professor " + nome + " está dando aula.");
    }
}