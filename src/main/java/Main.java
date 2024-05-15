public class Main {
    public static void main(String[] args) {

        // Criação das disciplinas
        Disciplina disciplina1 = new Disciplina("123", "Matemática", 1);
        Disciplina disciplina2 = new Disciplina("456", "Português", 2);
        Disciplina disciplina3 = new Disciplina("789", "História", 3);

        // Criação dos alunos (2 regulares e 1 bolsista)
        Aluno alunoRegular1 = new Aluno("12345678900", "João Silva", 20, "RA123");
        Aluno alunoRegular2 = new Aluno("98765432100", "Maria Oliveira", 19, "RA456");
        Bolsista alunoBolsista = new Bolsista("00000000000", "Pedro Souza", 18, "RA789");

        // Criação do professor
        Professor professor = new Professor("11111111100", "Ana Costa", 40, "Departamento de Matemática");

        // Criação dos visitantes
        Visitante visitante1 = new Visitante("22222222200", "Carlos Pereira", 35);
        Visitante visitante2 = new Visitante("33333333300", "Bruna Araújo", 28);

        // Criação das turmas (contendo todos os alunos, o professor e 1 disciplina em cada turma)
        Turma turma1 = new Turma("T1", disciplina1, professor);
        turma1.adicionarAluno(alunoRegular1);
        turma1.adicionarAluno(alunoRegular2);
        turma1.adicionarAluno(alunoBolsista);

        Turma turma2 = new Turma("T2", disciplina2, professor);
        turma2.adicionarAluno(alunoRegular1);
        turma2.adicionarAluno(alunoBolsista);

        Turma turma3 = new Turma("T3", disciplina3, professor);
        turma3.adicionarAluno(alunoRegular2);
        turma3.adicionarAluno(alunoBolsista);

        // Simulando um dia na escola
        System.out.println("==================== Início do dia na escola =====================");

        // Visitantes chegando na escola
        System.out.println("\nVisitante " + visitante1.getNome() + " chegou na escola.");
        System.out.println("Visitante " + visitante2.getNome() + " chegou na escola.");

        // Professor dando aula
        System.out.println("\nProfessor " + professor.getNome() + " está dando aula de " + disciplina1.getNome() + " na turma T1.");

        // Alunos pagando a mensalidade (exceto o bolsista)
        System.out.println("\nAluno " + alunoRegular1.getNome() + " pagou a mensalidade.");
        alunoRegular2.pagarMensalidade(); // Aluno regular paga a mensalidade

        // Bolsista recebendo bolsa
        System.out.println("\nAluno " + alunoBolsista.getNome() + " recebeu sua bolsa.");

        // Listando alunos da turma T1
        System.out.println("\nListando alunos da turma T1:");
        turma1.listarAlunos();

        // Visitantes saindo da escola
        System.out.println("\nVisitante " + visitante1.getNome() + " saiu da escola.");
        System.out.println("Visitante " + visitante2.getNome() + " saiu da escola.");

        // Professor indo embora
        System.out.println("\nProfessor " + professor.getNome() + " está indo embora da escola.");

        // Alunos indo embora
        System.out.println("\nAlunos indo embora da escola:");
        for (Aluno aluno : turma1.getAlunos()) {
            System.out.println(" - " + aluno.getNome());
        }
        System.out.println("\n==================== Fim do dia na escola =====================");
        
        // Imprimindo informações de cada turma
        System.out.println("\n==================== Informações das turmas =====================");
        imprimirInformacaoTurma(turma1);
        imprimirInformacaoTurma(turma2);
        imprimirInformacaoTurma(turma3);

        System.out.println("\n==================== Fim do dia na escola =====================");
    }
    private static void imprimirInformacaoTurma(Turma turma) {
        System.out.println("\nTurma: " + turma.getCodigo());
        System.out.println("Professor: " + turma.getProfessor().getNome());
        System.out.println("Disciplina: " + turma.getDisciplina().getNome());
        System.out.println("Alunos:");
        for (Aluno aluno : turma.getAlunos()) {
            System.out.println(" - " + aluno.getNome());
        }
    }
}
