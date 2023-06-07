class Aluno {
    private String nome;
    private int RA;
    private int anoNasc;
    private String sexo;    

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setRA(int RA){
        this.RA = RA;
    }
    public void setAnoNasc(int anoNasc){
        this.anoNasc = anoNasc;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public String getNome(){
        return this.nome;
    }
    public int getRA(){
        return this.RA;
    }
        public int getAnoNasc(){
        return this.anoNasc;
    }
    public String getSexo(){
        return this.sexo;
    }

}
