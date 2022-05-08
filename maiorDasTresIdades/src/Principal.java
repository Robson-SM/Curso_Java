import java.util.Scanner;

public class Principal {

    public static int retornaMaiorIdade(int idade1, int idade2, int idade3){
        if(idade1 > idade2 && idade1 > idade2){
            return idade1;
          //  System.out.println("A idade 1 é a maior!");

        }else if(idade2 > idade1 && idade2> idade3){
            return idade2;
            //System.out.println("A idade 2 é a maior!");

        }else{
            return idade3;
            //System.out.println("A idade 3 é a maior!");

        }

    };

    public static void main(String[] args){
      int idade1;
      int idade2;
      int idade3;

      Scanner scan = new Scanner(System.in);

      System.out.println("Digite a primeira idade: ");
      idade1 = scan.nextInt();

      System.out.println("Digite a segunda idade: ");
      idade2 = scan.nextInt();

      System.out.println("Digite a terceira idade: ");
      idade3 = scan.nextInt();

      int maiorIdade = retornaMaiorIdade(idade1, idade2, idade3);
      System.out.println(maiorIdade);




    }

}
