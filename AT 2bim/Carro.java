class Carro extends Veiculo{
    
    int numPortas;

    Carro(String marca, String modelo, int ano, int numPortas){
        super(marca, modelo, ano);
        this.numPortas = numPortas;
    }

    public void display(){
        System.out.printf("Marca: %s \nModelo: %s \nAno: %d \nNumero de portas: %d \n", this.marca, this.modelo, this.ano, this.numPortas);
    }

}
