class Motocicleta extends Veiculo{
    
    Boolean possuiPartidaEletrica;

    Motocicleta(String marca, String modelo, int ano, Boolean possuiPartidaEletrica){
        super(marca, modelo, ano);
        this.possuiPartidaEletrica = possuiPartidaEletrica;
    }

    public void display(){
        System.out.printf("Marca: %s \nModelo: %s \nAno: %d \nPartida eletrica: %b \n", this.marca, this.modelo, this.ano, this.possuiPartidaEletrica);
    }

}
