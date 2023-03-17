class DETRAN{
        
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
                float mediaCasosMulher = 0;


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

                        System.out.printf("Ano de nascimento: %d, Sexo: %d, Procedencia: %d \n",anoNasc, sexo, procedencia);
               }
        

                porcentagemCasos = (CasosMenor21/totalCasos)*100;
                

                System.out.printf("Total de casos = %d\n",totalCasos);
                System.out.printf("Porcentagem de casos menores de 21 anos = %1.2f%%\n",porcentagemCasos);
                System.out.printf("Casos com mulheres = %.0f\n",casosMulher);
                System.out.printf("Casos no interior = %d\n",casosInterior);
                casosMulher = (casosMulher/totalCasos);
                casosHomem = (casosHomem/totalCasos);
                if(casosMaior60>0){
                        System.out.printf("Existe(m) %d caso(s) com maiores de 60 anos\n",casosMaior60);
                }else{
                        System.out.printf("Nao existem casos com maiores de 60 anos\n");
                

                }
                System.out.printf("Media de casos com mulheres = %1.0f\n",casosMulher);
                System.out.printf("Media de casos com homens = %1.0f\n",casosHomem);
                System.out.printf("Porcentagem de casos com mulheres = %1.2f%%\n",casosMulher*100);
                System.out.printf("Porcentagem de casos com homens = %1.2f%%\n",casosHomem*100);

        }       
}