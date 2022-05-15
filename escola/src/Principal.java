public class Principal {

    // escrever main e apertar crtl+espaço
    // ao escrever sout e depois enter
    public static void main(String[] args){

    Aluno aluno1 = new Aluno();
    aluno1.nome = "Claudia";
    aluno1.idade = 28;
    aluno1.nota = 10;

    Aluno aluno2 = new Aluno();
    aluno2.nome = "Robson";
    aluno2.idade = 36;
    aluno2.nota = 10;

    Aluno aluno3 = new Aluno();
    aluno3.nome = "Fernando";
    aluno3.idade = 30;
    aluno3.nota = 10;

    Aluno aluno4 = new Aluno();
    aluno4.nome = "Rhuandro";
    aluno4.idade = 34;
    aluno4.nota = 10;

    Aluno aluno5 = new Aluno();
    aluno5.nome = "Wallace";
    aluno5.idade = 23;
    aluno5.nota = 10;

    Professor professor = new Professor();
    professor.nome = "Matues";
    professor.idade = 24;
    professor.disciplina = "Programação Orientada a Objetos";

    Disciplina disciplina = new Disciplina();
    disciplina.nome = "Programação Orientada a Objetos";
    disciplina.alunos[0] = aluno1;
    disciplina.alunos[1] = aluno2;
    disciplina.alunos[2] = aluno3;
    disciplina.alunos[3] = aluno4;
    disciplina.alunos[4] = aluno5;


    }

}
