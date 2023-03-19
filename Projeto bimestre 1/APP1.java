/* *******************************************************************
 * Colegio Técnico Antônio Teixeira Fernandes (Univap)
 * Curso Técnico em Informática - Data de Entrega: 20/03/2023
 * Autores do Projeto: Rafael Giordano
 *                     Paulo Renato
 * Turma: 3X  Disciplina: Programação - II
 * Avaliação parcial referente ao 1 - Bimestre
 * Observação: <colocar se houver>
 * 
 * APP1.java
 * ******************************************************************/

class App1{
        
        public static void main(String args[])
        {
                int anoNasc = 0;
                int sexo = 0;
                int procedencia = 0;
                
                float CasosMenor21 = 0;
                int totalCasos = 0;
                float casosMulher = 0;
                float casosHomem = 0;
                int casosInterior = 0;
                int casosMaior60 = 0;


                float porcentagemCasos = 0;


               for( int x = 0; x <= args.length-1; x+=3)
               {
                        totalCasos++;
                        anoNasc = Integer.parseInt(args[x]);
                        sexo = Integer.parseInt(args[x+1]);
                        procedencia = Integer.parseInt(args[x+2]);

                        if(2023-anoNasc<21)CasosMenor21++;
                        if(sexo == 2)casosMulher++;
                        if(sexo == 1)casosHomem++;
                        if(procedencia==1)casosInterior++;
                        if(2023-anoNasc>60)casosMaior60++;

                        System.out.printf("----\nAno de nascimento: %d, Sexo: %d, Procedencia: %d \n",anoNasc, sexo, procedencia);
               }
        

                porcentagemCasos = (CasosMenor21/totalCasos)*100;
                

                System.out.printf("Total de casos = %d\n----\n",totalCasos);
                System.out.printf("Porcentagem de casos menores de 21 anos = %1.2f%%\n----\n",porcentagemCasos);
                System.out.printf("Casos com mulheres = %.0f\n----\n",casosMulher);
                System.out.printf("Casos no interior = %d\n----\n",casosInterior);
                casosMulher = (casosMulher/totalCasos);
                casosHomem = (casosHomem/totalCasos);
                if(casosMaior60>0){
                        System.out.printf("Existe(m) %d caso(s) com maiores de 60 anos\n----\n",casosMaior60);
                }else{
                        System.out.printf("Nao existem casos com maiores de 60 anos\n----\n");
                

                }
                System.out.printf("Media de casos com mulheres = %1.0f\n----\n",casosMulher);
                System.out.printf("Media de casos com homens = %1.0f\n----\n",casosHomem);
                System.out.printf("Porcentagem de casos com mulheres = %1.2f%%\n----\n",casosMulher*100);
                System.out.printf("Porcentagem de casos com homens = %1.2f%%\n----\n",casosHomem*100);

        }       
}




 class App2{
    
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