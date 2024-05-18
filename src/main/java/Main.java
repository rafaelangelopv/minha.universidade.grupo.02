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

/*        // Simulando um dia na escola
        System.out.println("\n");
        System.out.println("==================== Início do dia na escola =====================");

        // Visitantes chegando na escola
        System.out.println("\n");
        System.out.println("Visitante " + visitante1.getNome() + " chegou na escola.");
        System.out.println("Visitante " + visitante2.getNome() + " chegou na escola.");

        // Professor dando aula
        System.out.println("\n");
        System.out.println("Professor " + professor.getNome() + " está dando aula de " + disciplina1.getNome() + " na turma T1.");

        // Alunos pagando a mensalidade (exceto o bolsista)
        System.out.println("\n");
        System.out.println("Aluno " + alunoRegular1.getNome() + " pagou a mensalidade.");
        alunoRegular2.pagarMensalidade(); // Aluno regular paga a mensalidade

        // Bolsista recebendo bolsa
        System.out.println("\n");
        System.out.println("Aluno " + alunoBolsista.getNome() + " recebeu sua bolsa.");

        // Visitantes saindo da escola
        System.out.println("\n");
        System.out.println("Visitante " + visitante1.getNome() + " saiu da escola. Volte sempre!");
        System.out.println("Visitante " + visitante2.getNome() + " saiu da escola. Volte sempre!");

        // Professor indo embora
        System.out.println("\n");
        System.out.println("Professor " + professor.getNome() + " do departamento de " + professor.getCentro() + " concluiu a aula e está indo embora da escola.");

        // Alunos indo embora
        System.out.println("\n");
        System.out.println("Alunos indo embora da escola:");
        for (Aluno aluno : turma1.getAlunos()) {
            System.out.println(" - " + aluno.getNome());
        }
        for (Aluno aluno : turma2.getAlunos()) {
            System.out.println(" - " + aluno.getNome());
        }
        for (Aluno aluno : turma3.getAlunos()) {
            System.out.println(" - " + aluno.getNome());
        }

        System.out.println("\n");
        System.out.println("==================== Fim do dia na escola =====================");
        
        // Imprimindo informações de cada turma
        System.out.println("\n");
        System.out.println("==================== Informações das turmas =====================");
        imprimirInformacaoTurma(turma1);
        imprimirInformacaoTurma(turma2);
        imprimirInformacaoTurma(turma3);

    }
    private static void imprimirInformacaoTurma(Turma turma) {
        System.out.println("\n");
        System.out.println("Turma: " + turma.getCodigo());
        System.out.println("Professor: " + turma.getProfessor().getNome());
        System.out.println("Disciplina: " + turma.getDisciplina().getNome());
        System.out.println("Alunos:");
        for (Aluno aluno : turma.getAlunos()) {
            System.out.println(" - " + aluno.getNome());
        }*/
    }
}
