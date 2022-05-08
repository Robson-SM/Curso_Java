public class Principal {
        public static int soma(int valor1, int valor2) {
            return valor1 + valor2;
        }
        public static int subratacao(int valor1, int valor2) {
            return valor1 - valor2;
        }
        public static int multiplicacao(int valor1, int valor2) {
            return valor1 * valor2;
        }
        public static int divisao(int valor1, int valor2){
            return valor1/valor2;

            // operador ternário serve para retorno e condição
            // return (valor2==0) ? 0: valor1/valor2;

            if(valor2==0){
                // ao escrever soup e teclar tab já escreve o System como abaixo
                System.out.printf("Impossível dividir por zero...");
                return 0;


            }
            // criar if para mostrar usuário que não pode dividir por zero


        }

        public static void main(String[] args){


        }

}
