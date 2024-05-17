public class Professor extends Pessoa {

    public String centro;

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

    // Método para dar aula.
    public void darAula(){
        System.out.println("O professor " + nome + " dá aulas em " + centro);
    }
    @Override
    public String toString(){
        return nome;
    }
}
