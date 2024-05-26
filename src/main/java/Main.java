public class Main {
    public static void main(String[] args) {

        // Criação das disciplinas
        Disciplina disciplina1 = new Disciplina("123", "Lógica de Programação", 1);
        Disciplina disciplina2 = new Disciplina("456", "Fundamentos de JavaScript", 2);
        Disciplina disciplina3 = new Disciplina("789", "Fundamentos de Java", 3);

        // Criação dos alunos (2 regulares e 1 bolsista)
        Regular alunoRegular1 = new Regular("22222222200", "Isaias", 30, "MA123");
        Regular alunoRegular2 = new Regular("11111111100", "Maria", 25, "MA456");
        Bolsista alunoBolsista = new Bolsista("33333333300", "Lucas", 30, "MA789");

        // Criação do professor
        Professor professor = new Professor("77777777700", "André", 40, "Departamento de Computação");

        // Criação dos visitantes
        Visitante visitante1 = new Visitante("55555555500", "Esther", 35);
        Visitante visitante2 = new Visitante("88888888800", "Rafaela", 28);

        // Criação das turmas
        Turma turma1 = new Turma("T1", disciplina1, professor);
        turma1.adicionarAluno(alunoRegular1);
        turma1.adicionarAluno(alunoRegular2);
        turma1.adicionarAluno(alunoBolsista);
        turma1.status();

        Turma turma2 = new Turma("T2", disciplina2, professor);
        turma2.adicionarAluno(alunoRegular1);
        turma2.adicionarAluno(alunoRegular2);
        turma2.adicionarAluno(alunoBolsista);
        turma2.status();

        Turma turma3 = new Turma("T3", disciplina3, professor);
        turma3.adicionarAluno(alunoRegular1);
        turma3.adicionarAluno(alunoRegular2);
        turma3.adicionarAluno(alunoBolsista);
        turma3.status();
    }
}