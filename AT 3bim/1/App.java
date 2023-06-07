import java.util.Scanner;

class App {
    public static void main(String args[]) {
        Scanner entradas = new Scanner(System.in);

        Aluno[] alunos = new Aluno[100];
        ControleAluno controle = new ControleAluno();

        int i = 0;
        while (true) {
            System.out.println("\n1-Adicionar aluno \n2-Ver dados do aluno mais velho \n3-sair");
            int resp = entradas.nextInt();

            switch (resp) {
                case 1:
                    alunos[i] = new Aluno();
                    alunos[i] = controle.setAluno(alunos[i]);
                    i += 1;
                    break;
                case 2:
                    controle.getDadosAlunoMaisVelho(alunos);
                    break;
            }

            if (resp != 1 && resp != 2) {
                break;
            }
        }

        entradas.close();
    }
}
