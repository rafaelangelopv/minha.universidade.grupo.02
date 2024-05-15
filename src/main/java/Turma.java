import java.util.ArrayList; // Biblioteca Java Util ArrayList
import java.util.List; // Biblioteca Java Util List

public class Turma {

    private String codigo;
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunos;

    // Construtor
    public Turma(String codigo, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    // Getters e Setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    // Método para adicionar aluno
    public void adicionarAluno(Aluno aluno) {

        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
            System.out.println("\n");
            System.out.println("Adicionando Alunos...");
            System.out.println("Aluno " + aluno.getNome() + " adicionado à turma " + codigo);
        } else {
            System.out.println("Aluno " + aluno.getNome() + " já está presente na turma " + codigo);
        }
    }
}
