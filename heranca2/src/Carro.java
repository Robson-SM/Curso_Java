public class Carro extends Veiculo{

    private String marca;
    public Carro (){}
    public Carro (String tipoDeCombustivel, int porcentagemDeCombustivelNoTanque, String marca){

        super(tipoDeCombustivel,porcentagemDeCombustivelNoTanque);
        this.marca = marca;
    }
}
