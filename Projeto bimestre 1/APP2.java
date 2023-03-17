public class App{
    
    public static void main(String args[]){
        //args[0] = quantidade de dias 
        //args[1,3,5,...] = quantidade de grupos
        //args[2,4,6,...] = quantidade de alunos
        
        
        // variaveis
        int numeroGrupos = 0;
        int numeroAlunos = 0;
        int menorGrupo = 0;
        int dia = 1;
        
                
        //testa de a quantidade de dados por dia esta correta
        if(Integer.parseInt(args[0]) == (args.length - 1)/2){
            //para cada dia
            for (int i=1; i<args.length; i+=2){

                numeroGrupos = Integer.parseInt(args[i]);
                numeroAlunos = Integer.parseInt(args[i+1]);

                //imprime o dia 
                System.out.printf("Dia %d \n",dia);
                dia++;

                //testa se o numero de alunos é par
                if(numeroAlunos%2==1){
                    System.out.printf("numero de alunos deve ser par");
                }else{

                    //calcula o menor grupo
                    menorGrupo = ((numeroAlunos/numeroGrupos)-numeroGrupos)+1;
                    
                    //testa se a compatibilidade de alunos e grupos existe
                    if(menorGrupo%2==1){
                        System.out.printf("Nao existe numeros pares consecutivos que formen %d grupos de %d alunos",
                        numeroGrupos,numeroAlunos);
                    }else{
                        //imprime os grupos
                        for(int i2=0;i2<numeroGrupos;i2++){
                            System.out.printf("%d ",menorGrupo+(i2*2));
                        }   
                    }
                }
                System.out.println("\n");
            }
        }else{
            System.out.printf("!!!inconsistencia de dados por dia");
        }
    }
}