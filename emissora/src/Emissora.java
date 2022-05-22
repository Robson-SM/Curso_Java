public class Emissora {
    Programa[] listaDeProgramas = new Programa[4];

    void encontroProgramaMaisPopular(){

        Programa programaTemporario = listaDeProgramas[0];

        for(int contador=1; contador<4; contador++){
            if(listaDeProgramas[contador].pontosDeAudiencia > programaTemporario.pontosDeAudiencia){
                programaTemporario = listaDeProgramas[contador];

            }



        }
        System.out.printf("O programa mais popular é o : " + programaTemporario.nome);
    }

}
