// public todo programa pode acessar a variável/ atributo
// protected somente o pacote (coleção de classes) pode acessar a variável/atributo
// private somete a classe tem acesso a variavel/atributo
public class Lutador {
    String nome;
    float peso;
    int idade;

    public Lutador(){}

    public Lutador(String nome, float peso, int idade){

        this.nome = nome;
        this.peso = peso;
        this.idade = idade;

    }

    public void setIdade(int idade){
        if(idade>=0){
            this.idade = idade;

        }else{
            System.out.println("Idade inválida");

    }

    }
    public int getIdade(){
        return this.idade;
    }
}

