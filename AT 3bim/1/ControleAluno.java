import java.util.Scanner;

class ControleAluno extends Aluno {

    public Scanner entradas = new Scanner(System.in);

    public Aluno setAluno(Aluno dados) {

        System.out.println("\nDigite seu nome:");
        String nome = entradas.next();
        dados.setNome(nome);

        System.out.println("Digite seu RA:");
        int RA = entradas.nextInt();
        dados.setRA(RA);

        System.out.println("Digite seu ano de nascimento:");
        int anoNasc = entradas.nextInt();
        dados.setAnoNasc(anoNasc);

        System.out.println("Digite seu sexo:");
        String sexo = entradas.next();
        dados.setSexo(sexo);

        return dados;
    }

    public void getDadosAlunoMaisVelho(Aluno alunos[]) {
        int i = 1;
        Aluno aux = new Aluno();
        int indexAluno = 0;
        while (alunos[i] != null) {

            if (alunos[i - 1].getAnoNasc() > alunos[i].getAnoNasc()) {
                aux = alunos[i];
                indexAluno = i;
            }
            i += 1;
        }

        System.out.println("\nNome:" + alunos[indexAluno].getNome());
        System.out.println("RA:" + alunos[indexAluno].getRA());
        System.out.println("Ano Nascimento:" + alunos[indexAluno].getAnoNasc());
        System.out.println("Sexo:" + alunos[indexAluno].getSexo());

    }
}
