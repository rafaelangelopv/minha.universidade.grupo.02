public class Disciplina {

    private String codigo;
    private String nome;
    private int semestre;

    // Construtor
    public Disciplina(String codigo, String nome, int semestre) {
        this.codigo = codigo;
        this.nome = nome;
        this.semestre = semestre;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getSemestre() {
        return semestre;
    }

    // Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}
